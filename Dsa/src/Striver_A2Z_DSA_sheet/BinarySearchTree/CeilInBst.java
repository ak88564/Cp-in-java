package Striver_A2Z_DSA_sheet.BinarySearchTree;

public class CeilInBst {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left=right=null;
        }
    }

    static int ceilCalc(Node root, int key){
        int ans =-1;
        if(root==null){
            return ans;
        }
        while(root!=null){
            if(root.data>=key){
                ans = root.data;
            }
            root = key< root.data?root.left:root.right;
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(11);
        root.left.left = new Node(4);
        root.left.right = new Node(7);
        root.left.right.right = new Node(8);
        System.out.println(ceilCalc(root, 6));
    }
}
