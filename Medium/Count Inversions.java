class Solution {
    
    static int inversionCount(int arr[]) {
        return mergesort(arr,0,arr.length-1);
    }
    static int mergesort(int arr[],int l,int r){
        if(l>=r)
            return 0;
        
        int mid = (l+r)/2;
        int left = mergesort(arr,l,mid);
        int right = mergesort(arr,mid+1,r);
        int m = merge(arr,l,mid,r);
        return left+ right + m;
    }
    
    static int merge(int arr[],int l,int mid,int r){
        int j = mid +1;
        int inv = 0;
        for(int i=l;i<=mid;i++){
            while(j<=r && arr[i] > arr[j])
                j++;
            inv += j - (mid+1);
        }
        Arrays.sort(arr,l,r+1);
        return inv;
    }
}
