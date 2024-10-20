package DSA_JAVA_Concepts.Linear_DS.Linked_List.Single;

public class SinglyList_LenghtEven {
    //Is Linked List Length Even or Odd?
    private ListNode head;
    //Node class
    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;

        }
    }
    //Function to check if linked list is even or odd
    public boolean isLengthEven(ListNode head) {
        int count = 0;
        ListNode current = head;
        while(current != null) {
            count++;
            current = current.next;
        }
        return count % 2 == 0;

        //Main Function
    }
    public static void main(String[] args) {
        SinglyList_LenghtEven list = new SinglyList_LenghtEven();
        list.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(2);
        ListNode fifth = new ListNode(0);
        ListNode sixth = new ListNode(12);
        ListNode seventh = new ListNode(6);
        list.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = null;
        list.printList();
        System.out.println(list.isLengthEven(list.head));

    }

    //Function to print the linked list
    private void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
