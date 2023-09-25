class Solution
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        Map<Integer,Integer> m= new HashMap<>();
        int n= size/2;
        
        for(int i=0;i<size;i++) {
            
           if(!m.containsKey(a[i])) {
               m.put(a[i], 1);
           }   
           else{
               m.put(a[i], m.get(a[i])+1);
           }        
        }
        for(Map.Entry<Integer,Integer> me : m.entrySet()) {
             if(me.getValue() > n) {
                return me.getKey();
            }
        }
        return -1;
    }
}
