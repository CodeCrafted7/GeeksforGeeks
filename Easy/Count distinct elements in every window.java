class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        int i=0,j=k-1;
        ArrayList<Integer>res=new ArrayList<>();
        while(j<arr.length)
        {
            HashSet<Integer>hs=new HashSet<>();
            for(int x=i;x<i+k;x++)
            {
                hs.add(arr[x]);
            }
            i++;
            j++;
            res.add(hs.size());
        }
        return res;
    }
}
