class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // add code here.
        List<Integer> al=new ArrayList<>();
        while(!q.isEmpty() && k-->0) al.add(0,q.poll());
        while(!q.isEmpty()) al.add(q.poll());
        for(int i:al) q.add(i);
        return q;
    }
}
