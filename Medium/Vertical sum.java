class Solution{
    public ArrayList <Integer> verticalSum(Node root) {
        // add your code here
        TreeMap<Integer,Integer> map = new TreeMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        f(root, 0 , map);
        
        for(Integer it : map.keySet()){
            ans.add(map.get(it));
        }
        return ans;
    }
    private void f(Node node ,int col, TreeMap<Integer,Integer> map){
        if(node == null) return;
        
        map.put(col, map.getOrDefault(col, 0) + node.data);
        
        f(node.left, col-1,map);
        f(node.right,col +1, map);
    }
}
