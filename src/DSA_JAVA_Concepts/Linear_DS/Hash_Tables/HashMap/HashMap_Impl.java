package DSA_JAVA_Concepts.Linear_DS.Hash_Tables.HashMap;

import java.util.*;
import java.lang.*;

public class HashMap_Impl {
    static class HashMap<K, V> { // K = key, V = value generics(parameters)
        private class Node {
            K  key;
            V  value;

            private Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
            }
        private int n; //n --> no of nodes in the array of linked lists
        private int N; //N --> Total no. of buckets
        private LinkedList<Node> buckets[]; // N --> buckets.length, buckets --> array of type LinkedList Node, This is the HashMap


        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }
        private int hashFunction(K key){ //bi should be in range of [0, N-1]
            int bi = key.hashCode(); // bi --> bucket index
            return Math.abs(bi) % N; // bi --> absolute value of bi
        }

        private int searchInLL(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];

            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key == key){
                    return i; // data index
                }
            }
            return -1; // key not found in the bucket
        }

        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[2*N];
            N = 2*N;

            for(int i=0; i<N; i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i= 0; i<buckets.length; i++){
                LinkedList<Node> ll = oldBuckets[i];
                for(int j= 0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value){ //inserts key-value pair in the HashMap
            int bi = hashFunction(key); // bi --> bucket index
            int di = searchInLL(key, bi); //di --> data index value is valid (0+) if key is present in the bucket, else -1

            if(di==-1){ // key does not exist in the bucket
                buckets[bi].add(new Node(key, value));
                //n++; // increment the number of nodes in the HashMap
            }
            else{ // key already exists in the bucket
                Node node = buckets[bi].get(di);
                node.value = value;
            }
            double lambda = (double)n/N;
            if(lambda > 2.0){
                //rehashing the HashMap
                rehash();
            }
        }
        public V get(K key){ //returns the value of the key in the HashMap, if key is not present, returns null
            int bi = hashFunction(key); // bi --> bucket index
            int di = searchInLL(key, bi); //di --> data index value is valid (0+) if key is present in the bucket, else -1

            if(di==-1){ // key does not exist in the bucket
                return null;
            }
            else{ // key already exists in the bucket
                Node node = buckets[bi].get(di);
                 return node.value;
            }
        }
        public boolean containsKey(K key){ //returns true if key is present in the HashMap, else false
            int bi = hashFunction(key); // bi --> bucket index
            int di = searchInLL(key, bi); //di --> data index value is valid (0+) if key is present in the bucket, else -1

            if(di==-1){ // key does not exist in the bucket
                return false;
            }
            else{ // key already exists in the bucket
                return true;
            }
        }
        public V remove(K key){ //removes the key-value pair from the HashMap, if key is not present, returns null
            int bi = hashFunction(key); // bi --> bucket index
            int di = searchInLL(key, bi); //di --> data index value is valid (0+) if key is present in the bucket, else -1

            if(di!=-1){ // key does not exist in the bucket
                return null;
            }
            else{ // key already exists in the bucket
                Node node = buckets[bi].remove(di);
                n--; // decrement the number of nodes in the HashMap
                return node.value;
            }
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i=0; i<buckets.length; i++){ // My bucket index is i
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j<ll.size(); j++){  // My data index is j
                   Node node = ll.get(j);
                   keys.add(node.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){ //returns true if HashMap is empty, else false
            return n==0;
            }

        public static void main(String[] args) {
            HashMap<String,Integer> map = new HashMap<>();

            map.put("China", 200);
            map.put("USA", 510);
            map.put("Australia", 1001);
            map.put("Canada", 30);
            map.put("India", 190);

            //Time taken for put operation: 0ms
            double now = System.currentTimeMillis();
            System.out.println("Time taken: " + (System.currentTimeMillis() - now) + "ms");

            System.out.println("------------------------------------------------");

            //Time taken for get operation: 0ms


            ArrayList<String> keys = map.keySet();
            for(int i=0; i<keys.size(); i++){
                System.out.println(keys.get(i)+ " " +map.get(keys.get(i)));
            }
            System.out.println("------------------------------------------------");
            System.out.println(map.get("Australia"));

            System.out.println("------------------------------------------------");
            System.out.println(map.containsKey("Nepal"));

        }

    }
}
