package Basic.TreeDataStructure;

public class SearchBT {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            left=right=null;
        }
    }
    static Node ans;
    public static Node searchBST(Node root, int val) {

        if(root==null){
            return null;
        }
        if(root.data==val){
            System.out.println("Executed");
            ans = root;

        }
        searchBST(root.left, val);
        searchBST(root.right, val);

        return ans;

    }

    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left=new Node(1);
        root.left.right=new Node(3);

        System.out.println("Answer " + searchBST(root, 4).data);
    }
}
