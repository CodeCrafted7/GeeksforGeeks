class Solution{
    
   
    static int countWays(int N, String S){
        // code here
        HashMap<String,Integer> map=new HashMap<>();
        return solve(S,0,N-1,true,map);
        
    }
    
    
    public static int solve(String str, int i, int j , boolean isTrue,HashMap<String,Integer> map){
        if(i>j)
        return 0;
        
        if(i==j){
            if(isTrue){
                return str.charAt(i)=='T'?1:0;
            }
            else{
                return str.charAt(i)=='F'?1:0;
            }
        }
        
        String key=i+" "+j+" "+isTrue;
        if(map.containsKey(key)){
            return map.get(key);
        }
        int ans=0;
        for(int k=i+1;k<j;k+=2){
            int lt=solve(str,i,k-1,true,map);
            int lf=solve(str,i,k-1,false,map);
            int rt=solve(str,k+1,j,true,map);
            int rf=solve(str,k+1,j,false,map);
            
            if(str.charAt(k)=='^'){
                if(isTrue)
                ans+=(lt*rf+rt*lf);
                else
                ans+=(lt*rt+lf*rf);
            }
            if(str.charAt(k)=='&'){
                if(isTrue)
                ans+=(lt*rt);
                else
                ans+=(lt*rf+rt*lf+lf*rf);
            }
            if(str.charAt(k)=='|'){
                if(isTrue)
                ans+=(lt*rf+rt*lf+lt*rt);
                else
                ans+=(lf*rf);
            }
            
        }
        
        map.put(key,ans%1003);
        
        return map.get(key);
        
       
    }
}
