
class Solution {
    static boolean canAttend(int[][] arr) {
        Arrays.sort(arr,(a,b) -> Integer.compare(a[0],b[0]));
        int m = arr.length;
        int n = arr[0].length;
        int count = 1;
        
        for(int i=0; i<m-1; i++){
            for(int j=0; j<n-1; j++){
                if( arr[i][j+1] <= arr[i+1][j] ){
                    count++;
                }
            }
        }
        return count == m?true : false;
    }
}
