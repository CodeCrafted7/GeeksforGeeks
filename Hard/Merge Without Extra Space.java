class Solution
{
    private static void sig(long arr1[],long arr2[],int n,int m)
    {
        if(arr1[n]>arr2[m]){
       long temp =arr1[n];
       arr1[n] = arr2[m];
       arr2[m] = temp;
        }
    }
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        int len = (n+m);
        int gap = (len/2)+(len%2);
        while(gap>0)
        {
            int left =0;
            int right =left+gap;
            while(right<len)
            {
                if(left<n && right>=n){
                    sig(arr1,arr2,left,right-n);
                }
                else if (left>=n)
                sig(arr2,arr2,left-n,right-n);
                
                else
                sig(arr1,arr1,left,right);
                
                left++;
                right++;
                
            }
            if(gap==1) break;
            gap = (gap/2)+(gap%2);
        }
    }
}
