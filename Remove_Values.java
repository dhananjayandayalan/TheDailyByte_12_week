package TheDailyByte_12_week;

public class Remove_Values {
    public static void main(String[] args) {
        Node list1 = new Node(7);
        list1.next = new Node(12);
        list1.next.next = new Node(2);
        list1.next.next.next = new Node(7);
        list1.next.next.next.next = new Node(9);
        list1.next.next.next.next.next = new Node(7);

        int value = 7;
        Node result = removevalues(list1, value);

        while(result != null){
            System.out.print(result.value + "->");
            result = result.next;
        }
        System.out.print("null");
    }

    private static Node removevalues(Node list1, int value) {
        while(list1 != null && list1.value == value)
            list1 = list1.next;
        Node current = list1;
        while(current.next != null){
            if(current.next.value == value){
                current.next = current.next.next;
            }
            else
            current = current.next;
        }

        return list1;
    }
}
