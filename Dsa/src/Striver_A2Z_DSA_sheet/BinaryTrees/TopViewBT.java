package Striver_A2Z_DSA_sheet.BinaryTrees;

import java.util.*;

public class TopViewBT {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = right = null;
        }
    }

    static class Pair {
        Node root;
        Integer value;

        public Pair(Node root, Integer value){
            this.root = root;
            this.value = value;
        }
    }

    public static List<Integer> topView(Node root){
        List<Integer> ans = new ArrayList<Integer>();

        Queue<Pair> q = new LinkedList<>();

        if(root==null){
            return ans;
        }

        Map<Integer, Integer> mpp = new TreeMap<>();

        q.add(new Pair(root, 0));

        while(!q.isEmpty()){
            Pair pair = q.poll();
            Node node = pair.root;
            int line = pair.value;

            if(!mpp.containsKey(line)){
                mpp.put(line, node.data);
            }
            if(node.left != null){
                q.add(new Pair(node.left, line-1));
            }

            if(node.right!=null){
                q.add(new Pair(node.right, line+1));
            }
        }

        for(int value: mpp.values()){
            ans.add(value);
        }
        return ans;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);
        root.right.left = new Node(90);
        root.right.right = new Node(100);

        System.out.println(topView(root));
    }


}
