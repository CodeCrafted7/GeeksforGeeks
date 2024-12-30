
class Solution {
    public ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        
        for(int x : a){
            set.add(x);
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        for(int x : b){
            if(set.contains(x)){
                res.add(x);
                set.remove(x);
            }
        }
        return res;
    }
}
