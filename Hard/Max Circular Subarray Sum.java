class Solution{

    
    static int circularSubarraySum(int arr[], int n) {
        
        // Your code here
        int MaxSum = arr[0];
        int MaxEnd = arr[0];
        
        int MinSum = arr[0];
        int MinEnd = arr[0];
        
        int TotalSum = arr[0];
        
        for(int i = 1;i<n;i++){
            
            TotalSum += arr[i]; 
            
            MaxEnd = Math.max(MaxEnd + arr[i], arr[i]); 
            MaxSum = Math.max(MaxSum, MaxEnd);
            
            MinEnd = Math.min(MinEnd + arr[i], arr[i]); 
            MinSum = Math.min(MinSum, MinEnd);
            
        }
        int cirSum = Math.max(MaxSum,TotalSum - MinSum); 
        int Max = Integer.MIN_VALUE; 
        
    
        for(int i = 0;i<n;i++){
            if(arr[i]<0){
                Max = Math.max(Max,arr[i]);
            }else{
                return cirSum;
            }
        }
        return Max;
    }
}
