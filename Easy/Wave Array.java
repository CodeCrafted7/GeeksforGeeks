
class Solution {
    public static void convertToWave(int n, int[] a) {
        // code here
        for(int i=0;i<n-1;i=i+2)
        swap(a,i,i+1);
    }
     public static void swap(int arr[],int i,int j)
     {
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
     }
}
        
