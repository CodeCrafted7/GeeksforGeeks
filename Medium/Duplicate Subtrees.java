

class Solution 

{

    Map<String, Integer> map;

    public List<Node> printAllDups(Node root) 

    {

        List<Node> result = new ArrayList<>();

        map = new HashMap<>();

        inorder(root,result);

        return result;

    }

    

    public String inorder(Node root,List<Node> result)

    {

        if(root == null)

         return "";

         

        String str = "(";

        str += inorder(root.left,result);

        str += Integer.toString(root.data);

        str += inorder(root.right,result);

        str += ")";

        

        if(map.containsKey(str) && map.get(str)==1)

        {

            result.add(root);

        }

        

        map.put(str,map.getOrDefault(str,0)+1);

        return str;

    }

}
