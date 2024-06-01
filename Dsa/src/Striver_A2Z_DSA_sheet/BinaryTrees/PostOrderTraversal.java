package Striver_A2Z_DSA_sheet.BinaryTrees;

import java.util.ArrayList;
import java.util.List;

class Node1{
    int data;
    Node1 left;
    Node1 right;
    public Node1(int key){
        data = key;
        left = null;
        right = null;
    }
}

public class PostOrderTraversal {

    static void postorder(Node1 root, ArrayList<Integer> list1){
        if (root == null){
            return ;
        }
        postorder(root.left, list1);
        postorder(root.right, list1);
        list1.add(root.data);

    }

    static List<Integer> postOrder(Node1 root){
        ArrayList<Integer> list1 = new ArrayList<>();
        postorder(root, list1);
        return list1;

    }
    public static void main(String[] args) {
        Node1 root = new Node1(1);
        root.left = new Node1(2);
        root.right = new Node1(3);
        root.left.left = new Node1(4);
        root.left.right = new Node1(5);

        List<Integer> result = postOrder(root);
        for (int i: result
             ) {
            System.out.print(i + " ");
        }
        
    }
}
