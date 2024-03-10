class Solution
{
  public char nthCharacter(String s, int r, int n)
    {
        //code
        int l=(int)Math.pow(2,r);
        int f=0;
        int e=0;
        int index=0;
        while(n>=e){
            index++;
            f=e;
            e+=l;
        }
        index--;
        char ch=s.charAt(index);
        int target=n-f;
        StringBuilder sb= new StringBuilder();
        sb.append(String.valueOf(ch));
        int size=sb.length();
        while(r>-1){
            if(target+1<=size){
                return sb.charAt(target);
            }
            StringBuilder sb1= new StringBuilder();
            int j=0;
            for(int i=0;i<size;i++){
                ch=sb.charAt(i);
                if(ch=='1'){
                    sb1.replace(j,j+1,"10");
                    j+=2;
                }else{
                    sb1.replace(j,j+1,"01");
                    j+=2;
                }
            }
            sb=sb1;
            size+=size;
            r--;
        }
        return '5';
    }
}
