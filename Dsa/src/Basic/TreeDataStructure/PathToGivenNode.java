package Basic.TreeDataStructure;

import java.util.ArrayList;

public class PathToGivenNode {

    static ArrayList<Integer> arr = new ArrayList<>();

    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left=right=null;
        }
    }

    static boolean solve(Node root, int x){
        if(root==null){
            return false;
        }
        System.out.println(root.data);
        arr.add(root.data);
        // System.out.println(arr);
        if(root.data==x){
            return true;
        }
        if((solve(root.left, x)) || (solve(root.right, x))) {
            return true;
        }
        arr.remove(arr.size()-1);
        return false;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
//        root.right.left=new Node(6);
        root.right.right = new Node(7);
//        root.right.left.left = new Node(8);
//        root.right.left.right = new Node(11);

        PathToGivenNode.solve(root, 7);
        System.out.println(arr);

    }
}
