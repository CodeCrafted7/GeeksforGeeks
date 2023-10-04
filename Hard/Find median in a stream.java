class Solution
{
    
    static PriorityQueue<Integer> lowers = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> highers = new PriorityQueue<>();
    
    
    public static void insertHeap(int val)
    {
        if(highers.size() != 0 && highers.peek() < val){
            highers.add(val);
        }else{
            lowers.add(val);
        }   
        
        
        balanceHeaps();
        
    }
    

    public static void balanceHeaps()
    {
       if(highers.size() - lowers.size() > 1){
            lowers.add(highers.remove());
        }else if(lowers.size() - highers.size() > 1){
            highers.add(lowers.remove());
        }
    }
    

    public static double getMedian()
    {
        
        if(lowers.size() == highers.size()){
            return (double)(lowers.peek() + highers.peek())/2;
        }else if(lowers.size() > highers.size()){
            return (double)lowers.peek();
        }else{
            return (double)highers.peek();
        }   
    }
    
}
