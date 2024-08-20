
class Solution {
    public static int kthSmallest(int[] arr, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(k,Comparator.reverseOrder());
       for(int i=0;i<k;i++)
            pq.add(arr[i]);
            
        if(arr.length == k) return pq.peek();
        
        for(int i=k;i<arr.length;i++){
            if(pq.peek()>arr[i]){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
}
