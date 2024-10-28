class Solution {
    public boolean findTriplet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int num:arr){
            if(!set.contains(num)){
                set.add(num);
            }
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(set.contains(arr[i]+arr[j])){
                    return true;
                }
            }
        }
        return false;
    }
}
