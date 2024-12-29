package Striver_A2Z_DSA_sheet.LinkedList;


import java.util.ArrayList;

class Node2 {
    Node2 next;
    Node2 prev;
    int data;

    Node2(int data){
        this.data = data;
        this.next = null;
        this.prev=null;
    }
}
public class FindPairs {

    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node2 head) {
        // code here

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Node2 left = head;
        Node2 right = findTail(head);
        while(left.data<right.data){
            int count =0;
            ArrayList<Integer> list = new ArrayList<>();
            if(left.data+right.data == target){
                list.add(left.data);
                list.add(right.data);
                left=left.next;
                right=right.prev;
                count++;
            }
            else if(left.data+right.data < target){
                left=left.next;
            }
            else{
                right=right.prev;
            }
            if(count>0){
                ans.add(list);
            }
        }
        return ans;

    }

    static Node2 findTail(Node2 head){
        Node2 iterator = head;
        while(iterator.next !=null){
            iterator = iterator.next;
        }
        return iterator;
    }

    public static Node2 convertArrayToDLL(int[] arr){
        Node2 head = new Node2(arr[0]);
        Node2 back = head;
        for(int i=1;i<arr.length;i++){
            Node2 newNode = new Node2(arr[i]);
            back.next = newNode;
            newNode.prev = back;
            back = newNode;
        }
        return head;
    }

    public static void print(Node2 head){
        Node2 temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1, 4, 5, 6, 10, 11, 12, 13, 14, 15 ,19, 20, 21, 22, 25, 26, 27, 31, 33, 35, 36, 37, 38,
                39, 40, 41, 42, 43, 44, 47, 48, 49};
        Node2 node1 = convertArrayToDLL(arr);
        print(node1);
        ArrayList<ArrayList<Integer>> result = findPairsWithGivenSum(31, node1);
        System.out.println(result);
    }
}
