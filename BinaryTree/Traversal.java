class Node{
    char key; // the value of nodes
    Node left,right; //child nodes
    //constructor
    Node(char key){
        this.key=key;
    }
}

class TreeTraversal{
    Node root;
    void preorder(Node n){
        if (n!=null){// it will run till it reaches the leaf node
            System.out.print(n.key+" ");
            preorder(n.left);
            preorder(n.right);
        }
    }
}

public class Traversal{
    public static void main(String[] args) {
        //creating the Binary tree
        TreeTraversal t1 = new TreeTraversal();
        t1.root = new Node('A');
        t1.root.left = new Node('B');
        t1.root.right = new Node('C');
        t1.root.left.left = new Node('D');
        t1.root.left.right = new Node('E');

        //calling the preorder traversal function
        t1.preorder(t1.root);
    }
}