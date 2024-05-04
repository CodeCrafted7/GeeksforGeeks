
class Pair
{
    public Node p;
    public int l;
    
    public Pair(Node node, int level)
    {
        p = node;
        l = level;
    }
}

class Tree
{
    ArrayList<Integer> Kdistance(Node root, int k)
    {
        ArrayList<Integer> res = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        
        while(!q.isEmpty()) 
        {
            int n = q.size();
            while(n-- > 0) 
            {
                Pair p = q.remove();
                
                Node node = p.p;
                int level = p.l;
                
                if(level == k)
                    res.add(node.data);
                    
                if(node.left != null)
                    q.add(new Pair(node.left, level + 1));
                    
                if(node.right != null)
                    q.add(new Pair(node.right, level + 1));
            }
        }
        
        return res;
    }
}
