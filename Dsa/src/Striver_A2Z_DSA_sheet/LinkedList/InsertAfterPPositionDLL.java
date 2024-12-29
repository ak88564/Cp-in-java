package Striver_A2Z_DSA_sheet.LinkedList;


class DllNode{
    DllNode next;
    DllNode prev;
    int data;

    DllNode(int data){
        this.data = data;
        this.next = null;
        this.prev=null;
    }
}
public class InsertAfterPPositionDLL {

    public static DllNode convertArrayToDLL(int[] arr){
        DllNode head = new DllNode(arr[0]);
        DllNode back = head;
        for(int i=1;i<arr.length;i++){
            DllNode newNode = new DllNode(arr[i]);
            back.next = newNode;
            newNode.prev = back;
            back = newNode;
        }
        return head;
    }

    public static void print(DllNode head){
        DllNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static DllNode insertAfterPPosition(DllNode head, int position, int value){
        DllNode temp = head;
        int p=-1;
        while(temp!=null){
            p++;
            if(p==position){
                break;
            }
            temp=temp.next;
        }
        DllNode nextNode = temp.next;
        if(nextNode==null){
            DllNode newNode = new DllNode(value);
            temp.next = newNode;
            newNode.prev = temp;
        }
        else {
            DllNode newNode = new DllNode(value);
            newNode.next= nextNode;
            newNode.prev = temp;
            temp.next = newNode;
            nextNode.prev = newNode;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {2,4,5};
        DllNode node1 = convertArrayToDLL(arr);
        print(node1);
        DllNode node2 = insertAfterPPosition(node1, 2, 1001);
        print(node2);
    }
}
