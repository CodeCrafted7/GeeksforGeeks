class Solution
{
    public int is_bleak(int n)
    {
        int start=Math.max(0,n-(int)Math.ceil(Math.log(n)/Math.log(2)));
        for(;start<n;start++)
        {
            if(start+Integer.bitCount(start)==n)
                return 0;
        }
        return 1;
    }
}
