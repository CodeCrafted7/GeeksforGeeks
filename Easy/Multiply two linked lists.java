class Solution {
    public static long toNum(Node n){
        long num = 0,mod=1000000007;
        while(n != null){
            num = (num*10+n.data)%mod;
            n = n.next;
        }
        return num;
    }
    public long multiplyTwoLists(Node first, Node second) {
        long n1 = toNum(first);
        long n2 = toNum(second);
        return (n1*n2)%1000000007;
  
