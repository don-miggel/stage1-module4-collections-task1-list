package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        Comparator<String> ListComparator = new ListComparator();
        sourceList.sort(ListComparator);
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        Double res1 =  5 * Double.parseDouble(a) *Double.parseDouble(a)  + 3;
        Double res2 =  5 * Double.parseDouble(b) *Double.parseDouble(b)  + 3;
        return res1.compareTo(res2);
   }
}
