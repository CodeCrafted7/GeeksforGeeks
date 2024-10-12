import java.util.List;

class Solution {
    public List<Integer> rearrange(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            while (arr.get(i) != -1 && arr.get(i) != i) {
                swap(arr, i, arr.get(i)); 
            }
        }
        return arr;
    }

    public static void swap(List<Integer> arr, int i, int j) {
        int temp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, temp);
    }
}
