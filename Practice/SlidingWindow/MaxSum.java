package Practice.SlidingWindow;

// Given an array of integers Arr of size N and a number K. Return the maximum sum of a subarray of size K.

public class MaxSum {
    public static void main(String[] args) {
        int[] arr = {100 , 200 , 300 ,400 } ;
		
		int ans=maxSum(arr , arr.length , 2);
		
		System.out.println(ans);
    }
    static int maxSum(int[] arr , int n , int k){
	    
	    int max_sum = 0 ; 
	    
	    for(int i = 0 ; i < k ; i++){
	        max_sum+=arr[i];
	    }
	     int window_sum = max_sum ;
	     
	     for(int i = k ; i < n ; i++){
	         window_sum += arr[i]-arr[i-k];
	         max_sum =Math.max(max_sum , window_sum);
	     }
	     return max_sum ;
	}
}
