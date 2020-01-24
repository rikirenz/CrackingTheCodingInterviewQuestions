/**
 * When we talk about Binary Trees. Most of the time we mean: Binary Search tree.
 * In a binary Search tree there are some rules in the order of the nodes:
 * 
 * Each left child node has to be less than is root.
 * Each root node has to be less than his right child
 * 
 * These 2 rules have to be true for each node in the tree
 * 
 * There are a few operations we need to discuss when we talk about binary search trees:
 * 
 * Search O(log n):
 *  This operation is pretty efficent because it takes O(log n). 
 *  Because each time we go left or right we reduce by half (not always);
 *  the number of nodes we are evaluating
 * 
 * Insert:
 *  works more or less like a search. We need to find the right spot to put our node.
 *  But this it could bring to have a very unbalanced tree. 
 *  For this reason there are algorithms to balance a tree
 * 
 * 
 * Traversing operations:
 *  there are 3 types of traversing operations:
 *  - inorder
 *  - preorder
 *  - postorder
 * 
 *                         b
 *                       /   \
 *                      a     c
 * 
 * Inorder: left then root then right => a b c
 * Preorder: root then left then right => b a c
 * Postorder: left then right then root => a c b
 * 
 * Typically we wanna do the inorder traversal 
 * 
 */




public class Node {

    Node left, right;
    int data;

    public Node(int d) {
        data = d;
    }

    public void insert(int d) {
        if (d <= this.data) { // we go left
            if (left == null) {
                left = new Node(d);
            } else {
                left.insert(d);
            }
        } else {
            if (right == null) {
                right = new Node(d);
            } else {
                right.insert(d);
            }
        }
    }

    public boolean contains(int d) {
        if (d == this.data) {
            return true;
        } else if (d <= this.data) { // we go left
            if (left == null) {
                return false;
            } else {
                return left.contains(d);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(d);
            }
        }
    }

    public boolean amIBalanced() {
        return amIBalanced(this).amIBalanced;
    }


    private class BalanceStatus {
        int height;
        boolean amIBalanced;

        public BalanceStatus(boolean amIBalanced, int height) {
            this.height = height;
            this.amIBalanced = amIBalanced;
        }

    }

    private BalanceStatus amIBalanced(Node root) {
        if (root == null) {
            return new BalanceStatus(true, -1);
        }

        return null;


    }


    public void inOrderPrint(){
        if (left !=  null){
            left.inOrderPrint();
        }
        System.out.println(data);
        if (right !=  null){
            right.inOrderPrint();
        }
    }

    public void preOrderPrint(){
        System.out.println(data);
        if (left !=  null){
            left.preOrderPrint();
        }
        if (right !=  null){
            right.preOrderPrint();
        }
    }

    public void postOrderPrint(){
        if (left !=  null){
            left.postOrderPrint();
        }
        if (right !=  null){
            right.postOrderPrint();
        }
        System.out.println(data);
    }

    public static void main(String[] args){
        Node ciccio = new Node(5);
        
        ciccio.insert(3);
        ciccio.insert(2);
        ciccio.insert(4);
        ciccio.insert(7);
        ciccio.insert(6);
        ciccio.insert(8);

        System.out.println(ciccio.contains(9));
        System.out.println(ciccio.contains(8));

        System.out.println("--------------------------");
        ciccio.inOrderPrint();
        System.out.println("--------------------------");
        ciccio.preOrderPrint();
        System.out.println("--------------------------");
        ciccio.postOrderPrint();
    }

/**
 * BALANCED BINARY TREE, time: O(n) , space O(h) 
 * where n -> numbers of nodes and h -> height of the tree 
 * 
 * We consider a tree balanced when the left and right 
 * subtrees heights they do not differ more than 1:
 * 
 * | leftSubtreeHeight - rightSubtreeHeight | <= 1
 * 
 * - isMyLeftOrRightSubtreeBalanced? if no I quit
 * - theHeightsDifferMoreThan1? if yes I quit
 * 
*/

}