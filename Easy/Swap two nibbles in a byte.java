class Solution {
     static int swapNibbles(int n) {
        int rightShifted = n >> 4;
        int leftShifted = (n & 0x0F) << 4;
        return rightShifted | leftShifted;
    }
}
