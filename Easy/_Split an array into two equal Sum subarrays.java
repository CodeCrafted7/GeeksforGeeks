
class Solution {
    public boolean canSplit(int arr[]) {
        int sum=0,first_sum=0;
        for(int a : arr)
            sum+=a;
        for(int a:arr){
            sum-=a;
            first_sum+=a;
            if(sum == first_sum)
                return true;
        }
        return false;
    }
}
