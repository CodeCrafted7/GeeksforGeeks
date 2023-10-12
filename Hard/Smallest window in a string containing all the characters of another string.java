class Solution
{
    public static String smallestWindow(String s, String p)
    {
        int count[] = new int[128];
        int start  = 0;
        int si = -1;
        int char_count = p.length();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<p.length(); i++)
        {
            count[p.charAt(i)]++;
        }
        for(int i =0; i<s.length(); i++)
        {
            if(count[s.charAt(i)]-- >  0) char_count--;
            while(char_count == 0)
            {
                if(i-start<min)
                {
                    min = i-start;
                    si = start;
                }
            
                if(++count[s.charAt(start++)]>0) char_count++;
            }
        }
        return (min == Integer.MAX_VALUE)? "-1" : s.substring(si,si+min+1);
        
    }
}
