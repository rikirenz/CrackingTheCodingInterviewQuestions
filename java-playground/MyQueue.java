/* FIFO - LILO
* Interface I would like to implement
* peek() -> T
* add(T) -> void 
* remove() -> T
* isEmpty() -> bool
*/

// Last                first
// [] <= [] <= ..... <= []


import java.util.NoSuchElementException;

public class MyQueue<T>{

    public static class MyNode<T>{
        T data;
        MyNode<T> next;

        public MyNode(T d){
            data = d;
        }
    }

    MyNode<T> first;
    MyNode<T> last;
    
    public boolean isEmpty(){
        return first == null;
    }

    public T peek(){
        if (first == null) throw new NoSuchElementException();
        return first.data;
    }


    public void add(T item){
        MyNode<T> newNode = new MyNode<T>(item);

        if (last!=null){
            last.next = newNode;
        }
        last = newNode;

        if (first == null){
            first = last;
        }
    }

    public T remove(){
        if (first == null) throw new NoSuchElementException();

        T returnValue = first.data;
        first = first.next;
        if (first == null){
            last = null;
        }

        return returnValue;
    }
    

    public static void main(String[] args) {
        MyQueue<Integer> ciccio = new MyQueue<Integer>();
        ciccio.add(1);
        ciccio.add(2);
        ciccio.add(3);
        ciccio.add(4);
        ciccio.add(5);
        ciccio.add(6);
        System.out.println("peek:" + ciccio.peek());
        System.out.println("remove:" + ciccio.remove());
        System.out.println("remove:" + ciccio.remove());
        System.out.println("remove:" + ciccio.remove());
        System.out.println("remove:" + ciccio.remove());
        System.out.println("remove:" + ciccio.remove());
        System.out.println("remove:" + ciccio.remove());
        System.out.println("peek:" + ciccio.peek());
        System.out.println("isEmpty:" + ciccio.isEmpty());
        
    }


}