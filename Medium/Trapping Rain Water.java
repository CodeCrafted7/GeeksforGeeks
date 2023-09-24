
class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int leftMax[]=new int[n];
        leftMax[0]=arr[0];
        for(int i=1; i<n; i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }
        
        int rightMax[]=new int[n];
        rightMax[n-1]=arr[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);
        }
        long trappingWater=0;
        for(int i=0; i<n; i++){
            int waterlevel = Math.min(leftMax[i],rightMax[i]);
            trappingWater = trappingWater  +  waterlevel-arr[i];
        }
        return trappingWater;
    } 
}
