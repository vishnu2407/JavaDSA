package Switch_Statements;

public class EnglishLetter {
    public static void main(String[] args) {
        String s = "Hello Vishnu Welcome to Java Programming";
        int[] up = new int[26];
        int[] lo = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                up[s.charAt(i) - 'A']++;
            } else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                lo[s.charAt(i) - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (up[i] > 0) {
                System.out.print((char) ('A' + i) + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < 26; i++) {
            if (lo[i] > 0) {
                System.out.print((char) ('a' + i) + " ");
            }
        }
    }
}
