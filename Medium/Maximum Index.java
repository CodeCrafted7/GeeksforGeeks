class Solution{
    static int maxIndexDiff(int a[], int n) { 
        int min[] = new int[n];
        int mine = a[0];
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            mine = Math.min(mine , a[i]);
            min[i] = mine;
            int lo = 0 ;
            int hi = i ;
            while(lo<=hi){
                int mid = (lo+hi)/2;
                if(min[mid]<=a[i]){
                    hi = mid-1;
                }else{
                    lo = mid+1;
                }
            }
            ans = Math.max(ans , i-lo);
        }
        return ans;
    }
}
