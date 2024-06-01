package Striver_A2Z_DSA_sheet.BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class RightSideView {

    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;;
            left = right = null;
        }
    }

    static void TraversalInitializer(Node root){
        List<Integer> res = new ArrayList<>();
        int level = 0;
        RightView(root, level, res);
        System.out.println(res);
    }

    static void RightView(Node root, int level, List res){
        if (root == null) return;
        if (res.size() == level){
            res.add(root.data);
        }
        RightView(root.right, level+1, res);
        RightView(root.left, level+1, res);

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);

        TraversalInitializer(root);
    }
}
