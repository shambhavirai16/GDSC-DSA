class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        
        //max 4 rotations
        int total = 4;
        
        while(total > 0){
            
            mat = rotate90(mat);
            boolean flag = true;
            
            for(int i=0; i < mat.length; i++){
                
                for(int j=0; j < mat[0].length; j++){
                    
                    if(mat[i][j] != target[i][j]){
                        flag = false;
                        break;
                    }
                }
            }
            
            if(flag){
                return true;
            }
            
            total--;
        }
        
        return false;
    }
    
    //function to rotate the matrix by 90 degrees
    public int[][] rotate90(int[][] mat){
        int[][] rot = new int[mat.length][mat[0].length];
        
        for(int i=0, k = mat.length-1; i < mat.length; i++, k--){
            for(int j=0; j < mat[0].length; j++){
                rot[j][k] = mat[i][j];
            }
        }
        
        return rot;
    }
    
    //driver code
    public void main(String[] args)throws Exception{
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] mat = new int[n][n];
        
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        
        int[][] target = new int[n][n];
        
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                target[i][j] = scn.nextInt();
            }
        }
        
        System.out.println(findRotation(mat, target));
    }
}