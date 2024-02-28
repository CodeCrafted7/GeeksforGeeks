class Solution {
    public static int[] game_with_number(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i] | arr[i + 1];
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 11, 1, 2, 3};
        int n = arr.length;
        
        // Call the function
        int[] result = game_with_number(arr, n);
        
        // Print the modified array
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}


