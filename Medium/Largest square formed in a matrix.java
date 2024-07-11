class Solution {
    static int maxSquare(int n, int m, int mat[][]) {
        int res=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(mat[i][j]==1 && i-1>=0 && j-1>=0)
                {
                    int mini = Math.min(mat[i-1][j],mat[i][j-1]);
                    mat[i][j] = Math.min(mini,mat[i-1][j-1])+1;
                }
                res = Math.max(res,mat[i][j]);
            }
        }
        return res;
    }
}
