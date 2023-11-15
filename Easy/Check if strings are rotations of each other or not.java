


class Solution
{
   public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        return new String(s1+s1).contains(s2);
    }
    
}
