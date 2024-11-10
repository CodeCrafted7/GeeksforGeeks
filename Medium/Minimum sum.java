
class Solution {
    String minSum(int[] arr) {
        Arrays.sort(arr);
        StringBuilder result = new StringBuilder();
        int idx = arr.length - 1;
        int carry = 0;
        while (idx >= 0) {
            int sum = 0;
            if (idx == 0) {
                sum += arr[idx] + carry;
            } else {
                sum += arr[idx--] + arr[idx] + carry;
            }
            carry = sum / 10;
            result.append(sum % 10);
            idx--;
        }
        if (carry > 0) {
            result.append(carry % 10);
        }
        result.reverse();
        while (result.length() > 0 && result.charAt(0) == '0') {
            result.deleteCharAt(0);
        }
        return result.toString();
    }
}
