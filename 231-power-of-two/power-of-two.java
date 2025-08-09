class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==0)
        return false;
        if(n==1)
        return true;
        int a=0;
        while(n>0)
        {
            a=a+n%2;
            n=n/2;
        }
        if(a==1)
        return true;
        else
        return false;
    }
}