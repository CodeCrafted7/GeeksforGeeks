
//User function Template for Java
class Solution{
    static String printMinNumberForPattern(String S){
        // code here
         Stack<Integer> st = new Stack<>();
        String ans = "";
        int num = 1;
        for(int i = 0; i <S.length(); i++){
            char ch = S.charAt(i);
            if(ch == 'D'){
                st.push(num);
                num++;
            }else{
                st.push(num);
                num++;
                while(st.size() > 0){
                    ans += st.pop();
                    // System.out.println(ans);
                }
            }
        }
        st.push(num);
        while(st.size() > 0){
            ans += st.pop();
            // System.out.println(ans);
        }
        return ans;
    }
}
