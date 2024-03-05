package algs4.chap1.part1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {
        // q1();
        // q2();
        // q3(args);
        // q5();
        // q6();
        // q7();
        // q8();
        /*
        q9(10);
        q9(11);
        q9(16);
        */
        // q11();
        // q12();
        // q13();
        /*
        q14(1);
        q14(10);
        q14(16);
        q14(20);
        q14(50);
        */
        // q15();
        // q16();
        // q18();
        q19();

    }

    private static void q19() {
        for (int N = 0; N < 100; N++) {
            StdOut.println(N + " " + F(N));
        }
    }

    private static int F(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1) {
            return 1;
        }
        return F(N - 1) + F(N - 2);
    }

    private static void q18() {
        StdOut.println(mystery(2, 25));
        StdOut.println(mystery(3, 11));

        StdOut.println(mystery_2(2, 2));
        StdOut.println(mystery_2(3, 3));
        StdOut.println(mystery_2(5, 2));
    }

    /*
        返回 a ^ b
     */
    private static int mystery_2(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b % 2 == 0) {
            return mystery_2(a * a, b / 2);
        }
        return mystery_2(a * a, b / 2) * a;
    }

    /*
        返回 a * b
     */
    private static int mystery(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b % 2 == 0) {
            return mystery(a + a, b / 2);
        }
        return mystery(a + a, b / 2) + a;
    }

    private static void q16() {
        StdOut.println(exR1(6));
        StdOut.println(exR1(10));
    }

    private static String exR1(int n) {
        if (n <= 0) {
            return "";
        }
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }

    private static void q15() {
        StdRandom.setSeed(9999);

        int[] a = new int[100];
        int M = 500;
        for (int i = 0; i < a.length; i++) {
            a[i] = StdRandom.uniformInt(M * 2);
        }
        int r[] = histogram(a, M);
        int t = 0;
        for (int i = 0; i < r.length; i++) {
            t += r[i];
        }
        StdOut.printf("length of a: %d, sum to index of r: %d", a.length, t);
    }

    private static int[] histogram(int[] a, int m) {
        int[] r = new int[m];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < r.length) {
                r[a[i]]++;
            }
        }
        return r;
    }

    private static void q14(int n) {
        int c = -1;
        int t = 1;
        while (t <= n) {
            t = t * 2;
            c++;
        }
        StdOut.printf("le ln(%d) max int: %d\n", n, c);
    }


    private static void q13() {
        int m = 6, n = 8;
        int[][] a = new int[m][n];
        StdRandom.setSeed(1000);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = StdRandom.uniformInt(100);
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                StdOut.printf("%3d", a[i][j]);
            }
            StdOut.println();
        }
        int[][] b = new int[n][m];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j];
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                StdOut.printf("%3d", b[i][j]);
            }
            StdOut.println();
        }
    }


    private static void q12() {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = a.length - 1 - i;
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = a[a[i]];
            StdOut.println(Arrays.toString(a));
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


    private static void q11() {
        boolean[][] t = new boolean[10][10];
        StdRandom.setSeed(100);
        for (int i = 0; i < 30; i++) {
            int m = StdRandom.uniformInt(10);
            int n = StdRandom.uniformInt(10);
            t[m][n] = !t[m][n];
            StdOut.printf("t[%d][%d]: %b\n", m, n, t[m][n]);
        }

        StdOut.printf("%5s", "");
        for (int i = 0; i < t[0].length; i++) {
            StdOut.printf(" %s ", i);
        }
        StdOut.println();
        for (int i = 0; i < t[0].length; i++) {
            StdOut.printf("%5s", i);
            for (int j = 0; j < t[i].length; j++) {
                StdOut.printf(" %s ", t[i][j] ? "*" : " ");
            }
            StdOut.println();
        }
    }

    // public static void q10() {
    //     int[] a;
    //     for (int i = 0; i < 10; i++) {
    //         a[i] = i * i;
    //     }
    // }

    public static void q9(int n) {
        String s = "";
        while (n > 0) {
            s = (n & 1) + s;
            n >>= 1;
        }
        StdOut.println(s);
    }

    public static void q8() {
        StdOut.println('b');
        StdOut.println('b' + 0);
        StdOut.println('b' + 'c');
        StdOut.println((char) ('a' + 4));
    }

    public static void q7() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > 0.000001) {
            t = (9.0 / t + t) / 2.0;
        }
        StdOut.printf("%.10f\n", t);
        StdOut.println();

        for (int k = 2; k < 10; k++) {
            int sum = 0;
            for (int i = 1; i < k; i++) {
                for (int j = 0; j < i; j++) {
                    sum++;
                }
            }
            StdOut.printf("%3d: %5d\n", k - 1, sum);
        }
        StdOut.println();

        for (int k = 2; k < 100; k++) {
            int sum = 0;
            for (int i = 1; i < k; i *= 2) {
                for (int j = 0; j < i; j++) {
                    sum++;
                }
            }
            StdOut.printf("%3d: %5d\n", k - 1, sum);
        }

    }

    public static void q6() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }

    public static void q5() {
        double x = 0.001, y = 0.911;
        if (isBetweenZeroAndOne(x) && isBetweenZeroAndOne(y)) {
            StdOut.println(true);
        }
        else {
            StdOut.println(false);
        }
    }

    public static boolean isBetweenZeroAndOne(double num) {
        return num > 0 && num < 1;
    }

    // public static void q4() {
    //     int a = 0, b = 0;
    //     int c = 0;
    //     if (a > b) c = 0;
    //     else b = 0;
    // }

    public static void q3(String[] args) {
        int arg1 = Integer.parseInt(args[0]);
        int arg2 = Integer.parseInt(args[1]);
        int arg3 = Integer.parseInt(args[2]);
        StdOut.println(arg1 == arg2 && arg2 == arg3);
    }

    public static void q2() {
        StdOut.println((1 + 2.236) / 2);
        StdOut.println(1 + 2 + 3 + 4.0);
        StdOut.println(4.1 >= 4);
        StdOut.println(1 + 2 + "3");
    }

    public static void q1() {
        StdOut.println((0 + 15) / 2);
        StdOut.println(2.0e-6 * 100_000_000.1);
        StdOut.println(true && false || true && true);
    }

}
