package Striver_A2Z_DSA_sheet.Revision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevelOrder {

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static List<List<Integer>> zigzag(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if (root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int record =1;
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> holder = new ArrayList<>();

            for(int i = 0; i < size; i++){

                if(record%2==0){
//                    System.out.println("Value of record "+record);
                    holder.add(0, queue.peek().data);
                }
                else{
                    holder.add(queue.peek().data);
                }

                TreeNode temp = queue.poll();
                if(temp.left!=null){
                    queue.offer(temp.left);
                }
                if (temp.right!=null){
                    queue.offer(temp.right);
                }
//                System.out.println("Current loop: "+ holder);

            }
            record=record+1;
            result.add(holder);

        }
        return result;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println(zigzag(root));
    }
}
