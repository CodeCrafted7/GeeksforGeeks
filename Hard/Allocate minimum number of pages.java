class Solution 
{ static boolean check(int a[],int n, int m,int mid){
    int no=1,count=0;
    for (int i=0;i<n; i++){
        if (count+a[i]<=mid){
            count +=a[i];
        }
        else {
            count =a[i];
            no++;
            if(no>m || a[i]>mid) return false;
        }
    }
    return true;
    
}

    public static int findPages(int[]A,int N,int M)
    {  if (N<M) return -1;
        int start=0, end=0,mid=0,ans=-1;
    for (int i=0; i<N; i++){
        end += A[i];
    }
    
        while (start<= end){
            mid = (start+end )/2;
            boolean p=check(A,N,M,mid);
            
            if (p){
                end= mid-1;
                ans=mid;
            }
            else {
                start= mid+ 1;
            }
        }
        
    return ans;
        
    }
}
