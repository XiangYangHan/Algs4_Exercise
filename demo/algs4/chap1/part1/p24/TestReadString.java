package algs4.chap1.part1.p24;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.List;

public class TestReadString {
    public static void main(String[] args) {
        List<String> reads = new ArrayList<>();
        while (!StdIn.isEmpty()) {
            // reads.add(StdIn.readLine());
            reads.add(StdIn.readString());
        }
        StdOut.printf("Read lines count: %4d\n", reads.size());
        reads.forEach(StdOut::println);
    }
}
