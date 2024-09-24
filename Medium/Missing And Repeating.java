class Solve {
    int[] findTwoElement(int nums[]) {
        int n = nums.length;
        int ans[] = new int[2];
        for(int i=0;i<n;i++){
            int el = Math.abs(nums[i]);
            if(nums[el-1]<0) ans[0] = el;
            else nums[el-1] *= -1;
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0)
                ans[1] = i+1;
        }
        return ans;
    }
}
