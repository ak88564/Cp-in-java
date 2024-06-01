package Striver_A2Z_DSA_sheet.BinaryTrees;

import java.util.*;

class Node5 {
    int data;
    Node5 left;
    Node5 right;
    Node5(int data){
        this.data = data;
        left = right = null;
    }
}
public class ZigZag {

    static void zigzag(Node5 root){
        List<List<Integer>> finalAns = new ArrayList<>();
        Queue<Node5> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int count = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i=0;i<count;i++){
                Node5 child = q.peek();
                if (child.left!=null){
                    q.add(child.left);
                }
                if (child.right!=null){
                    q.add(child.right);
                }
                level.add(q.remove().data);
            }
            finalAns.add(level);

        }
        System.out.println(finalAns);
        for (int i=1;i< finalAns.size();i++){
            if (i%2!=0){
                Collections.reverse(finalAns.get(i));
            }
        }
        System.out.println(finalAns);
    }


    public static void main(String[] args) {
        Node5 root = new Node5(1);
        root.left = new Node5(2);
        root.right = new Node5(3);
        root.left.left = new Node5(4);
        root.left.right = new Node5(5);
        root.right.left = new Node5(6);
        root.right.right = new Node5(7);

        zigzag(root);
    }
}
