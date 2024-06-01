package Basic.TreeDataStructure;

import java.util.*;

public class BottomViewBT {
    static class Node{
        int data;
        Node left, right;
        int hd = 0;

        Node(int data){
            this.data = data;
            left=right=null;
        }
    }

    static ArrayList<Integer> bottomView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Node> q = new LinkedList<Node>();
        root.hd = 0;
        q.add(root);
        while (!q.isEmpty()) {
            Node temp = q.remove();
            int hd = temp.hd;
            map.put(hd, temp.data);
            if (temp.left != null){
                temp.left.hd = hd-1;
                q.add(temp.left);
            }
            if (temp.right != null){
                temp.right.hd = hd+1;
                q.add(temp.right);
            }
        }
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
//        root.right.left=new Node(6);
        root.right.right = new Node(7);
//        root.right.left.left = new Node(8);
//        root.right.left.right = new Node(11);

        System.out.println(bottomView(root));

    }
}
