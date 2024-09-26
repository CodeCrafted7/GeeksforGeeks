class Solution {
    public Node findmid(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    boolean isPalindrome(Node head) {
       if(head == null || head.next == null)
            return true;
        
        Node mid = findmid(head);
        Node prev = null;
        Node curr = mid;
        Node nxt = null;
        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        Node right = prev;
        Node left = head;
        while(right != null){
            if(left.data != right.data)
                return false;
            left = left.next;
            right = right.next;
        }
        return true;
    }
}
