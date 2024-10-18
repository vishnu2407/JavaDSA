package DSA_JAVA_Concepts.Linked_List.Single;


public class SinglyList1
{
    private ListNode head;

    private static class ListNode {
        private final int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        double now = System.currentTimeMillis();
        System.out.println(STR."Time taken: \{System.currentTimeMillis() - now}ms");

        SinglyList1 list = new SinglyList1();

        list.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);

        //Now we connect the nodes
        list.head.next = second; //10->8
        second.next = third; //10->8->1
        third.next = fourth; //10->8->1->11->NULL
        fourth.next = null;

        // print list
        ListNode current = list.head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("NULL");
    }
}
