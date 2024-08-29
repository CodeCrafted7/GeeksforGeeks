class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        // add your code here
        HashMap<Integer,Integer> map= new HashMap<>();
        ArrayList<Integer> ans= new ArrayList<>();
        
        for(int val:arr){
             ans.add(val);
             map.put(val,map.getOrDefault(val,0)+1);
        }

        Collections.sort(ans,(a,b)->{
            int fa= map.get(a);
            int fb= map.get(b);
            if(fa==fb) return a-b;
            else return fb-fa;
        });
        
        return ans;
    }
}
