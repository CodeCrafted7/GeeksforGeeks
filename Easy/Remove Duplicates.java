class Solution {
    String removeDups(String str) {
        StringBuilder ans  = new StringBuilder();
        boolean temp[] = new boolean[26];
        for(int i=0;i<str.length();i++){
            char x = str.charAt(i);
            if(!temp[x-'a']){
                ans.append(x);
                temp[x-'a'] = true;
            }
        }
        return ans.toString();
    }
}
