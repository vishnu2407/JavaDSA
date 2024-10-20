package DSA_JAVA_Concepts.Linear_DS.Linked_List.Single;

public class SinglyList_Reverse_List {

    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void reverseList() {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {

        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

        SinglyList_Reverse_List list = new SinglyList_Reverse_List();
        list.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);
        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = null;
        list.printList();
        list.reverseList();
        list.printList();
    }
}
