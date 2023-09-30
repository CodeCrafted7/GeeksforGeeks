
 class Solution{
     
     static boolean isPossible(int arr[] , int n , int k , long mid){
         long wallSum = 0 ;
         long painterCount = 1 ;
         
         for(int i=0;i<n;i++){
             if(wallSum + arr[i] <= mid){
                 wallSum += arr[i] ;
             }
             else{
                 painterCount++ ;
                                  
                 wallSum = arr[i] ;
             }
             
             
                 if(painterCount > k || arr[i] > mid){
                     return false ;
                 } ;

         } ;
         
         return true ;
         
     }
     
    static long minTime(int [] arr,int n,int k){
        //code here
        
        long s = 0 ;
        long sum = 0 ;
        
        for(int i=0;i<n ; i++){
            sum+= arr[i] ;
        } ;
        
        long e = sum ;
        
        
        long ans = -1 ;
        
        while(s<=e){
            
            long  mid = (s+e)/2 ;
            
            if(isPossible(arr , n ,k , mid) == true){
                ans = mid ;
                e = mid - 1 ;
            }
            else{
                s = mid + 1 ;
            }
        } ;
        
        return ans ;
    }
}
