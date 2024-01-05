

class Solution {
    static int singleElement(int[] arr , int N) {
        Arrays.sort(arr);
        if(N>1&&arr[0]!=arr[1])return arr[0];
        for(int i=1;i<N;i=i+3){
            if(arr[i-1]!=arr[i]){
                return arr[i-1];
            }
        }
        return arr[N-1];
       
    }
}
