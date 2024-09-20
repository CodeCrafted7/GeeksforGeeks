class Solution {
    // Function to reverse words in a given string.
    String reverseWords(String str) {
        String words[] = str.split("\\.");
        StringBuilder res = new StringBuilder();
        for(int i = words.length-1;i>=0;i--){
            res.append(words[i]);
            if(i != 0)
                res.append(".");
        }
        return res.toString();
    }
}
