package amigos.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {

    record Person(String name,int age){ }

    public static void main(String[] args) {
        queues();
    }

    private static void queues() {
        Queue<Person> queue = new LinkedList<>();

        queue.add(new Person("Thomas", 45));
        queue.add(new Person("Aga", 42));
        queue.add(new Person("Gregor", 59));

        System.out.println(queue.size());
        //System.out.println(supermarket.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.size());
        System.out.println(queue.element());

        if(queue.contains(new Person("Thomas",45))){
            System.out.println("Thomas is in the qiue.");
        }
    }


}
