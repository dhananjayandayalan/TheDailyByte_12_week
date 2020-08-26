package TheDailyByte_12_week;

public class Remove_Nth_Node_From_Last {

    public static void main(String[] args) {
        Node list =  new Node(1);
        list.next = new Node(2);
        list.next.next = new Node(3);
        Node result = solve(list, 3);
        while(result != null){
            System.out.print(result.value + "->");
            result = result.next;
        }
        System.out.print("null");
    }

    private static Node solve(Node list, int i) {
        Node slow = list;
        Node fast = list;

        while(i > 0){
            fast = fast.next;
            i--;
        }
        if(fast == null) return list.next;
        Node head = slow;
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return head;
    }


}
