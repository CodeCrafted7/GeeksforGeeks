class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        int cursum=0;
        int start=0;
        int end=-1;
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            cursum=cursum+arr[i];
            if(cursum==s){
                start=0;
                end=i;
                list.add(start+1);
                list.add(end+1);
                break;
            }
            if(map.containsKey(cursum-s)){
            start=map.get(cursum-s)+1;
            end=i;
            list.add(start+1);
            list.add(end+1);
            break;
        }
        map.put(cursum,i);
        }
     
        
        
        if(end== -1){
            list.add(-1);
        }
        return list;
        
    }
}
