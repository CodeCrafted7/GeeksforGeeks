
class Solution {
    static Node addTwoLists(Node num1, Node num2) {
        Node l1 = rev(num1);
        Node l2 = rev(num2);
        
        Node curr = null;
        int carry = 0;
        
        while(l1 != null || l2 != null || carry > 0){
            int x1 = l1 != null? l1.data:0;
            int x2 = l2 != null? l2.data:0;
            int sum = x1 + x2 + carry;
            carry = sum/10;
            
            Node temp = new Node(sum % 10);
            temp.next = curr;
            curr = temp;
            
            if(l1 != null)  l1 = l1.next;
            if(l2 != null)  l2 = l2.next;
        }
        
        while(curr != null && curr.data == 0)
            curr = curr.next;
        return curr;
        
    }
    
    private static Node rev(Node head){
        Node prev = null,nxt = null,curr = head;
        
        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}
