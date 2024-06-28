

class GfG {
    /*You are required to complete this method*/
    boolean isToepliz(int mat[][]) {
        int minLen = Math.min(mat.length,mat[0].length);
        if(minLen==1) return true;
        for(int i = 1; i<minLen; i++)
            if(mat[i][i] != mat[i-1][i-1])
                return false;
        return true;
    }
}
