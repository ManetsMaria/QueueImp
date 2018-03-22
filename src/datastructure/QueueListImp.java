package datastructure;

public class QueueListImp <T> {

    private class Node{
        T object;
        Node next;
        Node previous;

        public Node(T obj){
            object = obj;
            previous = null;
            next = null;
        }
    }

    private Node first;
    private Node last;

    public boolean add(T element){
        if (first == null){
            first = new Node(element);
            last = first;
        }else{
            Node current = new Node(element);
            last.next = current;
            last = current;
        }
        return true;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public T peek(){
        if (!isEmpty()){
            return first.object;
        }
        return null;
    }

    public T poll(){
        if (!isEmpty()){
            T element = first.object;
            first = first.next;
            return element;
        }
        return null;
    }
}
