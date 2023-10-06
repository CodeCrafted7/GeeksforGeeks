class Solution {
         public int maxArea(int a[][], int m, int n) {
        
	int res = hist(a[0], n);
	
	for(int i=1;i<m;i++)
	{
	    for(int j=0;j<n;j++)
	    {
		if(a[i][j] == 1)
		{
		    a[i][j] = a[i-1][j]+1;
		}
	    }
		res = Math.max(res, hist(a[i], n));
	}
	return res;
    }
    private static int hist(int[] a, int n)
    {
	int res = Integer.MIN_VALUE;
	Stack<Integer> st = new Stack<>();
	int i =0;
	while(i<n || !st.isEmpty())
	{
	    if(i<n && (st.isEmpty() || a[i]>=a[st.peek()]))
		st.push(i++);
	    else
	    {
		int currIndex = st.pop();
		int leftCount = st.isEmpty()?currIndex:currIndex-st.peek()-1;
		int rightCount = i-currIndex-1;
		res = Math.max(res, leftCount*a[currIndex] + a[currIndex] + rightCount*a[currIndex]);
	    }
	}
	return res;
    }
    }
