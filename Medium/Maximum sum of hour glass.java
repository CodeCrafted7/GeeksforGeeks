
class Solution {
    int findMaxSum(int n, int m, int mat[][]) {
        // code here
        if(n < 3 || m < 3)
        {
            return -1;
        }
        
        int a = 0;
        int b = 1;
        int c = 2;
        
        int sum = Integer.MIN_VALUE;
        for(int i = 0 ; i <= mat.length-3 ; i++)
        {
            int d = 0;
            int e = 1;
            int f = 2;
            for(int j = 0 ; j<= mat[0].length-3 ; j++)
            {
                int s = (mat[a][d]+mat[a][e]+mat[a][f]+mat[b][e]+mat[c][d]+mat[c][e]+mat[c][f])%1000000007;
                
                sum = Math.max(sum,s);
                d++;
                e++;
                f++;
            }
            a++;
            b++;
            c++;
        }
        
        return sum;
    }
};
