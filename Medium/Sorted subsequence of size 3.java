
class Solution {
    
    public List<Integer> find3Numbers(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        int l[] = new int[n];
        int r[] = new int[n];
        
        l[0] = arr[0];
        for(int i=1;i<n;i++)
            l[i] = Math.min(l[i-1],arr[i]);
            
        r[n-1] = arr[n-1];
        for(int i = n-2;i>=0;i--)
            r[i] = Math.max(arr[i],r[i+1]);
            
        for(int i=1;i<=n-2;i++){
            if(l[i-1]<arr[i] && arr[i]<r[i+1]){
                ans.add(l[i-1]);
                ans.add(arr[i]);
                ans.add(r[i+1]);
                break;
            }
        }
        return ans;
    }
}
