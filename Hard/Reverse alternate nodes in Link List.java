class Solution
{
    public static void rearrange(Node odd)
    {
        // add your code here
         if(odd.next==null ||odd.next.next==null) return;
         Node tail=odd;
         while(tail.next!=null)tail=tail.next;
         Node current=odd;
          Node nextNode=odd.next;
          while(current!=tail &&nextNode!=tail){
          current.next=nextNode.next;
          nextNode.next=tail.next;
          tail.next=nextNode;
          current=current.next;
          nextNode=current.next;
        }
        
       }
    
      }
