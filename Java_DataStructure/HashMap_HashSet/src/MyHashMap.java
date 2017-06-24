import java.util.Arrays;

/**
 * Implement a HashMap including the following methods
 * size() isEmpty() clear()
 * put(key,value)
 * get(key)
 * containsKey(key)
 * containsValue(value)
 * remove(key)
 * key String type, value Integer type
 */
class MyHashMap {

    //Part1: define class for each element in the bucket, one bucket contains a linkedlist
    // Node class: the node of the linkedlist in each of the buckets
    public static class Node {
        final String key;
        Integer value;
        Node next;
        public Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }
    }

    //Part2: Define attributes in MyHashMap class
    //static final attributes - global constants - loadFactor and default capacity
    public static final int DefaultCap = 16;
    public static final float DefaultLoadFactor = 0.75f;

    //attributes of MyHashMap class
    private Node[] array;
    private int size;
    private float loadFactor;

    //Part3: constructor
    public MyHashMap(int cap, float loadFactor) {
        if (cap <= 0) {
            throw new IllegalArgumentException("CAP CANNOT BE <= 0");
        }
        this.array = new Node[cap];
        this.size = 0;
        this.loadFactor = loadFactor;
    }

    public MyHashMap() {
        // use this() to use the other constructor
        this(DefaultCap,DefaultLoadFactor);

    }
    //Part4: helper functions:
    //1. hash(): get the positive hashcode
    private int hash(String key) {
        // if the key is null, return to the map bucket where hashcode is 0
        if (key == null) {
            return 0;
        }
        //get the positive hash code
        int hashCode = key.hashCode();
        return hashCode >= 0? hashCode : -hashCode;
    }

    //2. getIndex(): get the key's index in the array
    private int getIndex(String key) {
        return hash(key) % array.length;
    }
    //3. equalsKey(): to define if two key represent the same index in the array
    private boolean equalsKey(String k1, String k2) {
        if (k1 == null && k2 == null) {
            return true;
        }
        if (k1 == null || k2 == null) {
            return false;
        }
        return k1.equals(k2); // equals() check if k1 and k2 points to the same object
    }

    //4. equalsKey(): to define if two key represent the same index in the array
    private boolean equalsValue(Integer v1, Integer v2) {
        if (v1 == null && v2 == null) {
            return true;
        }
        if (v1 == null || v2 == null) {
            return false;
        }
        return v1.equals(v2); // equals() check if k1 and k2 points to the same object
    }

    /*part5: methods with the helper functions
    *put(key,value)
    *get(key)
    *containsKey(key)
    *containsValue(value)
    *remove(key)
    */

    public Integer get(String key) {
        int index = getIndex(key);
        Node cur = array[index];
        while (cur!=null) {
            if (equalsKey(cur.key,key)) {
                return cur.value;
            }
            cur = cur.next;
        }
        return null;
    }

    //method  put(): return the value before update or insert
    public Integer put(String key, Integer value) {
        int index = getIndex(key);
        Node head = array[index];
        Node node = head;
        while (node!=null) {
            if (equalsKey(node.key,key)) {
                Integer result = node.value;
                node.value = value;
                return result;
            }
            node = node.next;
        }
        Node newNode = new Node(key,value);
        newNode.next = head;
        array[index] = newNode;
        size++;
        return null;
    }



    //Part6: methods without any helper functions
    //method size()
    public int size() {
        return size;
    }

    //method isEmpty()
    public boolean isEmpty() {
        return size == 0;
    }

    //method clear()
    public void clear() {
        Arrays.fill(this.array,null);
        size = 0;
    }




}
