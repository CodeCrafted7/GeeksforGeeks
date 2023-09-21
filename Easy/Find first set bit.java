class Solution
{
    //Function to find position of first set bit in the given number.
    public static int getFirstSetBit(int n){
            
        // Your code here
        int count=0;
        while(n>0){
            count++;
            if(n%2==1){
                return count;
            }
            n=n/2;
        }
        return 0;  
    }
}
