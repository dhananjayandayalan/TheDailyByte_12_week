package TheDailyByte;

import java.util.*;

public class Queue_Stack {

    public static void main(String[] args) {
        QueueStack qs = new QueueStack();

        qs.push(10);
        qs.push(20);
        qs.push(30);
        qs.push(40);
        qs.pop();
        System.out.println(qs.peek());
        System.out.println(qs.empty());
        qs.pop();
        qs.pop();
        qs.pop();
        System.out.println(qs.empty());


    }
    public static class QueueStack {

        private static Stack<Integer> push;
        private static Stack<Integer> pop;

        private QueueStack(){
            push = new Stack();
            pop = new Stack();
        }


        public void push(int value) {
            push.push(value);
        }


        public int pop() {

            if(pop.isEmpty()){
                while(!push.isEmpty()){
                    pop.push(push.pop());
                }
            }
            if(!pop.isEmpty()){
                return pop.pop();
            }
            return -1;

        }

        public boolean empty() {
            return push.isEmpty() && pop.isEmpty();
        }

        public int peek() {
            if(!pop.isEmpty()){
                return pop.peek();
            }
            return -1;
        }
    }

}
