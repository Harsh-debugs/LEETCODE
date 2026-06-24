class Solution {
    public int climbStairs(int n) {
        int x=1;
        int y=2;
        int count=0;
        if(n==1) return x;
        if(n==2) return y;
        for(int i=2;i<n;i++){
            count=x+y;
            x=y;
            y=count;
        }
        return count;
    }
}