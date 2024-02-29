class Solution{
    int DivisibleByEight(String s){
        //code here
        if(s.length()<=2){
            int k=Integer.parseInt(s);
            if (k%8==0)
            return 1;
            return -1;
        }
        String str=s.substring(s.length()-3,s.length());
        int k=Integer.parseInt(str);
        if (k%8==0)
            return 1;
        return -1;
    }
}
