
class Solution {
    public int findExtra(int n, int arr1[], int arr2[]) {
        // add code here.


        int left =0, right = n-2, mid=0;
        while(left<=right){
            mid = left + (right - left)/2;
            if(arr1[mid] == arr2[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return left;
    }
}
