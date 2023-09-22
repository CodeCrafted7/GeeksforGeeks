
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
       int low=0;
       int i=0;
       int high=n-1;
       
       while(i<=high){
           if(a[i]==0){
               int temp=a[i];
               a[i]=a[low];
               a[low]=temp;
               i++;
               low++;
           }
           else if(a[i]==1){
               i++;
           }
           else{
               int temp=a[i];
               a[i]=a[high];
               a[high]=temp;
               high--;
           }
       }
       
    }
}
