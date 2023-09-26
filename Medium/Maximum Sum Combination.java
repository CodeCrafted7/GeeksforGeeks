class Solution {
static List<Integer>maxCombinations(int N,int k,int A[],int B[])
{
   PriorityQueue<Integer> p = new PriorityQueue<>();
   List<Integer> list = new ArrayList<>();
   Arrays.sort(A);
   Arrays.sort(B);
   for(int i=N-1;i>N-k-1;i--)
   {
       for(int j=N-1;j>N-k-1;j--)
       {
           int sum = A[i]+B[j];
           if(p.size()<k)
           p.add(sum);
           else{
               
               if(p.peek()<sum)
               {
                   p.remove();
                   p.add(sum);
               }
               else 
               break;
           }
       }
   }
   while(p.size()>0)
   {
       list.add(0,p.poll());
   }
   
return list;
}
}
