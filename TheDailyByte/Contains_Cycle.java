package TheDailyByte;

public class Contains_Cycle {

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        one.next = one;
        two.next = three;
        three.next = one;

        System.out.print(hascycle(one));


    }

    private static boolean hascycle(Node one) {

        if(one == null || one.next == null) return false;

        Node slow = one;
        Node fast = one.next;

        while(fast != null){
            if(slow == fast)
                return true;
            slow = slow.next;
            fast = fast.next.next;
        }

        return false;
    }

}
