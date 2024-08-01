
class Solution {
    public String longestCommonPrefix(String arr[]) {
        int s=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i].length() < arr[s].length())
                s=i;
        }
        int i=0,j=0;
        String temp = arr[s];
        while(i<temp.length()){
            for(j=0;j<arr.length;j++){
                if(temp.charAt(i) != arr[j].charAt(i))
                    break;
            }
            if(j!=arr.length)
                break;
            i++;
        }
        if(i==0) 
            return "-1";
        return temp.substring(0,i);
    }
}
