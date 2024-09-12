//Back-end complete function Template for Java
class Solution {
    // Function to return the minimum cost of connecting the ropes.
    public long minCost(long[] arr) {
       PriorityQueue<Long> pq = new PriorityQueue<>();
       long ans = 0;
       for(long x : arr)    pq.add(x);
       
       while(pq.size() != 1){
           long first = pq.poll();
           long second = pq.poll();
           long total = first + second;
           pq.add(total);
           ans += total;
       }
       return ans;
    }
}
