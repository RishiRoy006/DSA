class Solution {
    public boolean isPowerOfThree(int n) {
        for(long i=0;i<=(int)(Math.sqrt(n));i++)
        {
            if((long)(Math.pow(3,i))==n)
            return true;
        }
        return false;
    }
}