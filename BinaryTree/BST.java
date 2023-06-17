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
    }
}
