class Solution {

    public void nearlySorted(int[] arr, int k) {
        
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        int n = arr.length;
        int j = 0;
        
        for(int i=0;i<=k;i++)
            pq.add(arr[i]);
        
        for(int i=k+1;i<n;i++){
            arr[j++] = pq.poll();
            pq.add(arr[i]);
        }
        
        while(!pq.isEmpty()){
            arr[j++] = pq.poll();
        }
    }
}
