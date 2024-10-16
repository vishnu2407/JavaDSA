package Trees.Binary_Search_Tree;

public class Search_BST {
    //Node class
    static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data= data;
            this.right= this.left= null;
        }
    }
    //BinaryTree class
    static class BinaryTree{
        static int index= -1;
        public static Node buildTree(int nodes[]){
            index++;
            if(nodes[index] == -1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }
    //insert function
    public static Node insert(Node root, int value){
        // We used node because we want to store the value in recuresively
        if(root == null){
            root = new Node(value);
            return root;
        }
        if(root.data > value){
            //insert in the left subtree
            root.left = insert(root.left, value);
        }
        else{
            //insert in the right subtree
            root.right = insert(root.right, value);
        }
        return root;
    }
    //inorder traversal
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        // Traverse the left subtree
        inorder(root.left);
        System.out.print(root.data + " ");
        // Traverse the right subtree
        inorder(root.right);
        //System.out.print(root.data + " ");
    }
    //search function
    public static boolean search(Node root, int key) {
        //if the root node is null, the key does not exist
        if (root == null) {
            return false;
        }
        //if the key is less than the root node, search in the left subtree
        if (root.data > key) {
            return search(root.left, key);
        }
        //finding the key exists or does not exist
        else if (root.data == key) {
            return true;
        }
        //if the key is greater than the root node, search in the right subtree
        else if (root.data < key) {
            return search(root.right, key);
        }
        //if the key is not found
        else {
            return false;
        }
    }
    //main function
    public static void main(String args[]) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        //searching for a key
        if(search(root, 12)){
            System.out.println("Key found");
        }
        else {
            System.out.println("Key not found");
        }

    }
}