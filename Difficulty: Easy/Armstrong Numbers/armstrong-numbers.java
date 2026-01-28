// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int k=n,S=0;
        while(n>0)
        {
            int d=n%10;
            S+=(int)(Math.pow(d,3));
            n=n/10;
        }
        if(S==k)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}