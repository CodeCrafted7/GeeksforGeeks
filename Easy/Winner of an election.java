
class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        Map<String, Integer> hm = new HashMap<>();
        for(String temp : arr) {
            hm.put(temp, hm.getOrDefault(temp, 0)+1);
        }
        
        String[] ans = {"", "0"};
        
        for(Map.Entry<String, Integer> entry: hm.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            
            int temp = Integer.parseInt(ans[1]);
            
            if (value > temp || (value == temp && key.compareTo(ans[0]) < 0)) {
                ans[0] = key;
                ans[1] = String.valueOf(value);
            }
            
        }
        
        return ans;
    }
}
