class Solution {
    public void rotate(int[][] matrix) {
        
        int n = matrix.length;
        
        //transpose
        for(int i=0; i<n; i++){
            for(int j = i; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        int c1 = 0;
        int c2 = n - 1;
        
        //reverse the columns
        while(c1 < c2){
            for(int r=0; r < n; r++){
                int temp = matrix[r][c1];
                matrix[r][c1] = matrix[r][c2];
                matrix[r][c2] = temp;
            }
            
            c1++;
            c2--;
        }
    }
    
    
}