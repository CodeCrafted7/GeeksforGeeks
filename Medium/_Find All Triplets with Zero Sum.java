class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        
        Set<List<Integer>> ans = new HashSet<>();
        Map<Integer,List<int[]>> map = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = arr[i] + arr[j];
                if(! map.containsKey(sum)){
                    map.put(sum,new ArrayList<>());
                }
                map.get(sum).add(new int[]{i,j});
            }
        }
        
        for(int i=0;i<arr.length;i++){
            
            int tar = -arr[i];
            
            if(map.containsKey(tar)){
                
                List<int[]> pairs = map.get(tar);
                for(int[] pair : pairs){
                    if(pair[0] != i && pair[1] != i){
                        List<Integer> curr = Arrays.asList(i,pair[0],pair[1]);
                        Collections.sort(curr);
                        ans.add(curr);
                    }
                }
            }
        }
        return new ArrayList<>(ans);
    }
}
