class Solution {
    public static int pairsum(int[] arr) {
        int l = Integer.MIN_VALUE,sl = Integer.MIN_VALUE;
        for(int x : arr){
           if(x>l){
               sl = l;
               l = x;
           }else if(x>sl) 
               sl = x;
        }
        return l+sl;
    }
}
