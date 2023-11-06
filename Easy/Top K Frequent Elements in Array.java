
class Solution {
    public int[] topK(int[] nums, int k) {
    Map<Integer,Integer>mp=new HashMap<>();
       for(int i=0;i<nums.length;i++)
       mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
       Queue<Integer>pq=new PriorityQueue<>((a,b)->(mp.get(a)==mp.get(b))?b-a:mp.get(b)-mp.get(a));
       for(int i:mp.keySet()){
           pq.add(i);
       }
       int[]arr=new int[k];
       for(int i=0;i<k;i++){
           arr[i]=pq.remove();
       }
       return arr;
    }
}
