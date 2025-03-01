package Striver_A2Z_DSA_sheet.BinarySearchTree;

public class DeleteNodeBST {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
            left=right=null;
        }
    }

    public static TreeNode deleteNode(TreeNode root, int key){
        if(root==null){
            return null;
        }
        if (root.val == key){
            return helper(root);
        }
        TreeNode dummy = root;
        while(dummy != null){
            if(dummy.val > key){
                if(dummy.left!=null && dummy.left.val == key){
                    dummy.left = helper(dummy.left);
                }
                else{
                    dummy = dummy.left;
                }
            }
            else{
                if(dummy.right!=null && dummy.right.val==key){
                    dummy.right = helper(dummy.right);
                }
                else{
                    dummy = dummy.right;
                }
            }
        }
        return root;
    }

    public static TreeNode helper(TreeNode root){
        if(root.left == null){
            return root.right;
        }
        else if(root.right == null){
            return root.left;
        }
        else{
            TreeNode rightChild = root.right;
            TreeNode rightMostNode = rightCalculator(root.left);
            rightMostNode.right = rightChild;
        }
        return root.left;
    }

    public static TreeNode rightCalculator(TreeNode root){
        if(root.right== null){
            return root;
        }
        return rightCalculator(root.right);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);


        System.out.println(deleteNode(root, 3));
    }
}
