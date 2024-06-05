
class Solution {
        String binaryNextNumber(String S){
        StringBuilder sb = new StringBuilder(S);
        boolean flag = false;
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '0') {
                sb.setCharAt(i, '1');
                flag = true;
                break;
            } else {
                sb.setCharAt(i,'0');
            }
        }
        if (!flag) {
            sb.insert(0, '1');
        }
        
        int startIndex = 0;
        while (startIndex < sb.length() && sb.charAt(startIndex) == '0') {
            startIndex++;
        }
        return sb.substring(startIndex);
    }
}
