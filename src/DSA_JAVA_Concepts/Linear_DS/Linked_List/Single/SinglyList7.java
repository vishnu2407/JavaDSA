package DSA_JAVA_Concepts.Linear_DS.Linked_List.Single;

public class SinglyList7 {

    private ListNode head;

    private static class ListNode{

        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void swapNodes(int x, int y) {
        if (x == y) {
            return;
        }
        ListNode prevX = null, currX = head;
        while (currX != null && currX.data != x) {
            prevX = currX;
            currX = currX.next;
        }
        ListNode prevY = null, currY = head;
        while (currY != null && currY.data != y) {
            prevY = currY;
            currY = currY.next;
        }
        if (currX == null || currY == null) {
            return;
        }
        if (prevX != null) {
            prevX.next = currY;
        } else {
            head = currY;
        }
        if (prevY != null) {
            prevY.next = currX;
        } else {
            head = currX;
        }
        ListNode temp = currY.next;
        currY.next = currX.next;
        currX.next = temp;
    }
    public void printList() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {

        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

        SinglyList7 list = new SinglyList7();
        list.head = new ListNode(10);
        list.head.next = new ListNode(8);
        list.head.next.next = new ListNode(4);
        list.head.next.next.next = new ListNode(2);
        list.head.next.next.next.next = new ListNode(0);
        list.swapNodes(2, 8);
        System.out.println("Linked List after swapping:");
        list.printList();
    }
}
