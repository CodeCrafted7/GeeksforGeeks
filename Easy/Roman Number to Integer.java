class Solution {
    // Finds decimal value of a given roman numeral
  public int romanToDecimal(String str) {
        int sum = 0, prev = 0;
        for(int i= str.length()-1; i>=0; i--){
            int num = getVal(str.charAt(i));
            sum += (prev > num) ? -num : num;
            prev = num;
        }
        return sum;
    }

    private static int getVal(char c) {
        switch(c) {
			case 'I':return 1;
			case 'V':return 5;
			case 'X':return 10;
			case 'L':return 50;
			case 'C':return 100;
			case 'D':return 500;
			case 'M':return 1000;
			default:return 0;
        }
    }
}
