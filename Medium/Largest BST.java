class Result {
    int maxv, minv, maxs;

    public Result(int maxv, int minv, int maxs) {
        this.maxv = maxv;
        this.minv = minv;
        this.maxs = maxs;
    }
}

class Solution {
    static Result help(Node root) {
        if (root == null) {
            return new Result(Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        }
        Result l = help(root.left);
        Result r = help(root.right);

        if (l.maxv < root.data && root.data < r.minv) {
            return new Result(Math.max(root.data, r.maxv), Math.min(root.data, l.minv), l.maxs + r.maxs + 1);
        }
        return new Result(Integer.MAX_VALUE, Integer.MIN_VALUE, Math.max(l.maxs, r.maxs));
    }

    static int largestBst(Node root) {
        return help(root).maxs;
    }
}
