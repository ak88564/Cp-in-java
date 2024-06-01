package Basic.LinkedList;


public class CircularLinkedList {
    static class Node{
        int data;
        Node next;
    }
    static Node push(Node head_ref, int data){
        //Create a node and make head as next of it
        Node ptr1 = new Node();
        ptr1.data = data;
        ptr1.next = head_ref;

        // If linked list is not null then set the next of last node
        if (head_ref != null){
            //Find the node before head and update next of it
            Node temp = head_ref;
            System.out.println("temp data" + temp.data);
            System.out.println("temp next data" + temp.next.data);
            while(temp.next != head_ref)
                temp = temp.next;
            temp.next = ptr1;
        }
        else
            ptr1.next = ptr1; // For the first node

        head_ref = ptr1;
        return head_ref;
    }

    static void printList(Node head){
        Node temp = head;
        if (head!=null)
            do {
                System.out.printf("%d ", temp.data);
                temp = temp.next;

            }while (temp!= head);
        System.out.printf("\n");
    }

    public static void main(String args[]){
        // Initialize lists as empty
        Node head = null;

        //Created linkedlist will be 2.5.7.8.10
        head = push(head, 2);
        head = push(head, 5);
        head = push(head, 7);
        head = push(head, 8);
        head = push(head, 10);

        printList(head);

    }
}
