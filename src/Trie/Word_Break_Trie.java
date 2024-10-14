package Trie;

public class Word_Break_Trie {
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
    public static boolean search(String key){
        key = key.toLowerCase(); //convert to lowercase
        Node curr = root;
        //The Time Complexity is O(L)
        for(int i=0; i<key.length(); i++){  //The Time Complexity is O(L) L = length of key

            int index = key.charAt(i) -'a';
            Node node = curr.children[index];

            if(node == null)
                return false;

            if(i == key.length()-1 && !node.endOfWord) //node.endOfWord == false
                return false;

            curr = node ;//curr.children[index] move to the child node
        }
        return true;
    }

    //Function to check if a given string can be formed by combining a set of words from Trie
    public static boolean wordBreak(String key){
        if (key.isEmpty())
            return true;

        for (int i = 1; i < key.length(); i++)
            if (search(key.substring(0,i)) && wordBreak(key.substring(i)))
                return true;
        return false;
        }

    public static void main(String[] args) {
        // Trie Data Structure
        String[] words ={"i", "like", "sam", "samsung", "mobile", "ice"};
        //String key = "ilikesamsungmobile";

        // Insert words into Trie
//        for(int i=0; i<words.length; i++)
//            insert(words[i]);

        for(String s: words)
            insert(s);

        //search for a key in Trie
        System.out.println(search("samsung"));

        // Find if a given string can be formed by combining a set of words from Trie
        System.out.println(wordBreak("ilikesamsungmobile"));

    }
}
