

class customSort implements Comparator<Pair>{
    @Override
    public int compare (Pair p1 , Pair p2){
        return p1.first-p2.first;
    }
}

    class Pair{
        int first;
        int second;
        public Pair(int first,int second){
            this.first = first;
            this.second = second;
    }
    }
    
    
class Solution
{
    int min_sprinklers(int gallery[], int n) {
        // code here

        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (gallery[i] == -1) {
                continue;
            }
            int x = (i - gallery[i]) < 0 ? 0 : i - gallery[i];
            int y = (i + gallery[i]) < n ? i + gallery[i] : n-1;
            list.add(new Pair(x, y));
        }

        Collections.sort(list, new customSort());
        
        int count = 0 ;
        int x = 0;
        int i = 0;
        int curr = Integer.MIN_VALUE;
        while(x<=n-1){
            curr = Integer.MIN_VALUE;
            while(i<list.size() && list.get(i).first<=x){
                curr = Math.max(curr,list.get(i).second);
                i++;
            }
            if(curr==Integer.MIN_VALUE){
                return -1;
            }
            x = curr + 1;
            count++;
            
                
        }
        return count;
    }

}
