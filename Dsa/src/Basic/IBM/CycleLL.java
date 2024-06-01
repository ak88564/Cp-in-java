package Basic.IBM;

/*
Detect loop or cycle in a linkedlist
 */

import java.util.LinkedList;

public class CycleLL {
//    static Node head;
    static class Node{
        int data;
        Node next;

        int flag;
        Node(int x){
            data = x;
            next=null;
            flag = 0;
        }
    }
    /* Inserts a new Node at front of the list. */
    static Node push(Node head_ref, int new_data){
        /* 1 & 2: Allocate the Node &
                  Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head_ref;
        /* 4. Move the head to point to new Node */
        head_ref = new_node;
        return head_ref;
    }

    // Returns true if there is a loop in linked
    // list else returns false.
    static boolean detectLoop(Node h)
    {
        while (h != null) {

            // If this node is already traverse
            // it means there is a cycle
            // (Because you we encountering the
            // node for the second time).
            if (h.flag == 1)
                return true;

            // If we are seeing the node for
            // the first time, mark its flag as 1
            h.flag = 1;

            h = h.next;
        }
        return false;
    }
    public static void main(String[] args) {

        Node head = null;

        head = push(head, 20);
        head = push(head, 4);
        head = push(head, 15);
        head = push(head, 10);

        // Create a loop for testing
        head.next.next.next.next = head;

        if (detectLoop(head))
            System.out.print("Loop Found");
        else
            System.out.print("No Loop");
    }
}