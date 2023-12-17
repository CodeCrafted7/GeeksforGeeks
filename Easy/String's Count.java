
//User function Template for Java
class Solution 
{ 
    static long countStr(long n)
	{
	    if(n==1) return 3;
	    else if(n==2) return 8;
	    long res=1l;
	    res+=2l*n;
	    res+=n*1l*(n-1);
	    res+=n*1l*(n-1)*0.5;
	    res+=(n-1)*1l*(n-2)*n*0.5;
	    return res;
	}
} 
