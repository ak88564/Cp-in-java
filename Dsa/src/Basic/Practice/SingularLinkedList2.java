package Basic.Practice;

public class SingularLinkedList2 {

    Node head;
    class Node{
        private String data;
        Node next;
        public Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    void addInFirstPosition(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void addInLastPosition(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    void printLl(){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data + " -> ");

            currNode = currNode.next;

        }
        System.out.print("null");
    }

    public static void main(String args[]){
        SingularLinkedList2 obj1 = new SingularLinkedList2();
        obj1.addInFirstPosition("Hello");
        obj1.addInFirstPosition("World");
        obj1.addInLastPosition("Beautiful");
        obj1.printLl();

    }
}
