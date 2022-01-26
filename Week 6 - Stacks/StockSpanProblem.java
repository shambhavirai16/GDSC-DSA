class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
     public static int[] calculateSpan(int price[], int n)
   {
       
       Stack<Integer> st = new Stack<>();
       
       int[] ans = new int[n];
       ans[0] = 1;
       st.push(0);
       
       for(int i = 1;i<n;i++){
      
            while(st.size()>0 && price[i] >= price[st.peek()]){
              st.pop();
            }
            
            if(st.size()==0){
              ans[i] = i+1;
            }
            
            else{
              ans[i] = i - st.peek();
            }
            
            st.push(i);
        }
  
        return ans;
    }
    
}