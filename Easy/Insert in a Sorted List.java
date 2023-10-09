class Solution {
    Node sortedInsert(Node head1, int key) {
        // Add your code here.
        Node newNode = new Node(key);
        Node temp = head1;
        if(temp.data>=key){
            newNode.next = temp;
            return newNode;
        }
        while(temp.next!=null){
            if(temp.next.data>=key){
                newNode.next = temp.next;
                temp.next = newNode;
                return head1;
            }
            temp=temp.next;
        }
        temp.next = newNode;
        return head1;
    }
}
