class GfG {
    public static Node merge(Node a,Node b){
        
        Node dummy=new Node(10);
        Node ta=dummy;
        while(a!=null && b!=null){
            
            if(a.data<=b.data){
                ta.next=a;
                ta=ta.next;
                a=a.next;
            }
            else{
                ta.next=b;
                ta=ta.next;
                b=b.next;
                
            }
        }
        
        if(a==null){
            ta.next=b;
        }
        else{
            ta.next=a;
        }
        return dummy.next;
    }
    public static Node quickSort(Node node) {
        if(node==null || node.next==null)return node;
        
        Node slow=node;
        Node fast=node;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
       
       Node a=node;
       Node b=slow.next;;
        slow.next=null;
        a=quickSort(a);
        b=quickSort(b);
        Node c= merge(a,b);
        return c;
    }
}
