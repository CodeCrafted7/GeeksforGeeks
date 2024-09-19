
class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        Stack<Character> st =  new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        for(int i=0;i<x.length();i++){
            char c = x.charAt(i);
            if(c == '(' || c == '{' || c == '[') st.push(c);
            else if(st.isEmpty()) return false;
            else{
                if(st.peek() != map.get(c)) return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
