

/*class Tree{
int data;
    Tree left;
    Tree right;
    Tree(int d){
        data=d;
        left=null;
        right=null;
    }
}

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/


class GfG

{

    //Function to make binary tree from linked list.

    public static Tree convert(Node head, Tree node) {

        // add code here.}

        

        if (head == null) return null;

        ArrayList<Tree> ls = new ArrayList<>();

        

        while(head != null){

            Tree tree = new Tree(head.data);

            ls.add(tree);

            head = head.next;

        }

        

        int n = ls.size();

        

        for(int i=0; i<n/2; i++){

            if(2*i+1 < n){

               ls.get(i).left = ls.get(2*i+1); 

            }

            if(2*i+2 < n){

               ls.get(i).right = ls.get(2*i+2); 

            }

        }

        

        return ls.get(0);

    }

}
