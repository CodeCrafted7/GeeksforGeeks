class Solution{
    static ArrayList<Integer> recamanSequence(int n){
        // code here
        ArrayList<Integer>list=new ArrayList<>();
        list.add(0);
        for(int i=1;i<=n;i++){
            int num=list.get(i-1)-i;
            if(num<0 || list.contains(num)){
                num=list.get(i-1)+i;
            }
            list.add(num);
        }
        return list;
        
    }
}
