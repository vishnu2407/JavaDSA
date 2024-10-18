package DSA_JAVA_Concepts.Trees.Binary_Tree.Deapth_First_Search_DFS.Recursion.ArithmeticOperators.Addition;


public class Sum_of_Left_Nodes {
    //Node Class
    static class Node{
        //Node Class
        int data;
        Node left, right;
        // Constructor
        Node(int data){
            this.data = data;
            left = right = null;
        }
    }
        //Binary Tree
        static class BinaryTree{
            public static int index= -1;
            public static Node buildTree(int[] nodes){
                index++;
                if(index >= nodes.length || nodes[index] == -1){
                    return null;
                }
                Node newNode = new Node(nodes[index]);
                newNode.left = buildTree(nodes);
                newNode.right = buildTree(nodes);

                return newNode;
            }
        }

    //Sum of Left Nodes
    public static int sumOfLeftNodes(boolean left, Node root) {
        // Base case: If node is null, return 0
        if (root == null) {
            return 0;
        }

        int sum = 0;

        // Check if it's a left leaf node
        if (left && root.left == null && root.right == null) {
            sum += root.data;
        }

        // Recursively sum left and right subtrees
        sum += sumOfLeftNodes(true, root.left);  // Check left subtree (mark as left)
        sum += sumOfLeftNodes(false, root.right);  // Check right subtree (mark as right)

        return sum;
    }
    // Main Method
    public static void main(String[]args) {
        // Creating the Sum_of_Left_Nodes object
        int[] nodes = {3, 9, -1, -1, 20, 15, -1, -1, 7};

        // Building the Binary Tree
        //BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);


        //Time taken to build the tree
        double now = System.currentTimeMillis();
        System.out.println(STR."Time taken: \{System.currentTimeMillis() - now}ms");

        // Sum of Left Nodes
        int sum = sumOfLeftNodes(false, root);
        System.out.println(STR."Sum of Left Nodes: \{sum}");

    }
}
