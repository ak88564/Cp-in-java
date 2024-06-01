package Basic.LinkedList;

public class SingularLinkedList {

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
            return;
        }
        newNode.next = head;// it is connecting to already existed node coz head is already there
        head = newNode;// now we make newNode head
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
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
        while(currNode!=null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }
    public static void main(String args[]){
        SingularLinkedList ll = new SingularLinkedList();
        ll.addFirst("a");
        ll.addFirst("is");
        ll.addFirst("this");
        ll.addLast("list");
        ll.printList();

    }
}
