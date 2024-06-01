package Striver_A2Z_DSA_sheet.BinaryTrees;

import java.util.*;

class Node6{
    int data;
    Node6 left;
    Node6 right;

    public Node6(int data){
        this.data = data;
        left =right =null;
    }
}
public class TopViewBT {

    static void TopViewAlgo(Node6 root){
        List<Integer> arrList = new ArrayList<>();
        arrList.add(root.data);
        Queue<Node6> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node6 child = q.poll();
            if (child.left!=null){
                q.add(child.left);
                arrList.add(child.left.data);
            }
        }
        Collections.reverse(arrList);
        System.out.println(arrList);
        q.add(root.right);
        arrList.add(root.right.data);
        while(!q.isEmpty()){
            Node6 child = q.poll();
            if (child.right!=null){
                q.add(child.right);
                arrList.add(child.right.data);
            }
        }
        System.out.println(arrList);

    }

    public static void main(String[] args) {
        Node6 root = new Node6(1);
        root.left = new Node6(2);
        root.left.left = new Node6(4);
        root.left.right = new Node6(10);
        root.left.left.right = new Node6(5);
        root.left.left.right.right = new Node6(6);
        root.right = new Node6(3);
        root.right.right = new Node6(10);
        root.right.left = new Node6(9);

        TopViewAlgo(root);
    }
}
