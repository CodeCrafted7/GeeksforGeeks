

class Solution {
    public List<Integer> findSplit(int[] arr) {
        List<Integer> result = new ArrayList<>();
        int n = arr.length;
        int totalSum = 0;
        
        for (int num : arr)
            totalSum += num;
        
        if (totalSum % 3 != 0) {
            result.add(-1);
            result.add(-1);
            return result;
        }
        
        int target = totalSum / 3;
        int currSum = 0;
        int first = -1, second = -1;
        
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            
            if (currSum == target && first == -1) {
                first = i;
            } else if (currSum == 2 * target && first != -1) {
                second = i;
                result.add(first);
                result.add(second);
                return result;
            }
        }
        
        result.add(-1);
        result.add(-1);
        return result;
    }
}
