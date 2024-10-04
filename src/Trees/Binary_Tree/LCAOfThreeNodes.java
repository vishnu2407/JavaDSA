package Trees.Binary_Tree;

/**********************************************************
 Following is the Binary Tree Node class.

 class BinaryTreeNode<T> {
 T data;
 BinaryTreeNode<T> left;
 BinaryTreeNode<T> right;

 public BinaryTreeNode(T data) {
 this.data = data;
 }
 }

 ***********************************************************/

import java.util.*;

public class LCAOfThreeNodes {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    // Build binary tree from the input array (level-order)
    public static Node buildTree(int[] nodes) {
        if (nodes.length == 0 || nodes[0] == -1) {
            return null;
        }

        Queue<Node> queue = new LinkedList<>();
        Node root = new Node(nodes[0]);
        queue.add(root);
        int i = 1;

        while (!queue.isEmpty() && i < nodes.length) {
            Node current = queue.poll();

            // Add left child
            if (nodes[i] != -1) {
                current.left = new Node(nodes[i]);
                queue.add(current.left);
            }
            i++;

            // Add right child
            if (i < nodes.length && nodes[i] != -1) {
                current.right = new Node(nodes[i]);
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

    // Function to find the LCA of three nodes
    public static Node findLCA(Node root, int N1, int N2, int N3) {
        if (root == null) {
            return null;
        }

        // If the current node is one of N1, N2, or N3
        if (root.data == N1 || root.data == N2 || root.data == N3) {
            return root;
        }

        // Recursively search in left and right subtrees
        Node leftLCA = findLCA(root.left, N1, N2, N3);
        Node rightLCA = findLCA(root.right, N1, N2, N3);

        // If one node is found in the left subtree and the other in the right, return current node
        if (leftLCA != null && rightLCA != null) {
            return root;
        }

        // Otherwise, return the non-null node (if any)
        return (leftLCA != null) ? leftLCA : rightLCA;
    }

    // Function to handle multiple test cases
    public static void findLCAsForTestCases(int T, List<int[]> testCases, List<int[]> trees) {
        for (int i = 0; i < T; i++) {
            int[] currentTest = testCases.get(i); // N1, N2, N3
            int[] treeNodes = trees.get(i); // Tree in level-order form

            Node root = buildTree(treeNodes);

            int N1 = currentTest[0];
            int N2 = currentTest[1];
            int N3 = currentTest[2];

            // Find the LCA of N1, N2, N3
            Node lca = findLCA(root, N1, N2, N3);
            System.out.println(lca.data); // Output the LCA node's data
        }
    }

    public static void main(String[] args) {
        // Example Input
        int T = 2; // Number of test cases

        List<int[]> testCases = new ArrayList<>();
        testCases.add(new int[]{7, 8, 2}); // N1, N2, N3 for test case 1
        testCases.add(new int[]{5, 6, 7}); // N1, N2, N3 for test case 2

        List<int[]> trees = new ArrayList<>();
        trees.add(new int[]{1, 2, 3, 4, 5, -1, 6, 7, 8, 9, -1, -1, -1, 10, -1, 11, -1, -1, -1, -1, -1}); // Tree 1
        trees.add(new int[]{1, 2, 3, 4, 5, -1, 6, 7, 8, 9, -1, -1, -1, 10, -1, 11, -1, -1, -1, -1, -1}); // Tree 2

        // Find LCAs for all test cases
        findLCAsForTestCases(T, testCases, trees);
    }
}
