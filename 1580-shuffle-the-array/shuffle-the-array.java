class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ctr=0;
        int ans[]=new int[nums.length];
        for(int i=0;i<n;i++)
        {
            ans[ctr]=nums[i];
            ctr+=2;
        }
        ctr=1;
        for(int j=n;j<nums.length;j++)
        {
            ans[ctr]=nums[j];
            ctr+=2;
        }
        return ans;
    }
}