package Striver_A2Z_DSA_sheet.BinaryTrees;

public class SymmetricBT {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            left=right=null;
        }
    }

    static boolean isSymmetric(Node root){
        if (root == null){
            return true;
        }
        boolean res = symmetricCalc(root.left, root.right);
        return res;
    }

    static boolean symmetricCalc(Node root1, Node root2){
        if (root1 == null || root2 == null) return root1==root2;
        return root1.data==root2.data && symmetricCalc(root1.left, root2.right)
                && symmetricCalc(root1.right, root2.left);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.right.right = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);

        boolean result;
        result = isSymmetric(root);
        if (result){
            System.out.println("This is symmetrical");
        }
        else {
            System.out.println("This is not symmetrical");
        }
    }
}
