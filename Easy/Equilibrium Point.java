class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        if(n==1)
          return 1;
         int i=0,j=0;
         long sum=0,nsum=0;
         for(i=0;i<n;i++)
         {
             sum+=arr[i];
         }
         for(j=0;j<n;j++)
         {
             sum-=arr[j];
             if(nsum==sum)
               return j+1;
             nsum+=arr[j];
         }
         return -1;
    }
}
