class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int r = 0;
        int c = matrix[0].length - 1;
        
        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return true;
            }
            
            else if(matrix[r][c] > target){
                c--;
            }
            
            else{
                r++;
            }
        }
        
        return false;
    }
    
    //driver code
    public void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] matrix = new int[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j=0; j < n; j++){
                matrix[i][j] = scn.nextInt();
            }
        }
        
        int target = scn.nextInt();
        System.out.println(searchMatrix(matrix, target));
    }
}