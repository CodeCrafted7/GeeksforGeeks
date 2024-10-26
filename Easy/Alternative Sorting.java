class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {

       int n = arr.length;
       ArrayList<Integer> ans = new ArrayList<>();
       int i=0,j=n-1;
       Arrays.sort(arr);
       for(int x=0;x<n;x++){
           if(x%2 == 1) ans.add(arr[i++]);
           else ans.add(arr[j--]);
       }
       return ans;
    }
}
