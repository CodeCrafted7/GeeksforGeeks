class Solution {
    public static int floor(Node root, int x) {
        // Code here
        int mx=-1;
        while(root!=null){
            if(root.data>x){
                root=root.left;
            }
            else{
                if(root.data>mx){
                    mx=root.data;
                }
                root=root.right;
            }
        }
        return mx;
    }
}
