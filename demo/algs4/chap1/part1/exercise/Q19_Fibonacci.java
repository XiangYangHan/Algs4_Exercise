package algs4.chap1.part1.exercise;

import edu.princeton.cs.algs4.StdOut;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Q19_Fibonacci {
    private static final Map<Integer, BigInteger> FIBONACCI_RESULT_CACHE = new HashMap<>();

    static {
        FIBONACCI_RESULT_CACHE.put(0, BigInteger.valueOf(0));
        FIBONACCI_RESULT_CACHE.put(1, BigInteger.valueOf(1));
    }

    private static BigInteger F(int N) {
        // return FIBONACCI_RESULT_CACHE.computeIfAbsent(N, n -> F(n - 1) + F(n - 2));

        if (FIBONACCI_RESULT_CACHE.containsKey(N)) {
            return FIBONACCI_RESULT_CACHE.get(N);
        }
        BigInteger result = F(N - 1).add(F(N - 2));
        FIBONACCI_RESULT_CACHE.put(N, result);
        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            StdOut.printf("%3d %s\n", i, String.valueOf(F(i)));
        }
        StdOut.printf("max %s\n", String.valueOf(Long.MAX_VALUE));
    }
}
