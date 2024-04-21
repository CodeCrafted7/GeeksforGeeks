class Solution
{
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int x: arr1){
            set.add(x);
        }
        for(int x: arr2){
            set.add(x);
        }
        for(int x: set){
            ans.add(x);
        }
        Collections.sort(ans);
        return ans;
    }
}
