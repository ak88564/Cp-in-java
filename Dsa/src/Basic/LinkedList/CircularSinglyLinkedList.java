package Basic.LinkedList;

public class CircularSinglyLinkedList {

    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null; // every time when a node is created it will point to a null
        }

    }
    public void addFirst(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
//            head.next = head;
            return;
        }
//        head.next= head;
        newNode.next = head;// it is connecting to already existed node coz head is already there
        head = newNode;// now we make newNode head

//        Node currNode = head;
//        while(currNode.next!=null){
//            currNode = currNode.next;
//        }
//        currNode.next = head;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        newNode.next=head;
        if (head == null){
            head = newNode;
            head.next=head;
            return;
        }
        Node currNode = head;
        while(currNode.next!=head){
            currNode = currNode.next;
        }
        currNode.next = newNode;

    }

    public void printList(){
        if (head ==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode.next!=head) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        CircularSinglyLinkedList ll = new CircularSinglyLinkedList();
        ll.addFirst("a");
        ll.addFirst("is");
        ll.addFirst("this");
//        ll.addLast("list");
        ll.printList();

    }
}
