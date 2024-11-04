class Solution {
    public boolean isLengthEven(Node head) {
        // code here
        int count=0;
        Node curr;
        for(curr=head; curr!=null;curr=curr.next)
        {
            count++;
        }
        if(count%2==0){
          return true;
        }
        return false;
    }
}
