package Basic.GFG;

import java.util.LinkedList;

public class MaxDepthBinaryTree {
    static class Pair{
        Node first;
        int second;

        public Pair(Node first, int second){
            this.first = first;
            this.second = second;
        }
    }

    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left=right=null;
        }
    }

    static int levelOrder(Node root){
        System.out.println("Function called");
        if (root==null){
            System.out.println("Root is null");
            return 0;
        }
        LinkedList<Node> queue = new LinkedList<>();
        queue.addLast(root);

        int level = 0;

        while (queue.size() > 0){
            System.out.println("Size of queue: " + queue.size());
            int size = queue.size();

            while (size-- > 0){
                Node remNode = queue.removeFirst();
                if (remNode.left != null){
                    queue.addLast(remNode.left);
                }
                if (remNode.right != null){
                    queue.addLast(remNode.right);
                }
            }
            level++;
            System.out.println("Level value is incremented: " + level);
        }
        return level;

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

        System.out.println("Result is: " + levelOrder(root));
    }
}
