package Trees.Binary_Tree.Deapth_First_Search_DFS.Recursion;

public class Subtree_of_AnotherTree {
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
        public static void resetIndex() {
            index = -1;
        }
    }
    static boolean isSubtree(Node root, Node subRoot){
        if(root == null && subRoot == null){
            return true;
        }
        if(root == null || subRoot == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isSubtree(root.left, subRoot.left) && isSubtree(root.right, subRoot.right)){
                return true;
            }
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    public static void main(String[] args) {
        //Build Tree Preorder sequence
        int[] node1 = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // Tree Structure:
        //       1
        //     /    \
        //    2       3
        //   / \     / \
        //  4   5   -1  6
        int[] node2 = {2, 4, -1, -1, 5, -1, -1};
        // Subtree Structure:
        //       2
        //     /  \
        //    4    5

        BinaryTree.resetIndex();
        BinaryTree tree = new BinaryTree();
        Node root =tree.buildTree(node1); //Build Main Tree

        BinaryTree.resetIndex();
        Node subRoot = tree.buildTree(node2); //Build Subtree

        //Time taken to build the tree
        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

        //Check if subtree is present in the main tree
        boolean result = isSubtree(root, subRoot);
        System.out.println("Subtree is present: " + result);
    }
}
