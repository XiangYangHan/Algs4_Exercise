package algs4.chap1.part1.exercise;

import edu.princeton.cs.algs4.StdOut;

public class Q22_DisplayBinarySearchProcess {
    public static void main(String[] args) {
        int result = rank(55, new int[] { 1, 2, 3, 11, 17, 20, 26, 33, 38, 45, 55 });
        StdOut.println();
        StdOut.printf("index: %d", result);
    }

    public static int rank(int key, int[] a) {
        StdOut.printf("search for: %d\n", key);
        StdOut.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i > 0) {
                StdOut.printf(" ");
            }
            StdOut.printf("%2d", a[i]);
        }
        StdOut.print("]");
        StdOut.println();
        StdOut.printf(" ");
        for (int i = 0; i < a.length; i++) {
            if (i > 0) {
                StdOut.printf(" ");
            }
            StdOut.printf("%2d", i);
        }
        StdOut.printf(" ");
        StdOut.println();
        return rank(key, a, 0, a.length - 1, 1);
    }

    public static int rank(int key, int[] a, int lo, int hi, int dth) {
        StdOut.printf("depth: %d\n", dth);

        // 如果key存在于a[]中，它的索引不会小于lo且不会大于hi
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;

        StdOut.printf(" ");
        for (int i = 0; i < a.length; i++) {
            if (i > 0) {
                StdOut.printf(" ");
            }
            if (i == hi || i == lo) {
                StdOut.printf("%2d", a[i]);

            } else {
                StdOut.printf("  ");
            }
        }
        StdOut.printf(" ");
        StdOut.println();

        if (a[mid] > key) {
            return rank(key, a, lo, mid - 1, dth + 1);
        } else if (a[mid] < key) {
            return rank(key, a, mid + 1, hi, dth + 1);
        } else {
            return mid;
        }
    }

}
