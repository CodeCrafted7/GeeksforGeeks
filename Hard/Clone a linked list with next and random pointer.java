class Clone
{
    
    Node copyList(Node head) 
    {
        if (head == null)
        return head;
        Node curr = head;
        
        while(curr != null){
            Node newnode = new Node(curr.data);
            newnode.next = curr.next;
            curr.next = newnode;
            curr = newnode.next;
            }
        
        curr = head;
        while(curr != null){
            if(curr.arb != null){
                
               curr.next.arb = curr.arb.next;
            }
             curr = curr.next.next;
        }
       
        curr = head;
        Node clone = head.next;
        Node clonecurr = clone;
        
        while(clonecurr.next != null ){
            
            curr.next = curr.next.next;
            clonecurr.next = clonecurr.next.next;
            curr = curr.next;
            clonecurr = clonecurr.next;
            
        }
        curr.next = null;
        clonecurr.next = null;
        
        return clone;
    }
}
