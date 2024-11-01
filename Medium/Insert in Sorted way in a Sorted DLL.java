class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        Node newNode = new Node(x);
        
        // check for first node
        if(head == null || head.data > x){
            newNode.next = head;
            if(head != null){
                head.prev = newNode;
            }
            return newNode;
        }
        
        //traverse all nodes after head until reach end of DLL or found any node > x
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data > x){
                break;
            }
            temp = temp.next;
        }
        
        //if found correct position then insert newNode
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        
        //if newNode is inserted between 2 nodes 
        if(newNode.next != null){
            newNode.next.prev = newNode;
        }
        return head;
    }
}
