class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int[] left = nextGreaterLeft(heights);
        int[] right = nextGreaterRight(heights);
        int area = 0;
        
        for(int i=0; i < heights.length; i++){
            area = Math.max(area, (right[i] - left[i] - 1)*heights[i]);
        }
        
        return area;
    }
    
    public int[] nextGreaterLeft(int[] arr){
        
        int[] nge = new int[arr.length];
        nge[0] = -1;
        
        Stack<Integer> st = new Stack<>();
        st.push(0);
        
        for(int i = 1; i < arr.length; i++){
            
            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            
            if(st.size() == 0){
                nge[i] = -1;
            }
            else{
                nge[i] = st.peek();
            }
            
            st.push(i);
        }
        
        return nge;
    }
    
    public int[] nextGreaterRight(int[] arr){
        
        int[] nge = new int[arr.length];
        nge[arr.length-1] = arr.length;
        
        Stack<Integer> st = new Stack<>();
        st.push(arr.length-1);
        
        for(int i = arr.length - 2; i >= 0; i--){
            
            while(st.size() > 0 && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            
            if(st.size() == 0){
                nge[i] = arr.length;
            }
            else{
                nge[i] = st.peek();
            }
            
            st.push(i);
        }
        
        return nge;
    }
}