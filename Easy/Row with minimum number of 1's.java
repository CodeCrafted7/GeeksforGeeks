class Solution {
    int minRow(int n, int m, int a[][]) {
        int minRow = 1;
        int minOneCount = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            int oneCount = 0;
            for(int j=0; j<m; j++){
                if(a[i][j]==1){
                    oneCount++;
                }
            }
            if(oneCount<minOneCount){
                minRow = i+1;
                minOneCount = oneCount;
            }
        }
        
        return minRow;
    }
};
