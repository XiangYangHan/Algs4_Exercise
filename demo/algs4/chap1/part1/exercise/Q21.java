package algs4.chap1.part1.exercise;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.LinkedList;
import java.util.List;

public class Q21 {
    public static void main(String[] args) {
        List<String> result = new LinkedList<>();
        while (!StdIn.isEmpty()) {
            result.add(compute(StdIn.readLine()));
        }
        StdOut.printf("%8s %3s %3s %6s\n", "name", "n1", "n2", "n1 / n2");

        result.forEach(StdOut::println);
    }

    public static String compute(String line) {
        String[] split = line.split("\\s+");
        String name = split[0];
        int n1 = Integer.parseInt(split[1]);
        int n2 = Integer.parseInt(split[2]);
        return String.format("%8s %3d %3d %6.3f", name, n1, n2, ((double) n1) / n2);
    }
}
