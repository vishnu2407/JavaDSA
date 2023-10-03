package ListPackages;

import java.util.ArrayList;
import java.util.List;

public class ListExample4
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);

        list.sort(Integer::compareTo);
        System.out.println(list);


    }
}
