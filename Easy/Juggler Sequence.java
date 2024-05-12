

class Solution {
    static List<Integer> jugglerSequence(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(n);
        while(n!=1){
            if(n%2!=0){
                n = (int)Math.pow(n,1.5);
            }else{
                n = (int)Math.pow(n,0.5);
            }
            result.add(n);
        }
        return result;
    }
}
