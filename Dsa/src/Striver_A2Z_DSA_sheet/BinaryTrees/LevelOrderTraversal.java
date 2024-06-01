package Striver_A2Z_DSA_sheet.BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        this.data = data;
        left = right = null;
    }
}
class Solution{

    List<List<Integer>> LevelOrder(TreeNode root){
        List<List<Integer>> ans = new ArrayList<>();
        if (root==null){
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++){
                TreeNode treeNode = q.poll();
                level.add(treeNode.data);
                if (treeNode.left != null){
                    q.add(treeNode.left);
                }
                if (treeNode.right != null){
                    q.add(treeNode.right);
                }
            }
            ans.add(level);

        }
        return ans;
    }

}


public class LevelOrderTraversal {


    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        Solution s1 = new Solution();
        List<List<Integer>> result = s1.LevelOrder(root);
        System.out.println(result);
    }
}
