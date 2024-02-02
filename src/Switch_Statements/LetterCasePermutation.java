package Switch_Statements;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    public static void main(String[] args) {
        String s1 ="a1b2";
        String s2 ="3z4";
        String s3 ="v1h5";

        letterCasePermutation(s1);
        letterCasePermutation(s2);
        letterCasePermutation(s3);

    }
    private static void letterCasePermutation(String s1) {

        List<String> list = new ArrayList<>(s1.length());
        for (char c : s1.toCharArray()) {
            if (Character.isDigit(c)) {
                list.add(Character.toString(c));
            } else {
                list.add(Character.toString(Character.toUpperCase(c)));
                list.add(Character.toString(Character.toLowerCase(c)));
            }
        }
        System.out.println(list);
    }



}
