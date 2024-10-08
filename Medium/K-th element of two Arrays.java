class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        if(k == n1+n2) return Math.max(arr1[n1-1],arr2[n2-1]);
        if(k == 1) return Math.min(arr1[0],arr2[0]);
        int i = 0,j = 0;
        while(i<n1 && j<n2 && k>1){
            if(arr1[i]<=arr2[j])
                i++;
            else
                j++;
            k--;
        }
        while(i<n1 && k>1){
            i++;
            k--;
        }
        while(j<n2 && k>1){
            j++;
            k--;
        }
        if(i == n1) return arr2[j];
        if(j == n2) return arr1[i];
        return Math.min(arr1[i],arr2[j]);
    }
}
