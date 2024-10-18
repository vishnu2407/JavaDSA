package DSA_JAVA_Concepts.Non_Linear_DS.Trees.Binary_Search_Tree;

public class BST_Inorder_Traversal {
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
    
    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7, 6};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();
    }
}
