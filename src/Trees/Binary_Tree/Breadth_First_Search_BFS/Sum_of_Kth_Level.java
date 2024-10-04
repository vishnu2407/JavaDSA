package Trees.Binary_Tree.Breadth_First_Search_BFS;

import java.util.*;

public class Sum_of_Kth_Level {
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

    //Function to find sum of nodes in kth level
    static void sumofKthLevel(Node root, int k){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int level = 1;
        while(!q.isEmpty()){
            int size = q.size();
            int sum = 0;
            for(int i=0; i<size; i++){
                Node temp = q.poll();
                if(level == k){
                    sum += temp.data;
                }
                if(temp.left != null){
                    q.add(temp.left);
                }
                if(temp.right != null){
                    q.add(temp.right);
                }
            }
            if(level == k){
                System.out.println("Sum of nodes in level " + k + " is " + sum);
                return;
            }
            level++;
        }
    }

    public static void main(String[] args) {
        //Build Tree Preorder sequence
        int nodes[] ={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root =tree.buildTree(nodes);

        //Time taken to build the tree
        double now = System.currentTimeMillis();
        System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

        //Sum of nodes in kth level
        sumofKthLevel(root, 2);
    }
}
