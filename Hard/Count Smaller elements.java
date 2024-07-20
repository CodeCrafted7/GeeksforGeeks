
class Solution {
    int bs(ArrayList<Integer> t,int key){
        int i=-1;
        int low = 0,high = t.size()-1,mid;
        while(low<=high){
            mid = (low+high)/2;
            
            if(t.get(mid)==key){
                i = mid;
                high  = mid-1;
            }
            else if(t.get(mid)>key) high = mid-1;
            else    low = mid+1;
        }
        return i;
    }
    
    
    int[] constructLowerArray(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0;i<n;i++)    temp.add(arr[i]);
        Collections.sort(temp);
        for(int i=0;i<n;i++){
            int index = bs(temp,arr[i]);
            ans[i] = index;
            temp.remove(index);
        }
        return ans;
    }
}
