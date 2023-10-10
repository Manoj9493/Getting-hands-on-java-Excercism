import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.NoSuchElementException;


class Node<T> {
    public T data;
    public Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class SimpleLinkedList<T> {
    private Node<T> head;

    SimpleLinkedList() {
        this.head = null;
    }

    SimpleLinkedList(T[] values) {
        for (T value : values) {
            push(value);
        }
    }

    void push(T value) {
        Node<T> newNode = new Node<T>(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    T pop(){
        if (head == null)
            throw new NoSuchElementException("The list is empty");
        T data;
        if (head.next == null) {
            data = head.data;
            head = null;
        } else {
            Node<T> temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = null;
        }
        return data;
    }

    void reverse() {
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

     T[] asArray(Class<T> clazz) {
        reverse();
        ArrayList<T> list = new ArrayList<T>();
        Node<T> temp = head;
        
        while (temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        
        T[] array = (T[]) Array.newInstance(clazz, list.size());
        return list.toArray(array);
    }

    int size() {
        int count = 0;
        Node<T> temp;
         for (temp = head; temp != null; temp = temp.next) {
            count++;
        }
         return count;
    }
}
