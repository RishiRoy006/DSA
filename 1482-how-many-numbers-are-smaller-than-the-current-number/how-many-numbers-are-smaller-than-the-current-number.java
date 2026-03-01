class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int min=nums[i];
            int ctr=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]<min)
                {
                    ctr++;
                }
            }
            ans[i]=ctr;
        }
        return ans;
    }
}