package Arrays;
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        
        for(int i=0; i< nums.length; i++){
            
            if(nums[i] == target){
                
                ans[0] = i;
                
                for(int j=i; j < nums.length && nums[j] == target; j++){
                    ans[1] = j;
                }
                
                return ans;
            }
        }
        
        Arrays.fill(ans, -1);
        return ans;
    }
}