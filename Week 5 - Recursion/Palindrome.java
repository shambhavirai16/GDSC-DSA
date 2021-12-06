class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int d = 0; //number of digits
		    int temp = n;
		    
		    while(temp != 0){
		        temp = temp/10;
		        d++;
		    }
		    
		    int[] arr = new int[d];
		    
		    for(int i = arr.length - 1; i >= 0; i--){
		        arr[i] = n%10;
		        n = n/10;
		    }
		    
		    for(int i=0, j = arr.length - 1; i < j; i++, j--){
		        
		        if(arr[i] != arr[j]){
		            return "No";
		        }
		    }
		    
		    return "Yes";
    }
}