package DSA_JAVA_Concepts.Non_Linear_DS.Trees.Binary_Tree.Deapth_First_Search_DFS.Recursion_DFS;

public class Diameter_of_Approach_2 {
    //Time Complexity to calculate the height of a Tree is O(n)
    static class Node{
        int data;
        Node right;
        Node left;

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

    public static int diameterOfNodes(Node root){
        if(root == null){
            return 0;
        }
        int diam1 = diameterOfNodes(root.left);
        int diam2 = diameterOfNodes(root.right);
        int diam3 = heightofNodes(root.left) + heightofNodes(root.right) + 1;
        return Math.max(diam3, Math.max(diam1, diam2));
    }

    static class TreeInfo{
        int Height;
        int Diameter;

        TreeInfo(int Height, int Diameter){
            this.Height = Height;
            this.Diameter = Diameter;
        }
    }
    public static TreeInfo diameterOfTree(Node root){
        //If the root is null, return a TreeInfo object with Height and Diameter as 0
        if(root == null){
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameterOfTree(root.left);
        TreeInfo right = diameterOfTree(root.right);

        int myHeight = Math.max(left.Height, right.Height) +1;

        int diam1 = left.Diameter;
        int diam2 = right.Diameter;

        int diam3 = left.Height + right.Height +1;

        int myDiameter = Math.max(diam3, Math.max(diam1, diam2));

        TreeInfo myInfo = new TreeInfo(myHeight, myDiameter);

        return myInfo;
    }

    public static void main(String[] args) {
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


        //Sum of all nodes in the binary tree
        System.out.println("Diameter of the binary tree is with approach 2[O(n)]: " + diameterOfTree(root).Diameter);
    }
}
