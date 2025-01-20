
class Solution {
    public Node rotate(Node head, int k) {
        Node temp = head;
        int size = 1;
        while(temp.next != null){
            size++;
            temp = temp.next;
        }
        
        k = k % size;
        if(k == 0)
            return head;
        
        temp.next = head;
        temp = head;
        for(int i=1;i<k;i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        
        return head;
    }
}
