class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int count = 0;
        int j = 0;
        int ans[] = new int[n];
        
         for(int i =0;i<n;i++){
             if(arr[i] == 0)
                count++;
            else ans[j++]  = arr[i];
         }
         while(count>0){
             ans[j++] = 0;
             count--;
         }
         for(int i=0;i<ans.length;i++){
             arr[i] = ans[i];
         }
    }
}
