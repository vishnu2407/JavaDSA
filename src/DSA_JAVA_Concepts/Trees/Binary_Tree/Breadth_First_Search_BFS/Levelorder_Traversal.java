package DSA_JAVA_Concepts.Trees.Binary_Tree.Breadth_First_Search_BFS;

import java.util.LinkedList;
import java.util.Queue;

public class Levelorder_Traversal {
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
    //Levelorder Traversal
    static void levelorderTraversal(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node cuurNode = q.remove();
            if(cuurNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(cuurNode.data + " ");
                if(cuurNode.left!= null){
                    q.add(cuurNode.left);
                }
                if (cuurNode.right!= null){
                    q.add(cuurNode.right);
                }
            }
        }

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
        System.out.println(STR."Time taken: \{System.currentTimeMillis() - now}ms");

       //Levelorder Traversal
        levelorderTraversal(root);
    }
}
