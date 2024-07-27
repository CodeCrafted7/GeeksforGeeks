// User function Template for Java
class Solution {
    boolean kPangram(String str, int k) {
        int n = str.length();
        int ch = 0;
        int arr[] = new int[26];
        Arrays.fill(arr,0);
        for(int i=0;i<n;i++){
            if(str.charAt(i) != ' '){
                arr[str.charAt(i)-'a'] = 1;
                ch++;
            }
        }
        int c=0;
        for(int i=0;i<26;i++){
            if(arr[i]==0)
                c++;
        }
        if(ch < 26 || c>k) return false;
        return true;
        
    }
}
