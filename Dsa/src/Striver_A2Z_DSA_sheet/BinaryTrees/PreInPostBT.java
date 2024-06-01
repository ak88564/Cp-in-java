package Striver_A2Z_DSA_sheet.BinaryTrees;

import Basic.GFG.PreInPost;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class PreInPostBT {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }
    static class Pair {
        Node root;
        int value;

        public Pair(Node root, Integer data) {
            this.root = root;
            value = data;
        }
    }

    static void preInPostTraversal(Node root) {
        List<Integer> pre = new ArrayList<Integer>();
        List<Integer> in = new ArrayList<Integer>();
        List<Integer> post = new ArrayList<Integer>();

        Stack<Pair> st = new Stack<Pair>();
        st.push(new Pair(root, 1));

        while (!st.isEmpty()) {
            Pair p = st.peek(); // returns the last element without removing it
            if (p.value == 1) {
                p.value++;
                pre.add(p.root.data);
                if (p.root.left != null) {
                    st.push(new Pair(p.root.left, 1));
                }
            } else if (p.value == 2) {
                p.value++;
                in.add(p.root.data);
                if (p.root.right != null) {
                    st.push(new Pair(p.root.right, 1));
                }
            } else {
                post.add(p.root.data);
                st.pop(); // removes the last inserted element
            }
        }
        System.out.print("Preorder Result: ");
        for (int i: pre
             ) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.print("Inorder Result: ");
        for (int i: in
             ) {
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.print("Postorder result: ");
        for (int i: post
             ) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        preInPostTraversal(root);
    }
}
