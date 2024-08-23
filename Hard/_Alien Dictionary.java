
class Solution
{
    public static String findOrder(String[] dict, int N, int K) {
        Map<Character, List<Character>> graph = new HashMap<>();
        Set<Character> set = new HashSet<>();
        Map<Character,Integer> indegree=new HashMap<>();
        int i = 0;
        while (i < N - 1) {
            String x = dict[i];
            String y = dict[i + 1];
            int s = 0;
            int t = 0;
            while (s < x.length() && t < y.length()) {
                set.add(x.charAt(s));
                set.add(y.charAt(t));
                if (x.charAt(s) == y.charAt(t)) {
                    s++;
                    t++;
                } else {
                    if (graph.containsKey(x.charAt(s))) {
                        List<Character> l = graph.get(x.charAt(s));
                        l.add(y.charAt(t));
                        graph.put(x.charAt(s), l);
                    } else {
                        List<Character> l = new ArrayList<>();
                        l.add(y.charAt(t));
                        graph.put(x.charAt(s), l);
                    }
                    if(indegree.containsKey(y.charAt(t))){
                        int count=indegree.get(y.charAt(t));
                        indegree.put(y.charAt(t),count+1);
                    }else{
                        indegree.put(y.charAt(t),1);
                    }
                    break;
                }
            }
            i++;
        }
        StringBuilder ans= new StringBuilder();
        Set<Character> visited=new HashSet<>();
        Queue<Character> queue=new LinkedList<>();
        for(Character c:set){
            if(indegree.getOrDefault(c,0)==0){
                queue.add(c);
                ans.append(c);
                visited.add(c);
            }
        }
        while(!queue.isEmpty()){
            char c=queue.poll();

            for(Character m:graph.getOrDefault(c,new ArrayList<>())){
                int count=indegree.getOrDefault(m,0);
                count--;
                indegree.put(m,count);
                if(count==0 && !visited.contains(m)){
                    visited.add(m);
                    queue.offer(m);
                    ans.append(m);
                }
            }
        }
        return ans.toString();
    }
}
