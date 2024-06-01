package Basic.Practice;

import Basic.GFG.MaxDepthBinaryTree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxDepthBT {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left=right=null;
        }
    }

    public static int calculateHeight(Node root){
        if (root == null){
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        int level=0;
        queue.add(root);
        while(queue.size()>0){
            int temp = queue.size();

            while(temp-->0){
                Node child = queue.poll();
                if (child.left!=null){
                    queue.add(child.left);
                }
                if (child.right!=null){
                    queue.add(child.right);
                }
            }
            level++;
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

        System.out.println(calculateHeight(root)); // Output: 4
    }
}
