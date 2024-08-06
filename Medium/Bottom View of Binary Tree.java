class Solution
{
    class pair{
        Node node;
        int pt;
        public pair(Node node, int pt){
            this.node=node;
            this.pt=pt;
        }
    }
    public ArrayList <Integer> bottomView(Node root){
        ArrayList<Integer> ans=new ArrayList<>();
        TreeMap<Integer,Integer> map=new TreeMap<>();
        ArrayDeque<pair> dq=new ArrayDeque<>();
        dq.add(new pair(root,0));
        
        while(!dq.isEmpty()){
            pair rem=dq.remove();
            int temp=rem.pt;
            map.put(temp,rem.node.data);
            
            if(rem.node.left!=null)dq.add(new pair(rem.node.left,temp-1));
            if(rem.node.right!=null)dq.add(new pair(rem.node.right,temp+1));
        }
        for(int a:map.keySet())ans.add(map.get(a));
        return ans;
    }
}
