class Solution{
    //Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i<=N; i++)
            map.put(i, 0);
            
        for(int i = 0; i<N; i++)
        {
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i])+1);
            
        }
            
        int ctr = 0;
            
        for(Integer i: map.values())
            arr[ctr++] = i;
    }
}
