package Tree;

public class BinarySearchTree {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }
    private Node root;

    public BinarySearchTree(){

    }

    public int height(Node node){
        if(node == null)
        return -1;

        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(root,"Root Node: ");
    }
    private void display(Node node,String details){
        if(node == null)
        return;

        System.out.println(details + node.value);
    }
    public void insert(int value){
        root = insert(value,root);
    }
    private Node insert(int value,Node root){ 
        if(root == null){
        root = new Node(value);
        return root;
        }
        if(value < root.value){
            root.left = insert(value,root.left);
        }

        if(value > root.value){
            root.right= insert(value,root.right);
        }
        root.height = Math.max(height(root.left),height(root.right));
        return root;
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node root){
        if(root == null)
        return true;

        return Math.abs(height(root.left) - height(root.right)) <= 1 && balanced(root.left) && balanced(root.right);
    }
}
