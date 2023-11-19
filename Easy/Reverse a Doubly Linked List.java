*/
public static Node reverseDLL(Node head)
{
    Node p = head, pre = null;
        
    while(p != null) {
        Node nxt = p.next;
        p.next = pre;
        p.prev = nxt;
        
        pre = p;
        p = nxt;
    }
    
    return pre;
}
