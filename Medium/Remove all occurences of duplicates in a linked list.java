
class Solution {
    /**TC: O(n) SC: O(1)*/
    public Node removeAllDuplicates(Node head) {
        // code here
        if(head==null)  return head;
        //creating new result list
        Node result = new Node(-1);
        Node tmp = result;
        //using two pointer concept
        Node left=head, right=head.next;
        
        // 3->3->4->4->5
        
        //tc: o(n)
        while(right != null){
            /*if left data != right data, 
            we will link with our answer if it is not duplicate, 
            means right should just next to left*/
            if(left.data != right.data){
                if(left.next==right){
                    tmp.next = left;
                    tmp = tmp.next;
                }
                left = right;
            }
            right = right.next;
        }
        
        if(left.next==null) tmp.next = left;
        else    tmp.next = null;    //if it is not, than clean the end links
        
        return result.next;
        
    }
}
