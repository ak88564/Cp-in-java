package Simple.dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
class Solution{
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        List<Integer> v = new ArrayList<>();
        while(list1!=null){
            v.add(list1.val);
            list1=list1.next;
        }
        while(list2!=null){
            v.add(list2.val);
            list2=list2.next;
        }

        Collections.sort(v);
        ListNode result = new ListNode(-1);
        ListNode temp = result;
        for(int i=0;i<v.size();i++){
            result.next = new ListNode(v.get(i));
            result = result.next;
        }
        temp = temp.next;

        System.out.print("Resultant Merge Linked List is : ");
        return temp;
    }
}

public class MergeTwoSortedLL2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListNode node1 = new ListNode();
        ListNode list1 = new ListNode(5);
        list1.next = new ListNode(10);
        list1.next.next = new ListNode(15);

        ListNode list2 = new ListNode(4);
        list2.next = new ListNode(8);
        list2.next.next = new ListNode(16);
        Solution obj1 = new Solution();
        node1 = obj1.mergeTwoLists(list1, list2);
        while (node1!= null){
            System.out.print(node1.val + " ");
            node1 = node1.next;
        }

    }

}
