class Solution
{
   
    public static ArrayList<Integer> KDistanceNodes(Node root, int node , int dis)
    {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> a = new ArrayList<>();

        Maping(root, 0, map);
        

        for(int v : map.keySet()) {
           
           int valu = map.get(v);
           if(valu == map.get(node)&& node != v){
              if(valu+map.get(node)-dis==0)a.add(v);
           }else{
              if(valu-map.get(node)-dis==0)a.add(v);
           }
        }
        
        Collections.sort(a);

        return a;
        
    }
    
     private static void Maping(Node root, int d, Map<Integer, Integer> map) {
        if (root == null)
            return;
        map.put(root.data, d);
        Maping(root.left, d + 1, map);
        Maping(root.right, d + 1, map);
    }
    
   
};
