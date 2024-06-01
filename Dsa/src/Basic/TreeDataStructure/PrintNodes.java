package Basic.TreeDataStructure;

// This program doesn't works

import java.util.LinkedList;

public class PrintNodes {

    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left=right=null;
        }
    }

    static void printNodes(Node root){
        if (root==null){
            System.out.println("Binary tree don't exist");
        }
        LinkedList<Node> ll1 = new LinkedList<Node>();
        ll1.addLast(root);

        while(ll1.size() > 0){
            int size = ll1.size();

            while(size-- > 0){
                System.out.println("Node value is: " + ll1.getFirst());
                Node remNode = ll1.removeFirst();
                if (remNode.left != null){
                    ll1.addLast(remNode.left);
                    System.out.println("left: " + ll1);
                }
                if (remNode.right != null){
                    ll1.addLast(remNode.right);
                }

            }
        }

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right = new Node(7);
        root.right.left.left = new Node(8);
        root.right.left.right = new Node(11);

        printNodes(root);
    }

}
