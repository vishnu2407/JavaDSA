package DSA_JAVA_Concepts.Non_Linear_DS.Trees.Binary_Tree.Deapth_First_Search_DFS.Recursion_DFS;

public class Height_of_Nodes {
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
    public static int heightofNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftNodes = heightofNodes(root.left);
        int rightNodes = heightofNodes(root.right);

        //Calculate the height of the current node
        int myHeight = Math.max(leftNodes, rightNodes) + 1;
        return myHeight;

    }

    public static void main(String[] args) {
        //Build Tree Preorder sequence
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // Tree Structure:
        //       1
        //     /    \
        //    2       3
        //   / \     / \
        //  4   5   -1  6

        BinaryTree tree = new BinaryTree();
      Node root =tree.buildTree(nodes);

        //Time taken to build the tree
        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");


        //Levelorder Traversal
        //countofNodes(root);
        System.out.println("Height of the tree is: " + heightofNodes(root));
    }
}
