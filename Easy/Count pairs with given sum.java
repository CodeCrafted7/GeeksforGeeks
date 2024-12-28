

class Solution {

    int countPairs(int arr[], int target) {
        int n=arr.length;
        int count=0;
        HashMap<Integer,Integer>ans=new HashMap<>();
        for(int num: arr){
            int res=target-num;
            if(ans.containsKey(res)){
                count+=ans.get(res);
            }
            ans.put(num,ans.getOrDefault(num,0)+1);
        }
        return count;
    }
}
