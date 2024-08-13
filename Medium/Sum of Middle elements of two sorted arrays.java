class Solution {
    public int sumOfMiddleElements(int[] arr1,int[] arr2) {
        ArrayList<Integer> tk=new ArrayList<>();
        for(int i:arr1) tk.add(i);
        for(int i:arr2) tk.add(i);
        Collections.sort(tk);
        int i=tk.size()/2;
        if(tk.size()%2==1)  return tk.get(i);
        return tk.get(i--)+tk.get(i); 
    }
}
