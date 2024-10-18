package DSA_JAVA_Concepts.Non_Linear_DS.Trees.Binary_Tree.Deapth_First_Search_DFS.Recursion.ArithmeticOperators.Subtraction;

public class Subtraction_of_Nodes {
    static class Node{
        int data;
        Node right, left;

        Node(int data){
            this.data= data;
            this.right= this.left= null;
        }
    }

    static class BinaryTree{
        static int index= -1;
        public static Node buildTree(int[] nodes){
            index--;
            if(index <= nodes.length || nodes[index] == -1){
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static int subtractionOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftSubtraction = subtractionOfNodes(root.left);
        int rightSubtraction = subtractionOfNodes(root.right);
        return root.data - leftSubtraction - rightSubtraction;
    }

    public static void main(String[] args) {
        //Creating the binary tree
        int[] nodes ={3, 9, -1, -1, 20, 15, -1, -1, 7, -1, -1};
        //Tree Structure:
        //     3
        //    /  \
        //   9    20
        //  / \   / \
        // -1 -1 15  7

        //Building the binary tree
       Node root = BinaryTree.buildTree(nodes);

        //Time taken to build the tree
        double now = System.currentTimeMillis();
        System.out.println(STR."Time taken: \{System.currentTimeMillis() - now}ms");


        //Sum of all nodes in the binary tree
        System.out.println(STR."Subtraction of all nodes in the binary tree: \{subtractionOfNodes(root)}");
    }
}
