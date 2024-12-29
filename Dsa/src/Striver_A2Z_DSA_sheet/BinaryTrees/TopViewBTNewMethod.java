package Striver_A2Z_DSA_sheet.BinaryTrees;

import java.util.*;


public class TopViewBTNewMethod {

    static class Node{
        int data;
        Node left;
        Node right;

        int hd;// extra variable to store the x axis

        Node(int data){
            this.data = data;
            left=right=null;
        }
    }

    static List<Integer> TopView(Node root){
        List<Integer> ans = new ArrayList<Integer>();
        if(root==null){
            return ans;
        }
        Map<Integer, Integer> map = new TreeMap<>(); // Treemap keys are sorted in natural order while retrieving
        root.hd = 0; // set root to hd =0
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node node = q.poll();
            int index = node.hd; // extract the root hd

            /*
             Here logic is that the whatever data is inserted first in the line(hd), then that
             line will not be updated anymore
             */
            if(!map.containsKey(index)){
                map.put(index, node.data);
            }
            if (node.left!=null){
                node.left.hd = index-1;
                q.add(node.left);
            }
            if(node.right!=null){
                node.right.hd = index+1;
                q.add(node.right);
            }
        }
        for(Map.Entry<Integer, Integer> m: map.entrySet()){
            ans.add(m.getValue());
        }
        return ans;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node (3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(TopView(root));

    }
}
