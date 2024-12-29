package Striver_A2Z_DSA_sheet.LinkedList;

class Node{
    int data;
    Node next;
    Node back;
    public Node(int data, Node next, Node back){
        this.data = data;
        this.next = next;
        this.back=back;
    }
    public Node(int data){
        this.data=data;
        this.next=null;
        this.back=null;
    }
}
public class DLL {

    private static Node convertArr2DLL(int[] arr){
        Node head = new Node(arr[0]);
        Node prev = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    private static void print(Node head){
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node removeKElement(Node head, int k){
        if(head==null){
            return null;
        }
        int count =0;
        Node temp = head;
        while(temp!=null){
            count++;
            if (count==k){
                break;
            }
            temp = temp.next;
        }
        Node front = temp.next;
        Node prev = temp.back;

        if (front==null && prev==null){
            return null;
        } else if (prev==null) {
            return temp.next;

        } else if (front==null) {
            Node newTail = temp.back;
            newTail.next=null;
            temp.back =null;
            return head;
        }
        prev.next = front;
        front.back=prev;

        temp.next = null;
        temp.back = null;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {12,5,6,8};
        Node head = convertArr2DLL(arr);
        print(head);
        Node newHead = removeKElement(head, 1);
        print(newHead);

    }
}
