package TheDailyByte;

public class Middle_Node {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
   //   head.next.next.next = new Node(4);

        System.out.println(middle(head));
    }

    private static int middle(Node head) {
        Node slow = head;
        Node fast = head;
        if(head == null || head.next == null) return head.value;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.value;
    }

}
