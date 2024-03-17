
/*
class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/

class Solution
{
    void deleteNode(Node del_node)
    {
         // Your code here
      if(del_node == null || del_node.next == null) return; 
       Node nextNode=del_node.next;
       del_node.data=del_node.next.data;
       del_node.next=del_node.next.next;
       nextNode = null;
    }
}
