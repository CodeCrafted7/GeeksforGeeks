class Solution {
    public static void find(ArrayList<Integer> list,Node root){
        if(root == null)return;
        find(list,root.left);
        list.add(root.key);
        find(list,root.right);
    }
    public static int findMaxForN(Node root, int n) {
        // Add your code here.
        ArrayList<Integer> list = new ArrayList<>();
        int val = -1;
        find(list,root);
        for(int i : list){
            if(i <= n)val = i;
            // else break;
        }
        return val;
    }
}
