class Solution {
  int rectanglesInCircle(int r) {
    int count = 0;
    int n = 2 * r;
    for (int i = 1; i <= n; i++) {
      int t1 = i * i;
      for (int j = 1; j <= n; j++) {
        int t2 = j * j;
        int r1 = 4 * r * r;
        if ((t1 + t2) <= r1) {
          count++;
        }
      }
    }
    return count;
  }
}
