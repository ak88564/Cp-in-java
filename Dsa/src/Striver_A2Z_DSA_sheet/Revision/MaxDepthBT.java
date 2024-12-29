package Striver_A2Z_DSA_sheet.Revision;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepthBT {
    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data){
            this.data = data;
            left=right=null;
        }
    }

    public static int lengthCalculator(TreeNode root){
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode iterator = queue.poll();
                if (iterator.left!=null){
                    queue.offer(iterator.left);

                }
                if(iterator.right!=null){
                    queue.offer(iterator.right);
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

        System.out.println(lengthCalculator(root));

    }

}
