class Solution {
    // Function to find if there is a celebrity in the party or not.
    public int celebrity(int mat[][]) {
        int ans = -1,j=0,n = mat.length;
        for(int i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(mat[i][j]==1) break;
            }
            if(j==n){
                for(j=0;j<n;j++){
                    if(j!=i && mat[j][i]==0) break;
                }
                if(j==n){
                    ans =i;
                    break;
                }
            }
        }
        return ans;
    }
}
