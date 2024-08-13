package Hash_Tables;

import java.util.*;

class phoneBook {
    public static void main(String[] argh) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> phoneBook = new HashMap<>();

        // Reading the number of entries in the phone book
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        // Populating the phone book
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            int phone = scanner.nextInt();
            phoneBook.put(name, phone);
            scanner.nextLine(); // Consume newline
        }
        // Querying the phone book using the provided array
        String[] arr1 = {"Vishnu", "Vamshi", "Subhash"};
        for (String s : arr1) {
            if (phoneBook.containsKey(s)) {
                System.out.println(s + "=" + phoneBook.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        scanner.close();
    }
}
