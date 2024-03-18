package algs4.chap1.part2;

import edu.princeton.cs.algs4.StdOut;

public class Counter {
    private final String name;
    private int count;

    public Counter(String name) {
        this.name = name;
    }

    public void increment() {
        count++;
    }

    public int tally() {
        return count;
    }

    @Override
    public String toString() {
        return name + "  " + count;
    }

    public static void main(String[] args) {
        Counter heads = new Counter("heads");
        Counter tails = new Counter("tails");

        heads.increment();
        heads.increment();
        tails.increment();
        heads.increment();

        StdOut.println(heads + "  " + tails);
        StdOut.println(heads.tally() + tails.tally());
    }

}
