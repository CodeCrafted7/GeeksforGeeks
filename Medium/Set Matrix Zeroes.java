
class Solution {
    public static boolean checkFRZ(int[][] mat){
        for(int i=0;i<mat[0].length;i++){
            if(mat[0][i]==0)
                return true;
            
        }
        return false;
    }
    public static boolean checkFCZ(int[][] mat){
        for(int i=0;i<mat.length;i++){
            if(mat[i][0]==0)
                return true;
        }
        return false;
    }
    
    public static void register(int[][] mat){
        for(int i=1;i<mat.length;i++){
            for(int j=1;j<mat[0].length;j++){
                    if(mat[i][j]==0){
                        mat[i][0]=0;
                        mat[0][j]=0;
                    }
            }
            
        }
        return;
        
    }
    
    public static void rowByRegister(int[][] mat){
        for(int i=1;i<mat.length;i++){
            if(mat[i][0]==0){
                for(int j=1;j<mat[0].length;j++){
                    mat[i][j]=0;
                }
                
            }
        }
        
        return;
    }
    
    public static void colByRegister(int[][] mat){
        for(int i=1;i<mat[0].length;i++){
            if(mat[0][i]==0){
                for(int j=1;j<mat.length;j++){
                    mat[j][i]=0;
                }
                
            }
            
        }
        return;
    }
    
    
    
    public void setMatrixZeroes(int[][] mat) {
        boolean firstRowZero=checkFRZ(mat);
        boolean firstColumnZero=checkFCZ(mat);
        
        register(mat);
        rowByRegister(mat);
        colByRegister(mat);
        
        if(firstRowZero == true){
            for(int i=0;i<mat[0].length;i++){
                mat[0][i]=0;
                
            }
            
        }
        if(firstColumnZero == true){
            for(int i=0;i<mat.length;i++){
                mat[i][0]=0;
            }
            
        }
        
        return;
        
    }
}
