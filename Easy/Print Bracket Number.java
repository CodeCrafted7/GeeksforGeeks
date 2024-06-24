class Solution {
    ArrayList<Integer> bracketNumbers(String str) {
        
        int open = 0;
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '('){
                arr.add(++open);
                stack.push(open);
            }
            else if(str.charAt(i) == ')'){
                arr.add(stack.pop());
            }
        }
        return arr;
    }
};
