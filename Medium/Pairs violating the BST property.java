
class Solution {
    
    public static int pairsViolatingBST(int n, Node root) {
        int count=0;
        Stack<Node> st = new Stack<>();
        int pre[] = new int[n];
        Node t = root;
        int i=0;
        while(t!=null || !st.isEmpty()){
          while(t!=null){
                st.push(t);
                t=t.left;
            }  
            t = st.pop();
            pre[i++]=t.data;
             t=t.right;
        }
        for(i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(pre[i]>=pre[j]){
                    count++;
                }
            }
        }
        return count;

    }  
}
