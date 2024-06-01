package Basic.GFG;

// Preorder, inorder and postorder in one traversal

import java.util.ArrayList;
import java.util.Stack;

public class PreInPost {
    static class Pair{
        Node first;
        int second;

        public Pair(Node first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    //Structure of the node of a binary tree
    static class Node {
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left=right=null;
        }
    };
    //function to print all nodes of a binary tree in preorder, postorder and inorder using only
    // one stack
    static void allTraversal(Node root){
        //stores preorder traversal
        ArrayList<Integer> pre = new ArrayList<>();
        // stores inorder traversal
        ArrayList<Integer> in = new ArrayList<>();
        // stores postorder traversal
        ArrayList<Integer> post = new ArrayList<>();

        //stores the nodes and the order in which they are currently visited
        Stack<Pair> s = new Stack<>();

        // push root node of the tree into the stack
        s.push(new Pair(root, 1));

        while(!s.empty()){
            // stores the top element of the stack
            Pair p = s.peek();

            if (p.second==1){
                // update the status of the top node
                s.peek().second++;

                // insert the current node into preorder, pre[]
                pre.add(p.first.data);

                // if left child is not null
                if (p.first.left != null){
                    // insert the left child with status code 1
                    s.push(new Pair(p.first.left, 1));
                }
            }
            // if the status of top node of the stack is 2
            else if (p.second==2) {
                // update the status of the top node
                s.peek().second++;

                // insert the current node in inorder, in[]
                in.add(p.first.data);

                // if the right child is not null
                if (p.first.right != null){
                    // insert the right subtree into the stack with status code 1
                    s.push(new Pair(p.first.right, 1));

                }
            }
            else{
                // push the current node in post[]
                post.add(p.first.data);
                // pop the top node
                s.pop();

            }
        }
        System.out.print("Preorder Traversal: ");
        for (int i: pre) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Printing inorder
        System.out.println("Inorder Traversal: ");
        for (int i: in) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Printing Postorder
        System.out.print("Postorder Traversal: ");
        for (int i: post){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    // Driver code
    public static void main(String[] args) {

        // Creating the root
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Function call
        allTraversal(root);
    }
}
