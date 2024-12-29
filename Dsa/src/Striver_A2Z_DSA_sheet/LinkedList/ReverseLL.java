package Striver_A2Z_DSA_sheet.LinkedList;

/*
Reverse of the singly linked list. Here for this scenario to reverse the LL, we have used the stack
data structure because stack follows LIFO order
 */


import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class ReverseLL {

    static void print(ListNode head){
        while(head!=null){
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    static void reverse(ListNode head){
        ListNode temp = head;
        Stack<Integer> stack = new Stack<Integer>();
        while(temp!=null){
            stack.push(temp.val);
            temp = temp.next;
        }
        System.out.println(stack);

        temp = head;
        while(temp!=null){
            temp.val = stack.pop();
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        ListNode ln = new ListNode(5);
        ListNode ln2 = new ListNode(4, ln);
        ListNode ln3 = new ListNode(3, ln2);
        ListNode ln4 = new ListNode(2, ln3);
        ListNode ln5 = new ListNode(1, ln4);
        print(ln5);
        reverse(ln5);
        print(ln5);

    }
}
