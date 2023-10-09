
class Solution{
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        boolean[][] board = new boolean[n][n];
        
        ArrayList<Integer> cur = new ArrayList<>();
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        
        boolean[] QueenRows = new boolean[n];
        
        solve(board,0,cur,res,n,QueenRows);
        
        return res;
    }
    
    static void solve(boolean[][] board, int col,ArrayList<Integer> cur, ArrayList<ArrayList<Integer>> res, int n,boolean[] QueenRows ){
        
        if(col == n){
            res.add(new ArrayList(cur));
            return;
        }
        
        for(int i=0; i<n; i++){
            if(!QueenRows[i] && canBePlaced(col,i,board)){
                board[i][col] = true;
                QueenRows[i] = true;
                cur.add(i+1);
                
                solve(board,col+1,cur,res,n,QueenRows);
                
                board[i][col] = false;
                QueenRows[i] = false;
                cur.remove(cur.size()-1);
            }
        }
    }
    
    static boolean canBePlaced(int col, int row, boolean[][] board){
        
        
        int c = col;
        int r = row;
        
    
        while(c >=0 && r >=0){
            if(board[r][c]) return false;
            r--;
            c--;
        }
        
        c = col;
        r = row;

        while(c < board[0].length && r >=0){
            if(board[r][c]) return false;
            r--;
            c++;
        }
        
        c = col;
        r = row;
        
    
        while(c < board[0].length && r < board.length){
            if(board[r][c]) return false;
            r++;
            c++;
        }
        
        c = col;
        r = row;
        
      
        while(c >= 0 && r < board.length){
            if(board[r][c]) return false;
            r++;
            c--;
        }
        
        return true;
        
        
    }
}
