
class Solution {
    public void help(int[][] mat,int n,int i,int j,ArrayList<String> ans,String temp){
        if(i<0 || j<0 || i==n || j==n || mat[i][j]==0)  return;
        if(i==n-1 && j==n-1){
            ans.add(temp);
            return;
        }
        mat[i][j]=0;
        help(mat,n,i+1,j,ans,temp+'D');
        help(mat,n,i-1,j,ans,temp+'U');
        help(mat,n,i,j+1,ans,temp+'R');
        help(mat,n,i,j-1,ans,temp+'L');
        mat[i][j]=1;
    } 
    public ArrayList<String> findPath(int[][] mat) {
        ArrayList<String> ans = new ArrayList<>();
        help(mat,mat.length,0,0,ans,"");
        return ans;
    }
}
