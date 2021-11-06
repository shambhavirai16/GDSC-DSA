class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        
        boolean flag = false;
        
        int row=0;
        int col= matrix[0].length -1;
        
        while(row< matrix.length && col>=0){
            
            if(matrix[row][col] > target){
                col--;
            }
            
            else if(matrix[row][col] < target){
                row++;
            }
            
            else{
                flag = true;
                break;
            }
        }
        
        return flag;
    }
    
    public static void Solution (String[] args) throws Exception{
        Scanner scn = new Scanner(System.in);
        
        int  m = scn.nextInt();
        int n = scn.nextInt();
        
        int a[][] = new int[m][n];
        
        for(int i=0; i<m ; i++){
            for(int j=0; j<n; j++){
                a[i][j] = scn.nextInt();
            }
        }
        
        int target = scn.nextInt();
        
        System.out.println(searchMatrix(a, target));
    }
}