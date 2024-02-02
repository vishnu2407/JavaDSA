package SortedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.awt.AWTEventMulticaster.add;

public class AddTwoNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        //add l1+l2 on list and print
        int[] l1 = nextIntArray(sc);
        int[] l2 = nextIntArray(sc);
        list = add(l1, l2);
        System.out.println(list);
    }

    private static int[] nextIntArray(Scanner sc) {
        return null;
    }

    private static List<Integer> add(int[] l1, int[] l2) {
        l1 = new int[]{9, 9, 9, 9, 9, 9, 9};
        l2 = new int[]{9, 9, 9, 9};
        List<Integer> list = new ArrayList<>();
        int i = l1.length - 1;
        int j = l2.length - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0)
                sum += l1[i];
            if (j >= 0)
                sum += l2[j];
            list.add(sum % 10);
            carry = sum / 10;
            i--;
            j--;
        }
        if (carry != 0)
            list.add(carry);
        return list;
    }
}
