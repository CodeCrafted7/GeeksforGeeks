
class Solution {
    public Node deleteNode(Node head, int x) {
        if(head == null)return null;
        if(1 == x && head.next == null)return null;
        if(x == 1){
            return head.next;
        }else{
            Node curr = head;
            for(int i=1; i<x; i++){
                curr = curr.next;
            }
            if(curr.next == null){
                curr = curr.prev;
                curr.next = null;
            }else{
                curr.prev.next = curr.next;
             }
        }
        return head;
    }
}
