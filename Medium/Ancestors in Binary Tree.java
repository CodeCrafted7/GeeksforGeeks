
/*class Node of the binary tree
class Node
{
    int data;
    Node left, right;
    Node(int key)
    {
        data = key;
        left = right = null;
    }
}*/
class Solution {

    public ArrayList<Integer> Ancestors(Node root, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        findall(root,target,arr);
        return arr;
    }
    boolean findall(Node root,int target,ArrayList<Integer> arr)
    {
        if(root==null) return false;
        if(root.data==target) return true;
        arr.add(0,root.data);
        if(findall(root.left,target,arr)) return true;
        if(findall(root.right,target,arr)) return true;
        arr.remove(0);
        return false;
    }
}
