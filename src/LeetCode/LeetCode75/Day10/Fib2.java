package LeetCode.LeetCode75.Day10;

public class Fib2 {
    public int fib(int n) {
        if(n<=1)
            return n;
        if(n==2)
            return 1;
        else {
            int x=1,y=1,z=0;
            for(int i=3;i<=n;i++) {
                z=x+y;
                x=y;
                y=z;
            }
            return z;
        }
    }
}
