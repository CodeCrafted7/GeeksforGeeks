class Solution {
    
    public static int findEquilibrium(int arr[]) {
        int total = 0,curr = 0;
        
        for(int x : arr)
            total += x;
        
        for(int i=0;i<arr.length;i++){
            if(curr == total - arr[i] - curr)
                return i;
            curr += arr[i];
        }   
        
        return -1;
    }
}
