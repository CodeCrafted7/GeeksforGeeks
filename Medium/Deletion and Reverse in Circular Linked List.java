class Solution {
    Node reverse(Node head) {
        if(head==null || head.next==head ) {
            return head;
        }
        Node prev=null;
        Node curr=head;
        Node next=null;
        do{
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }while(curr!=head);
        head.next=prev;
        head=prev;
        return head;
    }
    Node deleteNode(Node head, int key) {
        if(head==null || head.next==head) {
            return null;
        }
        Node curr=head;
        Node prev=null;
        if(head.data==key){
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            
            temp.next=head.next;
            head=head.next;
            return head;
            
        }
        do{
            prev=curr;
            curr=curr.next;
            if(curr.data==key){
                prev.next=curr.next;
                break;
            }
        }while(curr!=head);
        return head;
    }
}
