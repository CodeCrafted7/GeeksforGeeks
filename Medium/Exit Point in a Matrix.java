class Solution {
    public int[] FindExitPoint(int n, int m, int[][] matrix) {
        // code here
         int[] exitPoint = new int[2];
        int i = 0, j = 0;
        int dir = 0; 

        while (true) {
            if (matrix[i][j] == 1) {
                // Change direction to the right
                dir = (dir + 1) % 4;
                matrix[i][j] = 0; // Change the 1 to 0
            }

            if (dir == 0) { // Move right
                j++;
            } else if (dir == 1) { // Move down
                i++;
            } else if (dir == 2) { // Move left
                j--;
            } else if (dir == 3) { // Move up
                i--;
            }

            // Check if exit point reached
            if (i < 0 || i >= n || j < 0 || j >= m) {
                if (dir == 0) {
                    exitPoint[0] = i;
                    exitPoint[1] = j - 1;
                } else if (dir == 1) {
                    exitPoint[0] = i - 1;
                    exitPoint[1] = j;
                } else if (dir == 2) {
                    exitPoint[0] = i;
                    exitPoint[1] = j + 1;
                } else if (dir == 3) {
                    exitPoint[0] = i + 1;
                    exitPoint[1] = j;
                }
                break;
            }
        }
        return exitPoint;
    }
}
