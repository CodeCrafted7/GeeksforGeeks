class Solution {
    public static ArrayList<Integer> constructList(int q, int[][] queries) {
        int xor = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = queries.length - 1; i >= 0; i--) {
            if (queries[i][0] == 0) {
                ans.add(queries[i][1] ^ xor);
            } else {
                xor ^= queries[i][1];
            }
        }

        ans.add(xor);

        Collections.sort(ans);

        return ans;
    }
}
