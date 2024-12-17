class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        int n = a.length;
        int m = b.length;
        int[] res = new int[m+n];
        int i=0,j=0,x=0;
        while(i<n && j<m){
            if(a[i]<=b[j]){
                res[x++] = a[i++];
            }else{
                res[x++] = b[j++];
            }
        }
        while(i<n){
            res[x++] = a[i++];
        }
        while(j<m){
            res[x++] = b[j++];
        }
        return res[k-1];
    }
}
