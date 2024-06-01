package Striver_A2Z_DSA_sheet.BinaryTrees;

/*
Brute force approach
 */

import java.util.ArrayList;
import java.util.List;

public class lcaBT {
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            left=right=null;
        }
    }

    static boolean getPath(Node root, List<Integer> arr, int x){
        if (root == null){
            return false;
        }
        arr.add(root.data);
        if (root.data == x){
            return true;
        }
        if (getPath(root.left, arr, x) || getPath(root.right, arr, x)){
            return true;
        }
        arr.remove(arr.size()-1);
        return false;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node (3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();

        getPath(root, arr1, 4);
        System.out.println(arr1);
        getPath(root, arr2, 5);
        System.out.println(arr2);

        for (int i=0;i<Math.min(arr1.size(), arr2.size());i++){
            if (arr1.get(i) == arr2.get(i)){
                System.out.print(arr1.get(i));
                System.out.print("->");
            }
        }
    }
}

// SC: Auxiliary space- O(N)
//     Space used by input- O(N) + O(N)
