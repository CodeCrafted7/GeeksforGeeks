
class Solution {
    public int maxDistance(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++ ){
            int x = arr[i];
            if(map.containsKey(x)){
                maxi = Math.max(maxi, (i-map.get(x)) );
            }
            else map.put(x,i);
        }
        return maxi;
    }
}
