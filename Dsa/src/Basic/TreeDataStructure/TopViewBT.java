package Basic.TreeDataStructure;

// Top view of a binary tree

import java.util.ArrayList;
import java.util.List;

public class TopViewBT {

    static List<Integer> finalVal = new ArrayList<Integer>();
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left=right=null;
        }
    }

    static void topViewLeft(Node root){
        if (root!=null){
            topViewLeft(root.left);
            finalVal.add(root.data);
        }
    }
    static void topViewRight(Node root){
        if (root!=null){
            finalVal.add(root.data);
            topViewRight(root.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
//        root.right.left=new Node(6);
        root.right.right = new Node(7);
//        root.right.left.left = new Node(8);
//        root.right.left.right = new Node(11);

        topViewLeft(root);
        topViewRight(root.right);
        System.out.println(finalVal);

    }
}
