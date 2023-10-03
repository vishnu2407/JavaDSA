package ListPackages;

import java.util.ArrayList;
import java.util.List;

public class ListExample3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int index = list.indexOf(2);
        System.out.println(index);
    }
}
