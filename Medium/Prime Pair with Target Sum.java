

class Solution {
    
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        
        return true;
        
    }
    
    public static ArrayList<Integer> getPrimes(int n) {
        // code here
        ArrayList<Integer> res = new ArrayList<>(Arrays.asList(-1, -1));
        for(int i=1; i<n; i++){
            if(isPrime(i)){
                if(isPrime(n-i)){
                    res.set(0, i);
                    res.set(1, n-i);
                    break;
                }
            }
        }
        
        return res;
    }
}
