
class Intersect {
   
    int intersectPoint(Node head1, Node head2) {
        int n = 0,m = 0;
        Node temp = head1;
        Node temp2 = head2;
        while(temp != null){
            n++;
            temp = temp.next;
        }
        while(temp2 != null){
            m++;
            temp2 = temp2.next;
        }
        
        int d = (n>m) ? n-m : m-n;
        Node t = (n>m) ? head1 : head2;
        
        while(d>0 && t != null){
            d--;
            t = t.next;
        }
        Node y = (n>m) ? head2 : head1;
        while(t != null && y!= null){
            if(t == y)
                return t.data;
            t = t.next;
            y = y.next;
        }
        return -1;
    }
}
