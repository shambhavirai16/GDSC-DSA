class Solution
{
    //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        Stack<Integer> stack= new Stack<Integer>();
      
        for(int i=0; i<S.length(); i++){
            char x =  S.charAt(i);
            if(x != '+' && x != '-' && x != '*' && x != '/'){
                int a = Character.getNumericValue(x);
                stack.push(a);
            }

            else {
                int a = stack.pop();
                int b = stack.pop();
                int value;
                if(x == '+'){
                    value = b+a;
                    stack.push(value);
                }   

                else if(x == '-'){
                    value = b-a;
                    stack.push(value);
                }

                else if(x == '*'){
                    value = a*b;
                    stack.push(value);
                }

                else if(x== '/'){
                value = b/a;
                stack.push(value);
                }

            }
  
        }
        
        return stack.peek();
    }
}