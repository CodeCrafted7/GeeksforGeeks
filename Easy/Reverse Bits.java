class Solution {
   static Long reversedBits(Long x) {
        long result = 0;

    // Iterate through each bit of x
       for (int i = 0; i < 32; i++) {
        // Left-shift result to make space for next bit
        result <<= 1;

        // Check if the least significant bit of x is set
        if ((x & 1) == 1) {
            // If yes, set the least significant bit of result to 1
            result |= 1;
        }

        // Right-shift x to move to the next bit
        x >>= 1;
    }

    return result;
    }


};
