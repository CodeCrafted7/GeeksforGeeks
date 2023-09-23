class GFG
{
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int l=0;
        int r = n-1;
        list.add(-1);
        list.add(-1);
        while(l<=r){
        if(arr[l]==x && arr[r]==x){
           list.add(0,l);
           list.add(1,r);
           break;
         }
         if(arr[l]!=x)  l++;
         if(arr[r]!=x) r--;
        }
         return list;
    }
}
