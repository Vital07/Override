package com.company;

import java.util.Comparator;

/**
 * Created by Dasha on 08.11.2016.
 */
public class CompareByK implements Comparator<Pair> {
    @Override
    public int compare(Pair o1, Pair o2) {
        {
            if (o1.getk() < o2.getk())
                return -1;
            else if (o1.getk() > o2.getk())
                return 1;
            return 0;
        }
    }

}