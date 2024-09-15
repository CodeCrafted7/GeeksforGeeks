class Solution {
    void rearrange(ArrayList<Integer> arr) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) >= 0)
                pos.add(arr.get(i));
            else
                neg.add(arr.get(i));
        }
        
        int i = 0, j = 0, k = 0;
        boolean flag = true;
        
        while (i < pos.size() && j < neg.size()) {
            if (flag) {
                arr.set(k++, pos.get(i++));
            } else {
                arr.set(k++, neg.get(j++));
            }
            flag = !flag;
        }
        
        while (i < pos.size()) {
            arr.set(k++, pos.get(i++));
        }
        
        while (j < neg.size()) {
            arr.set(k++, neg.get(j++));
        }
    }
}
