package DSA_JAVA_Concepts.Linear_DS.Linked_List.Single;

public class SinglyList_Delete_num {
    //Write a function to delete the first occurrence of a given value in a singly linked list.
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void deleteNode(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == value) {
            head = head.next;
            return;
        }

        ListNode current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
            if (current.next.data == value) {
                current.next = current.next.next;

            }else{
                System.out.println("Value not found." + value + "Element not found.");
            }
        }
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

        SinglyList_Delete_num list = new SinglyList_Delete_num();
        list.head = new ListNode(100);
        ListNode second = new ListNode(200);
        ListNode third = new ListNode(300);
        list.head.next = second;
        second.next = third;
        list.printList();
        list.deleteNode(100);
        list.printList();
    }

}
