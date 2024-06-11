
class Solution {
    // Function to match pairs of characters from arrays a and b
    void matchPairs(int n, char nuts[], char bolts[]) {
        // Initialize an array c to store the count of different characters
        int c[] = new int[n];
        // Initialize variables i, j, and k
        int i, j = 0, k;
        // Initialize a hash array h to store frequency of characters (size 256 for
        // ASCII)
        int h[] = new int[256];
        // Calculate frequency of characters in array a and store in hash array h
        for (i = 0; i < n; i++) {
            h[nuts[i]]++;
        }
        // Iterate over the hash array to get unique characters and store in arrays a
        // and b
        for (i = 0; i < 256; i++) {
            if (h[i] > 0) {
                // Assign character i to arrays a and b
                nuts[j] = (char)i;
                bolts[j++] = (char)i;
            }
        }
    }
}
