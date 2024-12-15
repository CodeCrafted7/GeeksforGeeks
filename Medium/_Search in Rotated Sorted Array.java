
class Solution {
    int search(int[] arr, int key) {
        int st = 0,end = arr.length-1;
        while(st <= end){
            
            int mid = (st+end)/2;
            
            if(arr[mid] == key){
                return mid;
            } 
            
            if(arr[st] <= arr[mid]){
                if(arr[st] <= key && key < arr[mid]){
                    end = mid -1;
                }else{
                    st = mid+1;
                }
            }
            
            else{
                if(arr[mid] < key && key <= arr[end]){
                    st = mid+1;
                }else{
                    end = mid-1;
                }
            }
            
        }
        return -1;
    }
}
