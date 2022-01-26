class Solution
{
    public static int precedence(Character c)
   {
       if(c == '+' || c =='-')
       return 1;
       
       else if (c=='*'||c=='/')
       return 2;
       
       else if(c=='^')
       return 3;
       
       else
       return 0;
   }
   
   
    public static String infixToPostfix(String exp) 
    {
        
         char ch,ch2;
         int len=exp.length();
         String res="";
         
         Stack<Character> s = new Stack<>();
         int i;
         
         for(i=0;i<len;i++)
         {
             ch=exp.charAt(i);
             
            
             if(Character.isLetter(ch))
             {
                 res+=ch;
             }
             
             else if(ch=='(')
             {
                 s.push(ch);
             }
             
             else if(ch==')')
             {
                 while(!s.isEmpty() && s.peek()!='(')
                 {
                     res+=s.peek();
                     s.pop();
                 }
                 if(!s.isEmpty())
                 s.pop();
             }
             
             else if (ch =='+' || ch =='-' || ch == '/' || ch =='*' || ch=='^')
             {
                 
                 
                 while (!s.isEmpty() && precedence(s.peek())>=precedence(ch))
                 {
                     res+=s.peek();
                     s.pop();
                 }
                 s.push(ch);
             }
         }
         
         while(!s.isEmpty())
         {
             res+=s.peek();
             s.pop();
         }
         return res;
    
    } 
}