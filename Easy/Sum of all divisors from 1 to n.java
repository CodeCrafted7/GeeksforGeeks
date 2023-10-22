class Solution{
   static long sumOfDivisors(int N){
  
        long ans=0;
        for(int i=1;i<=N;i++){
            
            ans+= i*(N/i);
        }
        
        return ans;
    }
}
