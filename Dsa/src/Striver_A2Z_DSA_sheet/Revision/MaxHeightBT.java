package Striver_A2Z_DSA_sheet.Revision;

import java.util.LinkedList;
import java.util.Queue;

public class MaxHeightBT {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data){
            this.data = data;
            left=right=null;
        }
    }

    static int calculateHeight(TreeNode root){
        if (root==null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        int level = 0;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode temp = q.poll();
                if (temp.left!=null){
                    q.offer(temp.left);
                }
                if (temp.right!=null){
                    q.offer(temp.right);
                }
            }
            level++;
        }
        return level;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(calculateHeight(root));
    }
}
