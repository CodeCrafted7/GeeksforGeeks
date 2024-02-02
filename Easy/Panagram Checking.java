
class Solution
{
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        s = s.replaceAll("[^a-zA-Z]","").toLowerCase();
        
        int[] bucket = new int[26];
        
        for(int i = 0 ; i < s.length() ; i++)
        {
            char ch = s.charAt(i);
            bucket[ch - 'a']++;
        }
        
        for(int i = 0 ; i < 26 ; i++)
        {
            if(bucket[i] == 0) return false;
        }
        return true;
    }
}
