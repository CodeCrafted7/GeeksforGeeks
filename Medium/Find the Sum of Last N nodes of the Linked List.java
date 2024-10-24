

class Solution {

    
    public int sumOfLastN_Nodes(Node head, int n) {
        int count = 0,sum = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        count-=n;
        temp = head;
        while(temp != null){
            if(count == 0) sum+=temp.data;
            else count--;
            temp = temp.next;
        }
        return sum;
    }
}
