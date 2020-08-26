package TheDailyByte_12_week;

public class Returns_Cycle {

    public static void main(String[] args) {
     /* Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next; */

     /* Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3); */

        Node head = new Node(1);
        head.next = new Node(9);
        head.next.next = new Node(3);
        head.next.next.next = new Node(7);
        head.next.next.next.next = head.next.next.next;



        if(returncycle(head).value == -1)
            System.out.println("Has No Cycles");
        else
            System.out.println("Cycle Starts from Node "+ returncycle(head).value);

    }

    private static Node returncycle(Node head) {

        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast)
                break;
        }
        slow = head;
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
            if(slow == fast)
                return slow;
        }

        return new Node(-1);
    }


}
