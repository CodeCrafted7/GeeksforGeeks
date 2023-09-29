class Solution {
    void reorderlist(Node head) {
        if(head==null|| head.next==null) return ;
        
        Node list1 = mid(head);
        Node nhead = list1.next ;
        list1.next = null;
        
        nhead = reverse(nhead);
        
        Node c1 = head;
        Node c2 = nhead;
        Node f1 = null;
        Node f2 = null;
        while(c1 != null && c2!=null){
            f1 = c1.next;
            f2 = c2.next;
            
            c1.next = c2;
            c2.next = f1;
            
            c1 = f1;
            c2 = f2;
        }
    }
    
    Node reverse(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node cur = head;
        Node frd = null;
        while(cur!=null){
            frd = cur.next;
            cur.next = prev;
            prev = cur;
            cur = frd;
        }
        return prev;
    }
    Node mid(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node fast = head;
        Node slow = head;
        
        while(fast!=null && fast.next!=null ){
            fast = fast.next.next;
            slow = slow.next;
            
        }
        return slow;
    }
}
