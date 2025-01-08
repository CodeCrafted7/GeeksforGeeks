class Solution {
    int countPairs(int arr[], int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> count : map.entrySet()) {
            int key = count.getKey();
            if (key + key == target) {
                int value = count.getValue();
                ans += (value * (value - 1)) / 2;
                if (map.size() == 1) return ans;
            } else {
                int rem = target - key;
                if (map.containsKey(rem) && rem > key) {
                    ans += count.getValue() * map.get(rem);
                }
            }
        }
        return ans;
    }

}
