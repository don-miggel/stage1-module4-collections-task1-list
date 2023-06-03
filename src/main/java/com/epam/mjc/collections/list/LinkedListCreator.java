package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> res = new LinkedList<>();

        for (int num: sourceList){
            if (num % 2 != 0)
                res.addFirst(num);
            else
                res.addLast(num);
        }

        return res;
    }
}
