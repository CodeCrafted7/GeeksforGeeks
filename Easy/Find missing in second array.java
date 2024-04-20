class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        Set<Integer> s=new HashSet<>();
        
        for(int el:b)
        s.add(el);
        
        for(int el:a){
            if(!s.contains(el))
            ans.add(el);
        }
        return ans;
    }
}
