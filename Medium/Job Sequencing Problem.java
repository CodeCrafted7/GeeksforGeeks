class Solution{
    int[] JobScheduling(Job arr[], int n){
      
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(100, (a,b) -> (a-b));
        Arrays.sort(arr, new Comparator<Job>(){
            public int compare(Job j1, Job j2){
                if (j1.deadline < j2.deadline) return -1;
                if (j1.deadline > j2.deadline) return 1;
                return j1.profit - j2.profit;
            }
        });
        
        int[] ans = {0, 0};
        int ssum = 0;
        
        for (int i = 0; i < arr.length; ++i) {
            while (pq.size() >= arr[i].deadline) {
                if (pq.peek() >= arr[i].profit) {
                    break;
                }
                ssum -= pq.poll();   
            }
            
            if (pq.size() < arr[i].deadline) {
                pq.offer(arr[i].profit);
                ssum += arr[i].profit;
            }
            
            if (ans[1] < ssum) {
                ans[1] = ssum;
                ans[0] = pq.size();
            }
        }
        
        return ans;
    }
}
