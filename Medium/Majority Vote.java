
class Solution {
    public List<Integer> findMajority(List<Integer> nums) {
        int n = nums.size();
        int can1 = 0, can2 = 0, c1 = 0, c2 = 0;

        for (int num : nums) {
            if (num == can1) {
                c1++;
            } else if (num == can2) {
                c2++;
            } else if (c1 == 0) {
                can1 = num;
                c1 = 1;
            } else if (c2 == 0) {
                can2 = num;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }

        int v1 = 0, v2 = 0;
        for (int num : nums) {
            if (num == can1) v1++;
            else if (num == can2) v2++;
        }

        List<Integer> ans = new ArrayList<>();
        if (v1 > n / 3) ans.add(can1);
        if (v2 > n / 3 && can2 != can1) ans.add(can2);

        if (ans.isEmpty()) ans.add(-1);

        return ans;
    }
}
