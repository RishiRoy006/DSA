class Solution {
    public int[] runningSum(int[] nums) {
        int sum[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int S=0;
            for(int j=0;j<=i;j++)
        {
            S=S+nums[j];
        }
        sum[i]=S;
        }
        return sum;
    }
}