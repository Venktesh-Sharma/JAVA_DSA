package Hashing;
import java.util.* ; 


public class H2 {
    static class HashMap<K,V> {
        private class Node {
            K key ; 
            V value ; 

            public Node (K key, V value) {
                this.key = key ; 
                this.value = value ; 
            }
        }

        private int size ; // n
        private LinkedList<Node> buckets[] ; // N = buckets.length

        @SuppressWarnings("unchecked")
        public HashMap() {
            this.size = 0 ; 
            this.buckets = new LinkedList[4] ; 
            for (int i=0 ; i<4 ; i++) {
                this.buckets[i] = new LinkedList<>() ; 
            }
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        private int searchInBucket(K key, int bi) {
            LinkedList<Node> ll = buckets[bi];
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);
                if (node.key.equals(key)) {
                    return i; // index in linked list
                }
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            LinkedList<Node> oldBuckets[] = buckets;
            buckets = new LinkedList[oldBuckets.length * 2];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBuckets.length; i++) {
                LinkedList<Node> ll = oldBuckets[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) {
            int bi = hashFunction(key);
            int di = searchInBucket(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                size++;
            }

            double lambda = (double) size / buckets.length;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public boolean containsKey(K key) {
            int bi = hashFunction(key);
            int di = searchInBucket(key, bi);
            return di != -1;
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInBucket(key, bi);

            if (di != -1) {
                Node node = buckets[bi].remove(di);
                size--;
                return node.value;
            } else {
                return null;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key);
            int di = searchInBucket(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 150);
        map.put("China", 150);
        map.put("US", 50);
        map.put("Nepal", 5);

        ArrayList<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " -> " + map.get(key));
        }

        System.out.println("Remove India: " + map.remove("India"));
        System.out.println("Get India: " + map.get("India"));
    }
}
