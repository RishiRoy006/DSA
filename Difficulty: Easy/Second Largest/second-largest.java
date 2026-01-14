class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int max=0,secondMax=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secondMax=max;
                max=arr[i];
            }
            else if(arr[i]>secondMax&&arr[i]!=max)
            {
                secondMax=arr[i];
            }
        }
        return secondMax;
    }
}