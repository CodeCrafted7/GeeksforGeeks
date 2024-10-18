
class Solution {
    Node[] alternatingSplitList(Node head) {
      Node h1 = null,h2 = null,t1 = null,t2 = null;
      int count  = 0;
      while(head != null){
          if(count % 2 == 1){
              if(h2 == null){
                  h2 = head;
                  t2 = head;
              }else{
                  t2.next = head;
                  t2 = t2.next;
              }
          }else{
              if(h1 == null){
                  h1 = head;
                  t1 = head;
              }else{
                  t1.next = head;
                  t1 = t1.next;
              }
          }
          head = head.next;
          count++;
      }
      t1.next = null;
      t2.next = null;
      Node ans[] = new Node[2];
      ans[0] = h1;
      ans[1] = h2;
      return ans;
    }
}
