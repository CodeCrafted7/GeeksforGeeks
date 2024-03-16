


class Solution {
   public static Node rev(Node h){
       Node pr=null;
       while(h!=null){
           Node n=h.next;
           h.next=pr;
           pr=h;
           h=n;
           
       }
       return pr;
       
   }
   public Node sort(Node head){
        if(head == null || head.next == null) return head;
        Node t=head;
        Node d1=new Node(-1);
        Node d2=new Node(-1);
        Node p1=d1,p2=d2;
        while(t!=null && t.next!=null ){
            p1.next=t;
            p1=t;
            p2.next=t.next;
            p2=t.next;
            if(t.next!=null)
                t=t.next.next;
            else
                break;
                
            
        }
        Node nh=d2.next;
        d2.next=null;
        p1.next=rev(nh);
        return d1.next;
        
   }


}
