class Solution{
    public static void Inorder(Node root,ArrayList<Integer> l){
        if(root == null){
            return;
        }
        Inorder(root.left,l);
        l.add(root.data);
        Inorder(root.right,l);
        return;
    }
    public static int countPairs(Node root1, Node root2, int x){
        // Code here
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        Inorder(root1,l1);
        Inorder(root2,l2);
        for(Integer k : l1){
            map.put(k,map.getOrDefault(k,0)+1);
        }
        int ans = 0;
        for(Integer k : l2){
            if(map.containsKey(x-k)){
                ans++;
                if(map.get(x-k) == 1){
                    map.remove(x-k);
                }else{
                     map.put(x-k,map.getOrDefault(x-k,0)-1);
                }
            }
        }
        return ans;
        
    }
}
