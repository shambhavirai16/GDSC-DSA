class Solution{
    static long factorial(int N){
        
        //base case
        if(N == 0){
            return 1;
        }
        
        long fact = N * factorial(N-1);
        return fact;
    }
}