class Solution {
    public int fib(int n) {
        
        // create storage
        int[] dp = new int[n+1];
        
        //dp[i] -> fib(i)
        
        for(int i = 0; i <= n ; i++){
            if(i == 0 || i == 1){
                dp[i] = i;
            }
            
            else{
                dp[i] = dp[i-1] + dp[i-2];
            }
        }
        
        return dp[n];
    }
}