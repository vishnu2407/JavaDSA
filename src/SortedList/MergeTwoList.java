package SortedList;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoList {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l2.add(4);
        l2.add(5);
        l2.add(6);
        list.addAll(l1);
        list.addAll(l2);
        System.out.println(list);
    }
}
