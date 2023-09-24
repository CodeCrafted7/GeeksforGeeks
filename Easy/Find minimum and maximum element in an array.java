//User function Template for Java

/*
 class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static Pair getMinMax(long a[], long n)  
    {
        int min = (int)a[0];
        int max = (int)a[0];
        for(int i=0;i<n;i++){
            if(a[i]<min)
                min = (int)a[i];
            if(a[i]>max)
                max = (int)a[i];
        }
        Pair p = new Pair(min,max);
        return p;
    }
}
