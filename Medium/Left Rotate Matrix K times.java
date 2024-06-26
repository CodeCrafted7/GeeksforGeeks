
class Solution {
     int[][] rotateMatrix(int k, int mat[][]) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] arr = new int[n][m];
        k = k%m;
       for(int i = 0;i<n;i++){
           for(int j = 0;j<m;j++){
               int idx = ((m+j)-k)%m;
               arr[i][idx] = mat[i][j];
           }
       }
       return arr;
    }
    
}
