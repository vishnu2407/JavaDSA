package DSA_JAVA_Concepts.Array;

import java.util.Scanner;

class Main {

    public static String FindIntersection(String s) {
        String[] strArr = new String[]{"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"};
        // code goes here
        String str1 = strArr[0];
        String str2 = strArr[1];
        String result = "";
        for(String chk: str1.split(", ")){
            for(String chk2: str2.split(", ")){
                if(chk.equals(chk2)){
                    if(result.length()==0){
                        result+=chk;
                    }
                    else {
                        result+=","+chk;
                    }
                }
            }
        }
        if(result.isEmpty())
            return "false";
        return result;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FindIntersection(s.nextLine()));
    }

}