/*
Implement a linked list with the following interface:

appendToTail(int i) -> void
delete(Node head, int i) -> Node head

*/

public class MyNode {

    int data;
    MyNode next;

    public MyNode(int d){
        data = d;
    }

    public void appendToTail(int i){
        MyNode newNode = new MyNode(i);
        
        if (this.next == null){
            this.next = newNode;
            return;
        }

        MyNode currNode = this.next;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public MyNode remove(MyNode head, int i){
        // we remove the head        
        if (head.data == i){
            return head.next;
        }

        MyNode currNode = head;
        while (currNode.next != null) {
            // deletion case, we rearrange the pointers
            if (currNode.next.data == i){
                currNode.next = currNode.next.next;
                return head;
            }
            
            currNode = currNode.next;
        }
        return head;
    }

    public void printList(){
        MyNode currNode = this;

        System.out.println(currNode.data);
        while (currNode.next != null){
            System.out.println(currNode.next.data);
            currNode = currNode.next;
        }
    }


    public static void main(String[] args){
        MyNode ciccio =  new MyNode(1);

        ciccio.appendToTail(2);
        ciccio.appendToTail(3);
        ciccio.appendToTail(4);
        ciccio.appendToTail(5);

        ciccio.remove(ciccio, 3);
        ciccio.remove(ciccio, 4);
        ciccio.printList();
    }

}