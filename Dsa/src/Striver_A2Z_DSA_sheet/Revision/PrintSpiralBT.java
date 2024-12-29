package Striver_A2Z_DSA_sheet.Revision;

/*
Print zigzag level order traversal
 */

import java.util.*;

public class PrintSpiralBT {

    public static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
            left=right=null;
        }
    }
    public static List<List<Integer>> spiralForm(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return  ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int count = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i < size; i++){
                level.add(queue.peek().data);
                TreeNode temp = queue.poll();
                if(temp.left!=null){
                    queue.add(temp.left);
                }
                if(temp.right!=null){
                    queue.add(temp.right);
                }
            }
            if(count %2==0){
                Collections.reverse(level);
            }
            ans.add(level);
            count++;
        }
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        root.right.right.left = new TreeNode(8);
        root.right.right.right = new TreeNode(9);

        System.out.println(spiralForm(root).toString());
    }

}
