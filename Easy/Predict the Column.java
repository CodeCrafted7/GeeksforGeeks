class Solution
{
    int columnWithMaxZeros(int arr[][], int N)
    {
        // code here 
        int maxZeros = 0;
        int maxZerosColumn = -1;

        for (int j = 0; j < N; j++) {
            int currentZeros = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i][j] == 0) {
                    currentZeros++;
                }
            }

            if (currentZeros > maxZeros) {
                maxZeros = currentZeros;
                maxZerosColumn = j;
            }
        }

        return maxZeros > 0 ? maxZerosColumn : -1;
    }
}
