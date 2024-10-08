class Solution {
    static Node insert(Node head, int data) {
        Node newNode=new Node(data);
        newNode.npx=head;
        return newNode;
    }
    static ArrayList<Integer>  getList(Node head) {
            ArrayList<Integer> res=new ArrayList<>();
            while(head!=null){
                res.add(head.data);
                head=head.npx;
            }
            return res;
    }
}
