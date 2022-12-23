package LeetCode.LeetCode75.Day10;

public class Fib {
    public static void main(String[] args) {

    }
    public int fib(int n) {
        if(n<=1)
            return n;
        return fib(n-1) + fib(n-2);
    }
}
