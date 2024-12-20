package DSA_JAVA_Concepts.Linear_DS.Linked_List.Single;

public class SinglyList_Strings {
    private ListNode head;

    private static class ListNode {
        private String data;
        private ListNode next;

        public ListNode(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

        SinglyList_Strings list = new SinglyList_Strings();

        list.head = new ListNode("Vishnu");
        ListNode second = new ListNode("Vamshi");
        ListNode third = new ListNode("Subhash");

        list.head.next = second;
        second.next = third;

        ListNode current = list.head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("NULL");
    }
}
