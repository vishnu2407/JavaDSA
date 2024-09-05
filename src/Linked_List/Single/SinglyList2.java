package Linked_List.Single;

public class SinglyList2 {
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

        SinglyList2 list = new SinglyList2();

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
