class Solution{
    public void threeWayPartition(int array[], int a, int b)
    {
        // code here 
        int n = array.length;
        int low = 0, mid = 0, high = n - 1;
        
        while (mid <= high) {
            if (array[mid] < a) {
                swap(array, low, mid);
                low++;
                mid++;
            } else if (array[mid] > b) {
                swap(array, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
