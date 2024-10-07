package Trie_Data_Structure;

public class Insert_Word_Into_Trie {
    //Node Function
    static class Node{
       Node[] children;
        boolean endOfWord ;

       public Node(){
           children = new Node[26]; //Assuming only lowercase alphabets
           for (int i=0; i<26; i++){
               children[i] = null;
           }
           endOfWord = false;
       }
    }
    static Node root = new Node();

    // Function to insert a word into Trie
    public static void insert(String words){
        words = words.toLowerCase(); //convert to lowercase
        Node curr = root;
        for(int i=0; i<words.length(); i++){  //The Time Complexity is O(L)
           int index = words.charAt(i) -'a';

           if(curr.children[index] == null){
               //add new node
               curr.children[index] = new Node();
           }
           if(i == words.length()-1){
               curr.children[index].endOfWord = true;
           }
           curr = curr.children[index]; //move to the child node
        }
    }
    //Search Function
    public static boolean search(String key){
        key = key.toLowerCase(); //convert to lowercase
        Node curr = root;
        //The Time Complexity is O(L)
        for(int i=0; i<key.length(); i++){  //The Time Complexity is O(L)
            int index = key.charAt(i) -'a';
            Node node = curr.children[index];

            if(node == null){
                return false;
            }

            if(curr.children[index] == null){
                return false;
            }
            if(i == key.length()-1 && node.endOfWord == false){
                return false;
            }
            curr = curr.children[index]; //move to the child node
        }
        return true;
    }


    // Main method
    public static void main(String args[]) {
        // Trie Data Structure
        String words[] ={"vishnu", "vivek", "vijay", "vamshi", "geya"};

        // Insert words into Trie
        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        // Search for a word in Trie
        System.out.println(search("Vishnu")); //true
        System.out.println(search("Vish")); //false
        System.out.println(search("Subhash")); //false
    }
}
