
class Solution {

    public boolean checkSorted(List<Integer> arr) {
        // code here
        int j,swap=0;
        for(int i = 0;i < arr.size()-1;i++){
            j = arr.size() - 1;
            while(j > i){
                if(arr.get(i) > arr.get(j)){
                    if(swap == 2){
                        return false;
                    }
                    int temp = arr.get(j);
                    arr.set(j , arr.get(i));
                    arr.set(i , temp);
                    swap++;
                }
                j--;
            }
        }
        return true;
    }
}
