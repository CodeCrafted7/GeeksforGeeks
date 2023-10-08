class Solution{
    static int maxLength(String S){
        // code here
        Stack<Integer> s = new Stack<>();
        s.push(-1);
        
        int res = 0;
        
        for(int i = 0; i<S.length(); i++){
            char currChar = S.charAt(i);
            
            if(currChar == '('){
                s.push(i);
            } else {
                if(!s.isEmpty()){
                    s.pop();
                }
                
                if(s.isEmpty()){
                    s.push(i);
                } else {
                    res =  Math.max(res,i-s.peek());
                }
            }
        }
        
        
       return res;
    }
}
