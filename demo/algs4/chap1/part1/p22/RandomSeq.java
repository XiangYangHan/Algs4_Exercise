package algs4.chap1.part1.p22;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomSeq {
    public static void main(String[] args) {
        // 打印N个（lo，hi）之间的随机值
        int N = Integer.parseInt(args[0]);
        double lo = Double.parseDouble(args[1]);
        double hi = Double.parseDouble(args[2]);
        for (int i = 0; i < N; i++) {
            double x = StdRandom.uniformDouble(lo, hi);
            StdOut.printf("%.2f\n", x);
        }
    }
}
