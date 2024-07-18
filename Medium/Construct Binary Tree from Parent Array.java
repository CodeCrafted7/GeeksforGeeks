/*node class of the binary tree
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
    // Function to construct binary tree from parent array.
    public Node createTree(int parent[]) {
        int n = parent.length;
        Node temp[] = new Node[n];
        for(int i=0;i<n;i++){
            temp[i] = new Node(i);
        }
        Node head = null;
        for(int i=0;i<n;i++){
            if(parent[i] != -1){
                if(temp[parent[i]].left == null)    temp[parent[i]].left = temp[i];
                else temp[parent[i]].right = temp[i];
            }
            else
                head = temp[i];
        }
        return head;
    }
}
