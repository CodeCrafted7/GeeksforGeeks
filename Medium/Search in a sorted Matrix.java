
class Solution {
    
    public boolean isInMatrix(int i,int j,int[][] mat){
        int n=mat.length;
        int m=mat[0].length;
        
        if(i<0 || i>=n || j<0 || j>=m)
            return false;
        return true;
        
    }
    
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int i=0;
        int j=mat[0].length-1;
        
        while( isInMatrix(i,j,mat) ){
            if(mat[i][j]==x)
                return true;
            if(mat[i][j]<x)
                i++;
            else
                j--;
        }
        
        return false;
    }
}
