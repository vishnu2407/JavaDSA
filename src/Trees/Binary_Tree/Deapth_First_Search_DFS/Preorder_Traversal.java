package Trees.Binary_Tree.Deapth_First_Search_DFS;

public class Preorder_Traversal {
    //Node class
    static class Node{
        int data;
        Node right, left;

        Node(int data){
            this.data= data;
            this.right= this.left= null;
        }
    }
    //BinaryTree class
    static class BinaryTree{
        static int index= -1;
        public static Node buildTree(int[] nodes){
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

    //Preorder Traversal
    public static void preorderTraversal(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        //return 0;
    }
    //Main method
    public static void main(String[] args) {
        //Build Tree Preorder sequence
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);

        //Time taken to build the tree
        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

        //assert root != null;
        System.out.print("This is the preorder of the tree: ");

        //Preorder Traversal
        preorderTraversal(root);
    }
}
