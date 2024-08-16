
class Solution {
    public Node addOne(Node head) {
        // code here.
        Node res = head;
        if(head.next == null){
            head.data += 1;
            return head;
        }
        solve(head,head);
        return res;
        
    }
    
    private int solve(Node head,Node head2){
        if(head.next == null){
            int value = head.data;
            if(value == 9){
                head.data = 0;
                return 1;
            }
            else{
                head.data = (value+1);
            }
            return 0;
        }
        
        int carry = solve(head.next,head2);
        int curr = head.data;
        if(head == head2 && carry ==1 && curr == 9){
            head.data = 10;
            return 0;
        }
        if(carry == 1 && curr == 9){
            head.data = 0;
            return 1;
        }
        else if(carry ==1 && curr < 9){
            head.data = (curr+1);
        }
        return 0;
        
    }
}

