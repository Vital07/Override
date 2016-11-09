package com.company;

/**
 * Created by Dasha on 07.11.2016.
 */
public final class Pair {
    private final double k;
    private final double x1;
    private final double x2;

    public Pair(double k, double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
        this.k = x1+x2;
    }

    public double getk() {
        return k;
    }

    public double getx1() {
        return x1;
    }

    public double getx2() {
        return x2;
    }

    @Override
    public String toString() {
        return "(" + k + ", " + x1 + ", " + x2 + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pair pair = (Pair) o;

        return Double.compare(pair.k, k) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(k);
        return (int) (temp ^ (temp >>> 32 ));
    }
}
