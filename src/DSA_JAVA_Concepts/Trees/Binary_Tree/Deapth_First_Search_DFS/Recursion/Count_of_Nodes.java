package DSA_JAVA_Concepts.Trees.Binary_Tree.Deapth_First_Search_DFS.Recursion;

public class Count_of_Nodes {
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
    public static int countofNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = countofNodes(root.left);
        int rightNodes = countofNodes(root.right);
        return leftNodes + rightNodes + 1;
    }

    public static void main(String[] args) {
        //Build Tree Preorder sequence
        int[] nodes ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // Tree Structure:
        //       1
        //     /    \
        //    2       3
        //   / \     / \
        //  4   5   -1  6

        Node root = BinaryTree.buildTree(nodes);

        //Time taken to build the tree
        double now = System.currentTimeMillis();
        System.out.println(STR."Time taken: \{System.currentTimeMillis() - now}ms");


        //Levelorder Traversal
        //countofNodes(root);
        System.out.println(countofNodes(root));
    }
}
