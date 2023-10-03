package ListPackages;

import java.util.*;

public class StackExample
{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);

        int element = stack.remove(stack.size() - 1);
        System.out.println(element);

        element = stack.remove(stack.size() - 1);
        System.out.println(element);

        element = stack.remove(stack.size() - 1);
        System.out.println(element);

        element = stack.remove(stack.size() - 1);
        System.out.println(element);

        element = stack.remove(stack.size() - 1);
        System.out.println(element);

        System.out.println(stack);
    }
}
