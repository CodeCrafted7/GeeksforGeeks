class CheckBit
{
    // Function to check if Kth bit is set or not.
    static boolean checkKthBit(int n, int k)
    {
        int mask = 1;
        if(((mask<<k)&n) == 0) return false;
        return true;
    }
    
}
