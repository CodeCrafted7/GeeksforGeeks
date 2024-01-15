class Solution
{
    public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
       HashSet<String> set = new HashSet<>();
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i=0;i<m;i++){
            String take="";
            for(int j=0;j<n;j++){
                take=take+Integer.toString(matrix[i][j]);
            }
            if(set.contains(take)){
                ans.add(i);
                
            }
            else{
                
                set.add(take);
            }
        }
     
        return ans;
    }
}
