
class Solution {
    public static int rotateDelete(ArrayList<Integer> arr) {
        // code here
        int n = arr.size();
        int k = 1;
        while(n > 1){
            Collections.rotate(arr, 1);
            int idx = n - k;
            if(idx < 0){
                idx = 0;
            }
            
            arr.remove(idx);
            --n;
            ++k;
        }
        return arr.get(0);
    }
}
