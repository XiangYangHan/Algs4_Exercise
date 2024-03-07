package algs4.chap1.part1.exercise;

import edu.princeton.cs.algs4.StdOut;

/**
 * 编写一个递归的静态方法计算ln(N!)的值
 */
public class Q20_FactorialLog {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            StdOut.printf("ln(%2d!) = %7.3f\n", i, factorialLog(i));
        }
    }

    public static double factorialLog(int N) {
        if (N <= 1) {
            return 0;
        }
        return Math.log(N) + factorialLog(N - 1);
    }
}
