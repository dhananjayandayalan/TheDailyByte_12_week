package TheDailyByte_12_week;

public class Reverse_List {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Node result = reverse_list(head);
        while(result != null){
            System.out.print(result.value + "->");
            result = result.next;
        }
        System.out.print("null");
    }

    private static Node reverse_list(Node head) {

        //Iterative O(N) O(1)
        /*  Node prev = null;
        while(head != null){
            Node next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;
        }
        return prev;     */

        //recursive O(N) O(1)
        if(head == null || head.next == null) return head;

        Node prev = reverse_list(head.next);
        head.next.next = head;
        head.next = null;

        return prev;
    }

}
