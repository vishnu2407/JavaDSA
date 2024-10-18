package DSA_JAVA_Concepts.Non_Linear_DS.Trees.Binary_Search_Tree;

import java.util.ArrayList;

public class Root_To_Leaf_Paths_BST {
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
    //Root To Leaf Paths
    public static void root2LeafPaths(Node root, ArrayList<Integer> path){
        //if the root is null, return null
        if(root == null){
            return;
        }
        path.add(root.data);
        //Leaf node
        if(root.left == null & root.right == null){
            pritPath(path);
        }
        else {
            root2LeafPaths(root.left, path);
            root2LeafPaths(root.right, path);
        }
        //remove the last element from the path by Backtracking
        path.remove(path.size()-1);
    }

    private static void pritPath(ArrayList<Integer> path) {
        for(int i=0; i<path.size(); i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println();
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

        //Root To Leaf Paths
       root2LeafPaths(root, new ArrayList<Integer>());

    }
}
