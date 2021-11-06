class Solution {
    public void reverseString(char[] s) {
        for(int i = 0, j = s.length - 1; i < j; i++, j--){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
    
    // driver code
    public void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        char[] s = new char[str.length()];
        
        for(int i = 0 ; i < str.length(); i++){
            s[i] = str.charAt(i);
        }
        
        reverseString(s);
        
        System.out.println(s);
    }
}