package Striver_A2Z_DSA_sheet.BinaryTrees;

import java.util.*;

public class BottomViewBT {
    static class Node{
        int data;
        Node left;
        Node right;
        int hd = 0;
        public Node(int data){
            this.data = data;
            left=right=null;
        }
    }

    static List<Integer> bottomViewTraversal(Node root){
        List<Integer> ans = new ArrayList<>();
        if (root==null){
            return ans;
        }
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Node> q = new LinkedList<>();
        root.hd=0;
        q.add(root);
        while(!q.isEmpty()){
            Node child = q.poll();
            int index = child.hd;
            /*
             Here logic is that the whatever data is inserted first in the line(hd), then that
             line will not be updated anymore
             */
            map.put(index, child.data);
            if (child.left!=null){
                child.left.hd = index -1;
                q.add(child.left);

            }
            if (child.right!=null){
                child.right.hd = index + 1;
                q.add(child.right);
            }
        }
        for (Map.Entry<Integer, Integer> m: map.entrySet()) {
            ans.add(m.getValue());
        }
        return ans;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(10);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right = new Node(3);
        root.right.right = new Node(10);
        root.right.left = new Node(9);

        System.out.println(bottomViewTraversal(root));

    }
}
