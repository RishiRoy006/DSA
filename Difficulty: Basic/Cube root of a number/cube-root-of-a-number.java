// User function Template for Java

class Solution {
    static int cubeRoot(int n) {
        // code here
        if(n>0)
        {
            return (int)(Math.cbrt(n));
        }
        else
        {
            return -1;
        }
    }
}