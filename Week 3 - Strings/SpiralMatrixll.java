class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] arr = new int[n][n];
        int total = n*n;
        int x = 1;
        int right = n-1;
        int left = 0;
        int down = n-1;
        int up = 0;
        
        while(x <= total){
            
            //rightward traversal
            for(int i= left; i <= right; i++){
                arr[up][i] = x;
                x++;
            }
            
            up++;
            
            //downward traversal
            for(int i = up; i <= down; i++){
                arr[i][right] = x;
                x++;
            }
            
            right--;
            
            if(x > total){
                break;
            }
            
            for(int i = right; i >= left; i--){
                arr[down][i] = x;
                x++;
            }
            
            down--;
            
            for(int i = down; i >= up; i--){
                arr[i][left] = x;
                x++;
            }
            
            left++;
            
        }
        
        return arr;
    }
}