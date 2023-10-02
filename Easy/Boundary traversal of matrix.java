class Solution
{
    static ArrayList<Integer> boundaryTraversal(int mat[][], int n, int m)
    {
        // code here 
        ArrayList<Integer> ans=new ArrayList<Integer>();
        
            if(m==1&&n!=0){
                for(int i=0;i<n;i++){
                    ans.add(mat[i][0]);
                }
                return ans;
            }

            for(int j=0;j<m;j++){
                ans.add(mat[0][j]);
                
            }

            if(n==1){
                return ans;
            }

            for(int j=1;j<n-1;j++){
                ans.add(mat[j][m-1]);
                
            }

            for(int j=m-1;j>=0;j--){
                ans.add(mat[n-1][j]);
                
            }
    
             for(int i=n-2;i>0;i--){
               ans.add(mat[i][0]);
            }
        return ans;
    }
}
