package TheDailyByte;

import java.util.*;

public class Call_Counter {


    private static class counter {
        private Queue<Integer> queue;

        private counter() {
            queue = new LinkedList<>();
        }

        public int ping(int t) {
            queue.add(t);
            while (queue.peek() < t - 3000)
                queue.poll();
            return queue.size();

        }
    }



    public static void main(String[] args) {

        counter call = new counter();

        System.out.println(call.ping(1));
        System.out.println(call.ping(300));
        System.out.println(call.ping(3000));
        System.out.println(call.ping(3002));
        System.out.println(call.ping(7000));

    }



}
