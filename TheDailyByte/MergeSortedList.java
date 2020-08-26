package TheDailyByte;

public class MergeSortedList {
    public static void main(String[] args) {
       Node list1 =  new Node(4);
       list1.next = new Node(4);
       list1.next.next = new Node(7);
        Node list2 =  new Node(1);
        list2.next = new Node(5);
        list2.next.next = new Node(6);


        Node result = mergesortedlist(list1, list2);
        while(result != null){
            System.out.print(result.value + "->");
            result = result.next;
        }
        System.out.print("null");

    }

    private static Node mergesortedlist(Node list1, Node list2) {

        if(list1 == null) return list2;
        if(list2 == null) return list1;
        Node head = new Node(-1);
        Node result = head;

        while(list1 != null && list2 != null){
            if(list1.value < list2.value){
                head.next = list1;
                list1 = list1.next;
            }
            else{
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        if(list1 != null){
            head.next = list1;
        }else {
            head.next = list2;
        }

        return result.next;
    }
}
