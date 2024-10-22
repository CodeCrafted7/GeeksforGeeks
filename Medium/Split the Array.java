// User function Template for Java

class Solution {

    public static int countgroup(int arr[]) {
        // Complete the function
        int xor=0;
        for(int i:arr){
            xor^=i;
        }
        if(xor!=0){
            return 0;
        }else{
            return (int) (((Math.pow(2,(arr.length-1)))-1) % 1000000007);
        }
    }
}
