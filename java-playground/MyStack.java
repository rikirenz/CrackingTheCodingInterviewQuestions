import java.util.EmptyStackException;

// Implement a Stack from scratch


/**
 * Interface I need to implement:
 * 
 * peek() -> T
 * pop() -> T
 * push(T item) -> void 
 * isEmpty() -> bool
 */



public class MyStack<T>{

    public static class MyNode<T> {
        T data;
        MyNode<T> next;

        public MyNode(T d){
            data = d;
        }
    }

    MyNode<T> head;


    public T peek() {
        if (head == null) throw new java.util.EmptyStackException();
        return head.data;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void push(T item){
        MyNode<T> newNode = new MyNode<T>(item);
        if (head != null){
            newNode.next = head;
        }
        head = newNode;
    }

    public T pop(){
        if (head == null) throw new java.util.EmptyStackException();
        T returnValue = head.data;
        head = head.next;
        return returnValue;
    }


    public static void main(String[] args){
        MyStack<Integer> ciccio = new MyStack<Integer>();

        System.out.println("IsEmpty: " + ciccio.isEmpty());

        ciccio.push(1);
        ciccio.push(2);
        ciccio.push(3);
        ciccio.push(4);
        ciccio.push(5);
        ciccio.push(6);

        System.out.println("peek: " + ciccio.peek());

        System.out.println("pop 6: " + ciccio.pop());
        
        ciccio.push(7);

        System.out.println("pop again 7: " + ciccio.pop());
        System.out.println("pop again 5: " + ciccio.pop());
        System.out.println("pop again 4: " + ciccio.pop());
        System.out.println("pop again 3: " + ciccio.pop());
        System.out.println("pop again 2: " + ciccio.pop());
        System.out.println("pop again 1: " + ciccio.pop());
        System.out.println("pop again err: " + ciccio.pop());

    }

}

