package algs4.chap1.part1.exercise;

import edu.princeton.cs.algs4.StdOut;

public class Q23 {
    public static void main(String[] args) {
        int result = gcd(105, 24);
        StdOut.printf("gcd %d %d result: %d\n", 105, 24, result);
    }

    public static int gcd(int p, int q) {
        StdOut.printf("gcd: %d  %d\n", p, q);

        if (q == 0) {
            return p;
        }
        return gcd(q, p % q);
    }
}
