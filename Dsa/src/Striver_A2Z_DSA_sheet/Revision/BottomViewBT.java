package Striver_A2Z_DSA_sheet.Revision;

import java.util.*;

public class BottomViewBT {

    static class Node{
        int data;
        Node left;
        Node right;
        int hd =0;

        public Node(int data) {
            this.data = data;
            left=right=null;
        }
    }
    static List<Integer> BottomView(Node root){
        List<Integer> ans = new ArrayList<Integer>();
        if(root==null){
            return ans;
        }
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Node> queue = new LinkedList<>();
        root.hd=0;
        queue.add(root);
        while(!queue.isEmpty()){
            Node temp = queue.poll();
            int index = temp.hd;
            map.put(index, temp.data);
            if(temp.left!=null){
                temp.left.hd = index-1;
                queue.add(temp.left);
            }
            if (temp.right!=null){
                temp.right.hd = index+1;
                queue.add(temp.right);
            }
        }
        for (Map.Entry<Integer, Integer> m: map.entrySet()){
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

        System.out.println(BottomView(root));
    }
}
