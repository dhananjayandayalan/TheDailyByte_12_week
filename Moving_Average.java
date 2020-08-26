package TheDailyByte_12_week;

import java.util.*;

public class Moving_Average {

    public static void main(String[] args) {

        MovingAverage m = new MovingAverage(3);

        System.out.println((int)m.next(3));
        System.out.println((int)m.next(5));
        System.out.println((int)m.next(7));
        System.out.println((int)m.next(6));

    }

    public static class MovingAverage {

        private static Queue<Integer> queue;
        private double sum;
        private int size;

        public MovingAverage(int size){
            queue = new LinkedList<>();
            this.size = size;
        }

        public double next(int val){
            if(queue.size() == 3)
                sum -= queue.poll();
            queue.add(val);
            sum += val;

            return sum / queue.size();
        }

    }
}
