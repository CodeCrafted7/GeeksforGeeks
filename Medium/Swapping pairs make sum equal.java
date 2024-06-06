class Solution {

  public:
       int findSwapValues(int a[], int n, int b[], int m) {
        unordered_set<int> set;
        for(int i = 0; i < m; i++)
            set.insert(b[i] << 1);
        int sum1 = accumulate(a, a + n, 0L), sum2 = accumulate(b, b + m, 0L);
        int diff = sum2 - sum1;
        if(diff & 1)
            return -1;
        for(int i = 0; i < n; i++)
            if(set.count(diff + (a[i] << 1)))
                return true;
        return -1;
    }
};
