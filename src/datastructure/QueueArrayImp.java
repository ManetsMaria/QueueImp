package datastructure;

public class QueueArrayImp <T> {

    private Object [] mainArr;
    private int size;
    private static final int CAPACITY = 4;
    private int first;
    private int last;

    public QueueArrayImp(){
        mainArr = new Object[CAPACITY];
        size = 0;
        first = 0;
        last = first;
    }

    public boolean add(T element){
        if (size == CAPACITY){
            return false;
        }
        if (isEmpty()){
            mainArr[last] = element;
        } else {
            last = (last + 1) % CAPACITY;
            mainArr[last] = element;
        }
        size++;
        return true;
    }

    public T peek(){
        if (!isEmpty()){
            return (T) mainArr[first];
        }
        return null;
    }

    public T poll(){
        if (!isEmpty()){
            T element = (T) mainArr[first];
            first = (first + 1) % CAPACITY;
            size--;
            return element;
        }
        return null;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}
