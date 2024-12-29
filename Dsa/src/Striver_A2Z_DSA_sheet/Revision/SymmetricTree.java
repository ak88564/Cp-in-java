package Striver_A2Z_DSA_sheet.Revision;

public class SymmetricTree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left=right=null;
        }
    }

    public static boolean isSymmetric(Node root){
        return isSymmetricCalc(root.left, root.right);
    }
    static boolean isSymmetricCalc(Node root1, Node root2){

        if (root1 == null || root2 == null){

            return root1==root2;
        }

        return (root1.data == root2.data) && isSymmetricCalc(root1.left, root2.right) &&
                isSymmetricCalc(root1.right, root2.left);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
        System.out.println(isSymmetric(root));
    }
}
