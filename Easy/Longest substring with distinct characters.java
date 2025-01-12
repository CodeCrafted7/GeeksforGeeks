
class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        HashSet<Character>h=new HashSet<>();
        int i=0;
        int j=0;
        int max=0;
        while(j<s.length())
        {
            if(!h.contains(s.charAt(j)))
            {
                h.add(s.charAt(j));
                j++;
                max=Math.max(max,h.size());
            }
            else
            {
                h.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
