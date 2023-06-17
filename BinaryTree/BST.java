class Node{
    int key; //data of the node
    Node left,right;
    //Constructor
    Node(int key){
        this.key=key;
    }
}

class BinarySoln{
    Node root;

    void insertdata(int key){
        root = insertinTree(root,key);
    }
    Node insertinTree(Node root,int key){
        if(root==null){
            root = new Node(key);
            return root;
        }
        else if(key<root.key){
            root.left=insertinTree(root.left, key);
        }
        else if(key>root.key){
            root.right = insertinTree(root.right, key);
        }
        return root;
    }
    void preorder(Node root){
        if(root!=null){
            System.out.print(root.key+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    void postorder(Node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key+" ");
        }
    }
    void inorder(Node root){
         if(root!=null){//the function will finish when it will the end of a subtree
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
         }
    }

    //deletion operation
    Node deleteNode(Node root, int key) {
        // Base case
        if (root == null)
            return root;
 
        // Recursive calls for ancestors of
        // node to be deleted
        if (root.key > key) {
            root.left = deleteNode(root.left, key);
            return root;
        } else if (root.key < key) {
            root.right = deleteNode(root.right, key);
            return root;
        }
 
        // We reach here when root is the node
        // to be deleted.
 
        // If one of the children is empty
        if (root.left == null) {
            Node temp = root.right;
            return temp;
        } else if (root.right == null) {
            Node temp = root.left;
            return temp;
        }
 
        // If both children exist
        else {
 
            Node succParent = root;
 
            // Find successor
            Node succ = root.right;
            while (succ.left != null) {
                succParent = succ;
                succ = succ.left;
            }
 
            // Delete successor.  Since successor
            // is always left child of its parent
            // we can safely make successor's right
            // right child as left of its parent.
            // If there is no succ, then assign
            // succ.right to succParent.right
            if (succParent != root)
                succParent.left = succ.right;
            else
                succParent.right = succ.right;
 
            // Copy Successor Data to root
            root.key = succ.key;
 
            // Delete Successor and return root
            return root;
        }
    }
}
public class BST {
    public static void main(String[] args) {
        BinarySoln t = new BinarySoln();
        t.insertdata(40);
        t.insertdata(30);
        t.insertdata(50);
        t.insertdata(25);
        t.insertdata(35);
        t.insertdata(45);
        t.insertdata(55);

        t.inorder(t.root);
        t.deleteNode(t.root, 35);
        System.out.println();
        t.preorder(t.root);
    }
}
