

class Solution {
    // Make a sepated class for data storage (value and index)
    private class Pair {
        int val;
        int ind;
        
        public Pair(int val, int ind) {
            this.val = val;
            this.ind = ind;
        }
    }
    public int buyMaximumProducts(int n, int k, int[] price) {
        List<Pair> list = new ArrayList<Pair>();
        
        for (int i=0; i<n; i++) {
            list.add(new Pair(price[i], i+1));
        }
        // sort values by value
        Collections.sort(list, (a, b) -> {
            return (a.val - b.val);
        });
        
        int shubhcode = 0;
        for (int i=0; i<n; i++) {
            Pair node = list.get(i);
            int q = k/node.val;
            // Here i am optimize that remaining/current_value is Quantity
            if (q > node.ind) {
                shubhcode += node.ind;
                k -= node.val*node.ind;
            } else {
                shubhcode += q;
                k -= node.val*q;
            }
            // shubhcode += q;
        }
        
        return shubhcode;
        
    }
}
