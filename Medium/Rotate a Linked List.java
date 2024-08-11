class Solution {
    // Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        if(head==null || head.next == null || k==0)
            return head;
        Node temp = head;
        int n = 1;
        while(temp.next !=null){
            temp = temp.next;
            n++;
        }
        k = k%n;
        if(k==0)
            return head;
        temp.next = head;
        Node t = head;
        while(k>1){
            t = t.next;
            k--;
        }
        head = t.next;
        t.next = null;
        return head;
    }
}
