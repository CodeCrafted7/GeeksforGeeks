
class Solution {
    public static Node reverseKGroup(Node head, int k) {
        
        if(head == null)
            return null;
            
        Node prev = null,next = null,curr = head;
        int count = 0;
        
        while( curr != null && count < k){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
            count++;
        }
        if(next != null)
            head.next = reverseKGroup(next,k);
            
        return prev;
    }
}
