package demo;

import datastructure.QueueArrayImp;
import datastructure.QueueListImp;

public class Demo {
    public static void main(String[] args){
        QueueListImp <String> queueListImp = new QueueListImp<>();
        queueListImp.add("first");
        queueListImp.add("2");
        queueListImp.add("3");
        System.out.println(queueListImp.poll());
        System.out.println(queueListImp.poll());
        System.out.println(queueListImp.peek());
        System.out.println(queueListImp.isEmpty());

        QueueArrayImp<String> queueArrayImp = new QueueArrayImp<>();
        queueArrayImp.add("first");
        queueArrayImp.add("2");
        queueArrayImp.add("3");
        System.out.println(queueArrayImp.poll());
        System.out.println(queueArrayImp.poll());
        System.out.println(queueArrayImp.peek());
        System.out.println(queueArrayImp.isEmpty());
        queueArrayImp.add("4");
        queueArrayImp.add("5");
        queueArrayImp.add("6");
        System.out.println(queueArrayImp.poll());
        System.out.println(queueArrayImp.poll());
        queueArrayImp.add("7");
        while (!queueArrayImp.isEmpty()){
            System.out.println(queueArrayImp.poll());
        }
    }
}
