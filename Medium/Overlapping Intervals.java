class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
       
       List<int[]> ans = new ArrayList<>();
       Arrays.sort(arr,(a,b) -> a[0]-b[0]);
       
       int  s = arr[0][0], e = arr[0][1];
       
       for(int i=1;i<arr.length;i++){
           
        if(arr[i][0] <= e)
            e = Math.max(e, arr[i][1]);
        else{
           
           int a[] = new int[2];
           a[0] = s;
           a[1] = e;
           ans.add(a);
           s = arr[i][0];
           e = arr[i][1];
        }
        
       }
       int a[] = new int[2];
       a[0] = s;
       a[1] = e;
       ans.add(a);
       return ans;
    }
}
