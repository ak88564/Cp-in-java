package Striver_A2Z_DSA_sheet.BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode2{
    int data;
    TreeNode2 left;
    TreeNode2 right;

    public TreeNode2(int data){
        this.data = data;
        left=right=null;
    }
}

class IterativePreorderTraversal{
    List<Integer> preorderTraversal(TreeNode2 root){
        List<Integer> preorder = new ArrayList<Integer>();
        Stack<TreeNode2> st = new Stack<>();
        st.add(root);
        while(!st.empty()){
            TreeNode2 child = st.pop();
            preorder.add(child.data);
            if (child.right!=null){
                st.push(child.right);
            }
            if (child.left!=null){
                st.push(child.left);
            }

        }
        return preorder;
    }
}

public class IterativePreorderBT {
    public static void main(String[] args) {
        TreeNode2 root = new TreeNode2(1);
        root.left = new TreeNode2(2);
        root.right = new TreeNode2(3);
        root.left.left = new TreeNode2(4);
        root.left.right = new TreeNode2(5);

        IterativePreorderTraversal obj1 = new IterativePreorderTraversal();
        System.out.println(obj1.preorderTraversal(root));
    }
}
