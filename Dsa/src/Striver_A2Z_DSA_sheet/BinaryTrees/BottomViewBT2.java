package Striver_A2Z_DSA_sheet.BinaryTrees;

import java.util.*;

public class BottomViewBT2 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left=right=null;
        }
    }

    static class Pair{
        Node node;
        int value;

        Pair(Node data, int value){
            this.node = data;
            this.value = value;
        }
    }

    static List<Integer> getData(Node root){
        List<Integer> ans = new ArrayList<Integer>();
        if(root==null){
            return ans;
        }
        Queue<Pair> queue = new LinkedList<>();
        Map<Integer, Integer> mpp = new TreeMap<>();
        queue.add(new Pair(root, 0));
        while(!queue.isEmpty()){
            Pair p = queue.poll();
            Node child = p.node;
            int value = p.value;

            mpp.put(value, child.data);

            if(child.left!=null){
                queue.add(new Pair(child.left, value-1));
            }

            if(child.right!=null){
                queue.add(new Pair(child.right, value+1));
            }

        }
        for(Map.Entry<Integer, Integer> i: mpp.entrySet()){
            ans.add(i.getValue());
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(9);
        root.right.right = new Node(11);
        root.left.left.right = new Node(5);
        root.left.left.right.right = new Node(6);
        root.right.right.left = new Node(10);

        System.out.println(getData(root));
    }
}
