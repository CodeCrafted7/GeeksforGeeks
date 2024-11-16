class Solution {
    public int getSecondLargest(int[] arr) {
        int m1 = Integer.MIN_VALUE,m2 = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > m1){
                m2 = m1;
                m1 = arr[i];
            }else if(arr[i] > m2 && arr[i] != m1)
                m2 = arr[i];
        }
        return m2 != Integer.MIN_VALUE? m2 : -1;
    }
}
