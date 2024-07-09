
class Solution {
    int search(int[] arr, int key) {
        int low=0,high=arr.length-1,mid;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(arr[mid]==key)   return mid;
            else if (arr[mid]<arr[0])
            {
                if(key<=arr[high] && key>arr[mid])  low = mid+1;
                else    high = mid-1;
            }
            else
            {
                if(key<arr[mid] && key>=arr[0]) high = mid-1;
                else    low = mid+1;
            }
        }
        return -1;
    }
}
