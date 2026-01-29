class Solution {
    public boolean isSameAfterReversals(int num) {
        int rev1=0,rev2=0,k=num;
        while(num>0)
        {
            int d=num%10;
            rev1=rev1*10+d;
            num=num/10;
        }
        while(rev1>0)
        {
            int d=rev1%10;
            rev2=rev2*10+d;
            rev1=rev1/10;
        }
        if(rev2==k)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}