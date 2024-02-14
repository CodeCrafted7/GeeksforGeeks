class Solution{
    private Map<Node, Node> map = new HashMap<>();
    Node cloneGraph(Node node){
        if (node == null) {
            return null;
        }
        if (map.containsKey(node)) {
            return map.get(node);
        }
        Node clone = new Node(node.val);
        map.put(node, clone);
        for (Node adjacent : node.neighbors) {
            clone.neighbors.add(cloneGraph(adjacent));
        }
        return clone;
    }
}
