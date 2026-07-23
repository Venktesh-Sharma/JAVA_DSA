Hashing -----> Prestoring and Feching

Two Types 
1. Map             Hash_Map , Lined_Hash_Map , Tree_Map
2. Set             Hash_Set , Linked_Hash_Map , Tree_Map

---> HASH_MAP
Syntax -----> HashMap <Key_Type , Value_Type> map = new HashMap <> () ;

        Method                   Description
        
        put(key, value)	        Inserts or updates a key-value pair
        get(key)	            Returns the value for the key
        remove(key)	            Removes the key-value pair
        containsKey(key)	    Checks if a key exists
        containsValue(value)	Checks if a value exists
        size()	                Returns the number of entries
        isEmpty()	            Checks if the map is empty
        clear()	                Removes all entries
        keySet()	            Returns all keys
        values()	            Returns all values
        entrySet()	            Returns all key-value pairs


Iteration on HashMap
        Set <key type> keys = map.keySet() ;



LinkedHashMap in Java
        LinkedHashMap is a class that stores key-value pairs like a HashMap, but also maintains the order of entries.

        Syntax
                LinkedHashMap<KeyType, ValueType> map = new LinkedHashMap<>();


Tree Map 
        TreeMap is a class that stores key-value pairs in sorted order of keys
        
        Syntax
                TreeMap<KeyType, ValueType> map = new TreeMap<>();
        
        Iteration
                for (var entry : map.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
                }

        Common Methods
                map.firstKey();     // Smallest key
                map.lastKey();      // Largest key
                map.ceilingKey(4);  // Smallest key >= 4
                map.floorKey(4);    // Largest key <= 4
                map.higherKey(4);   // Next greater key
                map.lowerKey(4);    // Next smaller key

        Reverse Order
                TreeMap<Integer, String> map =
                new TreeMap<>(Collections.reverseOrder());


HashSet in Java
A HashSet is a collection that stores only unique elements. It is part of the java.util package and internally uses a HashMap.
        Syntax

                import java.util.HashSet;
                HashSet<DataType> set = new HashSet<>();


        Common Methods
        1. add()
        Adds an element.
        set.add(10);
        2. remove()
        Removes an element.
        set.remove(10);
        3. contains()
        Checks whether an element exists.
        if(set.contains(20)){
        System.out.println("Found");
        }
        4. size()
        Returns the number of elements.
        System.out.println(set.size());
        5. isEmpty()
        Checks whether the set is empty.
        set.isEmpty();
        6. clear()
        Removes all elements.
        set.clear();

HashSet vs HashMap

Feature	                HashSet	                HashMap

Stores	                Only values	        Key-Value pairs
Duplicates	        Not allowed	        Keys not allowed, values allowed
Null	                One null element	One null key, multiple null values
Order	                No order	        No order
Internal Structure	Uses HashMap	        Uses hashing

Iterations on HashSet 
        Iterator
        An Iterator is an object used to access collection elements one by one.
        Syntax
        Iterator<DataType> it = collection.iterator();

        while (it.hasNext()) {
        System.out.println(it.next());
        }
        
        Method	        Description
        hasNext()	Returns true if another element exists
        next()	        Returns the next element
        remove()	Removes the current element safely


        Enhanced For Loop (For-each)
        The enhanced for loop is a simpler way to iterate over arrays and collections.
        Syntax
        for (DataType variable : collection) {
        // code
        }

        LinkedHashSet in Java
        A LinkedHashSet is a collection that stores unique elements while preserving the order in which they were inserted.
        It combines:
        Hash Table → Fast operations (O(1) average)
        Linked List → Maintains insertion order
        It belongs to the java.util package.
        Syntax
        import java.util.LinkedHashSet;

        LinkedHashSet<DataType> set = new LinkedHashSet<>();


        TreeSet in Java
        A TreeSet is a collection that stores unique elements in sorted (ascending) order.
        It is implemented using a Red-Black Tree (a self-balancing binary search tree).
        Package:
        import java.util.TreeSet;
        Syntax
        TreeSet<DataType> set = new TreeSet<>();

        Common Methods
        add()
        set.add(50);

        remove()
        set.remove(20);

        contains()
        set.contains(30);

        first()
        Returns the smallest element.
        System.out.println(set.first());

        last()
        Returns the largest element.
        System.out.println(set.last());

        higher()
        Returns the smallest element greater than the given element.
        System.out.println(set.higher(20));
        Example:
        Set = [10,20,30,40]
        higher(20) → 30

        lower()
        Returns the largest element smaller than the given element.
        System.out.println(set.lower(20));
        Example:
        Set = [10,20,30,40]
        lower(20) → 10

        ceiling()
        Returns the given element if present; otherwise, the next greater element.
        System.out.println(set.ceiling(25));
        Output:
        30

        floor()
        Returns the given element if present; otherwise, the next smaller element.
        System.out.println(set.floor(25));
        Output:
        20


        Traversing TreeSet
        Enhanced For Loop
        TreeSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);

        for (Integer num : set) {
        System.out.println(num);
        }
        Output
        10
        20
        30
        Iterator
        Iterator<Integer> it = set.iterator();

        while (it.hasNext()) {
        System.out.println(it.next());
        }

        Characteristics
        ✅ Stores unique elements
        ✅ Automatically sorts elements
        ✅ Does not maintain insertion order
        ❌ Does not allow null (throws NullPointerException)
        ✅ Backed by a Red-Black Tree


HashSet vs LinkedHashSet vs TreeSet
Feature	         HashSet	LinkedHashSet	              TreeSet
Duplicates	 ❌ No	       ❌ No	                     ❌ No
Order	         No order	Insertion order	              Sorted order
Null	        One allowed	One allowed	              ❌ Not allowed
Implementation	Hash Table	Hash Table + Linked List      Red-Black Tree
add()/remove()  O(1) avg        O(1) avg                      O(log n)
   /contains()	