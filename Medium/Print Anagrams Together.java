class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        ArrayList<ArrayList<String>> ans  = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        
        for(String s : arr){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String st = String.valueOf(ch);
           
           if(! map.containsKey(st)){
               map.put(st, new ArrayList());
           }
           
           map.get(st).add(s);
        }
        return new ArrayList(map.values());
    }
}
