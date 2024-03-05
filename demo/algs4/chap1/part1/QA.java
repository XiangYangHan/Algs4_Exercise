package algs4.chap1.part1;

import edu.princeton.cs.algs4.StdOut;

public class QA {
    public static void main(String[] args) {
        q3();
        q4();
        q7();
    }

    private static void q3() {
        int min = Integer.MIN_VALUE;
        StdOut.printf("%d abs: %d\n", min, Math.abs(min));
    }

    private static void q4() {
        StdOut.println(Double.POSITIVE_INFINITY);
        StdOut.println(Double.NaN);
        StdOut.println(Double.NEGATIVE_INFINITY);

        StdOut.println(Double.parseDouble(String.valueOf(Double.POSITIVE_INFINITY)));
        StdOut.println(Double.parseDouble(String.valueOf(Double.NaN)));
        StdOut.println(Double.parseDouble(String.valueOf(Double.NEGATIVE_INFINITY)));

        StdOut.println(Double.valueOf(String.valueOf(Double.POSITIVE_INFINITY)));
        StdOut.println(Double.valueOf(String.valueOf(Double.NaN)));
        StdOut.println(Double.valueOf(String.valueOf(Double.NEGATIVE_INFINITY)));

        StdOut.println(Double.valueOf(Double.POSITIVE_INFINITY));
        StdOut.println(Double.valueOf(Double.NaN));
        StdOut.println(Double.valueOf(Double.NEGATIVE_INFINITY));
    }

    private static void q7() {

        StdOut.printf("1.0 / 0.0: %f\n", 1.0 / 0.0);
        StdOut.printf("0.0 / 0.0: %f\n", 0.0 / 0.0);
        StdOut.printf("-1.0 / 0.0: %f\n", -1.0 / 0.0);

        StdOut.printf("2.0 / 0.0 == 1.0 / 0.0: %b\n", 2.0 / 0.0 == 1.0 / 0.0);
    }
}
