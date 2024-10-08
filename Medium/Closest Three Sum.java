
class Solution {
    static int threeSumClosest(int[] array, int target) {
        int diff = Integer.MAX_VALUE,ans=0;
        Arrays.sort(array);
        for(int i=0;i<array.length-2;i++)
        {
            int j=i+1,k=array.length-1;
            while(j<k)
            {
             int sum = array[i]+array[j]+array[k];    
             int d = Math.abs(sum-target);
             if(d<diff)
             {
                 diff = d;
                 ans = sum;
             }
             else if(d==diff){
                 ans=Math.max(ans,sum);
             }
             if(sum<target) j++;
             else if(sum==target)   return sum;
             else k--;
             
            }
        }
        return ans;
    }
}
