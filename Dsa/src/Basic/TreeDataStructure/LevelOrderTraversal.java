package Basic.TreeDataStructure;

// Binary Tree Level Order Traversal

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left=right=null;
        }
    }

    static List<List<Integer>> TraverseThroughLevels(Node root){
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> finalAns = new ArrayList<List<Integer>>();
        if (root==null) return finalAns;

        q.add(root);
        while(!q.isEmpty()){
            int levels = q.size();
            LinkedList<Integer> subLevels = new LinkedList<>();
            for (int i=0;i<levels;i++){
                if (q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if (q.peek().right!=null){
                    q.add(q.peek().right);
                }
                subLevels.add(q.remove().data);
            }
            finalAns.add(subLevels);
        }
        return finalAns;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right = new Node(7);
        root.right.left.left = new Node(8);
        root.right.left.right = new Node(11);

        System.out.println(TraverseThroughLevels(root));

    }
}
