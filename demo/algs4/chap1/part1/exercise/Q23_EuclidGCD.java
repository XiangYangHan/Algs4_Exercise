package algs4.chap1.part1.exercise;

import edu.princeton.cs.algs4.StdOut;

class Q23_EuclidGCD {
    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        int result = Q23.gcd(p, q);
        StdOut.printf("gcd %d %d result: %d\n\n", 105, 24, result);
    }
}
