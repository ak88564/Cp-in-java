package Striver_A2Z_DSA_sheet.LinkedList;

/*
328. Odd Even Linked List

Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.
 */

class LLNode{
    LLNode next;
    LLNode prev;
    int data;

    LLNode(int data){
        this.data = data;
        this.next = null;
        this.prev=null;
    }
}
public class OddEvenLL {

    public static LLNode convertArrayToDLL(int[] arr){
        LLNode head = new LLNode(arr[0]);
        LLNode back = head;
        for(int i=1;i<arr.length;i++){
            LLNode newNode = new LLNode(arr[i]);
            back.next = newNode;
            newNode.prev = back;
            back = newNode;
        }
        return head;
    }

    public static void print(LLNode head){
        LLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static LLNode arrangeOddEven(LLNode head){
        LLNode temp = head;
        LLNode tempNode = new LLNode(temp.data);
        LLNode newhead = tempNode;
        temp= temp.next;
        int count =2;
        while(temp!=null){
            if(count%2!=0){
                LLNode newNode = new LLNode(temp.data);
                tempNode.next = newNode;
                tempNode=newNode;
            }
            count++;
            temp=temp.next;
        }
        temp = head.next;
        count = 2;
        while(temp!=null){
            if(count%2==0){
                LLNode newNode = new LLNode(temp.data);
                tempNode.next = newNode;
                tempNode=newNode;
            }
            count++;
            temp=temp.next;
        }
        return newhead;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {2,1,3,5,6,4,7};
        LLNode node1 = convertArrayToDLL(arr);
        print(node1);
        LLNode result = arrangeOddEven(node1);
        print(result);
    }
}
