package ListPackages;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample
{
    public static void main(String[] args)
    {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);

        int size = queue.size();
        System.out.println(size);

        boolean element = queue.remove(0);
        System.out.println(element);

         element = queue.remove(1);
        System.out.println(element);

        element = queue.remove(2);
        System.out.println(element);

        element = queue.remove(3);
        System.out.println(element);

        element = queue.remove(4);
        System.out.println(element);

        element = queue.remove(5);
        System.out.println(element);


    }
}
