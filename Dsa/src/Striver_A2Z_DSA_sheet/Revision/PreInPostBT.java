package Striver_A2Z_DSA_sheet.Revision;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreInPostBT {
    static class Node{
        int value;
        Node left;
        Node right;
        Node(int data){
            this.value = data;
            left = right = null;
        }
    }

    static class Pair{
        Node root;
        int value;

        Pair(Node root, int value){
            this.root= root;
            this.value = value;
        }
    }

    static List<List<Integer>> preinpost(Node root){
        List<Integer> pre = new ArrayList<Integer>();
        List<Integer> in = new ArrayList<Integer>();
        List<Integer> post = new ArrayList<Integer>();

        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root, 1));

        while(!st.isEmpty()){
            Pair p = st.peek();
            // preorder
            if (p.value==1){

                pre.add(p.root.value);
                p.value++;
                if(p.root.left!=null){
                    st.push(new Pair(p.root.left, 1));
                }

            } else if (p.value==2) {
                in.add(p.root.value);
                p.value++;
                if(p.root.right!=null){
                    st.push(new Pair(p.root.right, 1));
                }
            }
            else {
                post.add(p.root.value);
                st.pop();
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        result.add(pre);
        result.add(in);
        result.add(post);
        return result;

    }
    static void print(List<Integer> data){
        for (int i: data
             ) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        List<List<Integer>> value = preinpost(root);
        print(value.get(0));
        print(value.get(1));
        print(value.get(2));
    }

}
