
class Solution {
    public static Node findFirstNode(Node head) {
        
        if(head==null||head.next==null){
            return null;
        }
        
        Node slow=head;
        Node fast=head;
        Node ans=new Node(-1);
        
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            
        if(fast==slow){
            
            slow=head;
            while(slow!=fast){
            slow= slow.next;
            fast=fast.next;
            
        }
        return slow;
        }
    }
    return ans;
    }
}
