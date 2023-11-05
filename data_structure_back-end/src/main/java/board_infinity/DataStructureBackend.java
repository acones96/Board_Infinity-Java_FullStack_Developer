package board_infinity;

import java.util.*;

enum Size {
    SMALL, 
    MEDIUM, 
    LARGE, 
    EXTRALARGE;
}

public class DataStructureBackend {

    public static void main(String[] args) {
        
        // Vector
            Vector<String> vector = new Vector<String>();

            System.out.println("***** Vector *****");
            vector.add("Programming");
            vector.add("Networking");
            vector.add("Database");
            vector.add("Deployment");

            System.out.println(vector);
            System.out.println(vector.size());
            vector.clear();
            System.out.println(vector.size());

        // List
            // LinkedList
                LinkedList<String> linkedList = new LinkedList<String>();
                System.out.println("***** LinkedList *****");
                System.out.println(linkedList.size());
                linkedList.add("Java");
                linkedList.add("Python");
                linkedList.add("C#");
                linkedList.add("JavaScript");

                System.out.println(linkedList);

                linkedList.add(2, "C++");
                linkedList.remove(0);
                linkedList.remove("JavaScript");
                
                System.out.println(linkedList);

            // ArrayList
                System.out.println("***** ArrayList *****");
                ArrayList<String> arrayList = new ArrayList<String>();
                arrayList.add("Jorge");
                arrayList.add("Miguel");
                arrayList.add("Luffy");

                System.out.println(arrayList);
                System.out.println("Size of ArrayList : " + arrayList.size());

                arrayList.remove(0);

                for (String iteraString : arrayList) {
                    System.out.println(iteraString);
                }

        // Stacks
            Stack<Integer> stack = new Stack<Integer>();
            System.out.println(stack.size());

            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);

            System.out.println(stack);
            System.out.println(stack.size());
            System.out.println(stack.pop());
            System.out.println(stack.peek());
            System.out.println(stack.size());
            System.out.println(stack);

        // Queue
            PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
            System.out.println(queue.size());

            queue.add(10);
            queue.add(20);
            queue.add(30);
            queue.add(40);
            queue.add(50);

            System.out.println(queue);
            System.out.println(queue.size());
            System.out.println(queue.peek());
            System.out.println(queue.poll());
            System.out.println(queue);
            System.out.println(queue.size());
            System.out.println(queue.isEmpty());
            System.out.println(!queue.isEmpty());
        
        // Maps
            // HashMap
                Map<Integer, String> map = new HashMap<Integer, String>();
                map.put(100, "Jorge");
                map.put(101, "Miguel");
                map.put(102, "Pedro");
                map.put(103, "Adrian");

                for (Map.Entry<Integer, String> iterateEntry : map.entrySet()) {
                    System.out.println(iterateEntry.getKey() + " : " + iterateEntry.getValue());
                }

                System.out.println(map.get(101));
                System.out.println(map.keySet());
                System.out.println(map.values());
                System.out.println(map.entrySet());
                System.out.println(map.remove(101));
                map.clear();
                System.out.println(map);
        
            // Linked HashMap
                LinkedHashMap<String, Integer> evenNumber = new LinkedHashMap<String, Integer>();
                evenNumber.put("Two", 2);
                evenNumber.put("Four", 4);
            
                System.out.println(evenNumber);

                LinkedHashMap<String, Integer> numbers = new LinkedHashMap<String, Integer>(evenNumber);
                numbers.put("Six", 6);
                
                System.out.println(numbers);

                numbers.putIfAbsent("Six", 6);
                numbers.putIfAbsent("Eight", 8);
                System.out.println(numbers);


            // Weak HashMap
                WeakHashMap<String, Integer> weakNumbers = new WeakHashMap<String, Integer>();
                weakNumbers.put("One", 1);
                weakNumbers.put("Two", 2);
                weakNumbers.put("Three", 3);
                weakNumbers.put("Four", 4);

                System.out.println(weakNumbers);

            // Enum Map
                EnumMap<Size, Integer> enumSizes = new EnumMap<Size, Integer>(Size.class);
                enumSizes.put(Size.SMALL, 20);
                enumSizes.put(Size.MEDIUM, 30);
                enumSizes.put(Size.LARGE, 40);
                enumSizes.put(Size.EXTRALARGE, 50);

                System.out.println(enumSizes);
                System.out.println(enumSizes.keySet());
                System.out.println(enumSizes.values());
                System.out.println(enumSizes.entrySet());

            // Sorted Map
                SortedMap<String, Integer> sortedNumbers = new TreeMap<String,Integer>();

                sortedNumbers.put("One", 1);
                sortedNumbers.put("Two", 2);
                sortedNumbers.put("Three", 3);

                System.out.println(sortedNumbers);
                System.out.println(sortedNumbers.firstKey());
                System.out.println(sortedNumbers.lastKey());
                System.out.println(sortedNumbers.remove("Three"));
                System.out.println(sortedNumbers);

            // NavigableMap Interface
                NavigableMap<String, Integer> navigableNumber = new TreeMap<String,Integer>();

                navigableNumber.put("One", 1);
                navigableNumber.put("Two", 2);
                navigableNumber.put("Three", 3);
                
                System.out.println(navigableNumber);
                System.out.println(navigableNumber.firstEntry());
                System.out.println(navigableNumber.lastEntry());
                System.out.println(navigableNumber.pollFirstEntry());
                System.out.println(navigableNumber.pollLastEntry());

                System.out.println(navigableNumber);

            // TreeMap
                TreeMap<String, Integer> treeNumber = new TreeMap<String, Integer>();

                treeNumber.put("One", 1);
                treeNumber.put("Two", 2);
                treeNumber.put("Three", 3);
                System.out.println(treeNumber);

                treeNumber.putIfAbsent("One", 1);
                treeNumber.putIfAbsent("Four", 4);
                System.out.println(treeNumber);

                System.out.println(treeNumber.keySet());
                System.out.println(treeNumber.values());
                System.out.println(treeNumber.entrySet());

        // Set
            Set<Integer> setNumber = new HashSet<Integer>();
            setNumber.add(100);
            setNumber.add(200);
            setNumber.add(300);

            System.out.println(setNumber);

            Iterator<Integer> iterateSet = setNumber.iterator();
            while (iterateSet.hasNext()) {
                System.out.println(iterateSet.next());
            }
    
            // HashSet
                HashSet<Integer> hashNumber = new HashSet<Integer>();
                hashNumber.add(100);
                hashNumber.add(200);
                hashNumber.add(300);

                System.out.println(hashNumber);

                Iterator<Integer> iterateHash = hashNumber.iterator();
                while (iterateHash.hasNext()) {
                    System.out.println(iterateHash.next());
                }

                // Delete an element of the table
                System.out.println(hashNumber.remove(100));
                System.out.println(hashNumber);
                
                // Clear the table
                System.out.println(hashNumber.removeAll(hashNumber));
                System.out.println(hashNumber);

                HashSet<Integer> hashNumber1 = new HashSet<Integer>();
                hashNumber1.add(100);
                hashNumber1.add(200);
                hashNumber1.add(300);

                HashSet<Integer> hashNumber2 = new HashSet<Integer>();
                hashNumber2.add(400);
                hashNumber2.add(500);
                hashNumber2.add(600);

                // Add all elements of the other table
                hashNumber2.addAll(hashNumber1);
                System.out.println(hashNumber2);

                // Take the smae values of both tables
                hashNumber1.add(800);
                hashNumber1.retainAll(hashNumber2);
                System.out.println(hashNumber1);

                // Difference
                hashNumber1.removeAll(hashNumber2);
                System.out.println(hashNumber);

            // EnumSet

                // Store all elements frmo the enum class
                EnumSet<Size> enumSet = EnumSet.allOf(Size.class);
                System.out.println(enumSet);

                // Creates a empty enum space of a specific type
                EnumSet<Size> enumSet1 = EnumSet.noneOf(Size.class);
                System.out.println(enumSet1);

                // Add from one value to another frmo the enum class
                EnumSet<Size> enumSet2 = EnumSet.range(Size.MEDIUM, Size.EXTRALARGE);
                System.out.println(enumSet2);

                // Add specific values
                EnumSet<Size> enumSet3 = EnumSet.of(Size.SMALL, Size.LARGE);
                System.out.println(enumSet3);

                // Iterate the enum class
                Iterator<Size> iterateEnumSet = enumSet.iterator();
                while (iterateEnumSet.hasNext()) 
                    System.out.println(iterateEnumSet.next());
                
                // Delete a specific value from an enumSet
                enumSet.remove(Size.MEDIUM);
                System.out.println(enumSet);

                // Delete all his values
                enumSet.removeAll(enumSet);
                System.out.println(enumSet);
            
            // LinkedHashSet
                ArrayList<Integer> arrayNumber = new ArrayList<Integer>();
                arrayNumber.add(2);
                arrayNumber.add(4);
                arrayNumber.add(6);
                arrayNumber.add(8);

                System.out.println(arrayNumber);

                // Insert values from another array
                LinkedHashSet<Integer> linkedNumberSet = new LinkedHashSet<Integer>(arrayNumber);
                System.out.println(linkedNumberSet);

                // Add new elements
                linkedNumberSet.add(10);
                linkedNumberSet.add(12);
                linkedNumberSet.add(14);
                System.out.println(linkedNumberSet);

                // Iterate elements of the linkedHashSet
                Iterator<Integer> iteratorLinkedNumber = linkedNumberSet.iterator();
                while (iteratorLinkedNumber.hasNext()) 
                    System.out.println(iteratorLinkedNumber.next());

                // Remove an element of the set
                System.out.println(linkedNumberSet.remove(2));
                System.out.println(linkedNumberSet);

                // Check for the different values
                System.out.println(linkedNumberSet.removeAll(arrayNumber));
                System.out.println(linkedNumberSet);

                // Remove all elements of the set
                System.out.println(linkedNumberSet.removeAll(linkedNumberSet));
                System.out.println(linkedNumberSet);

                // Add all elements of an array
                System.out.println(linkedNumberSet.addAll(arrayNumber));
                System.out.println(linkedNumberSet);

            // SortedSet
                SortedSet<String> sortedSetNumber = new TreeSet<String>();
                sortedSetNumber.add("Bharat");
                sortedSetNumber.add("Mexico");
                sortedSetNumber.add("Australia");
                sortedSetNumber.add("Africa");
                sortedSetNumber.add("Africa");

                // Print is in ascending order without dupllicates
                System.out.println(sortedSetNumber);

                Iterator<String> iteratorSortedSet = sortedSetNumber.iterator();
                while (iteratorSortedSet.hasNext())
                    iteratorSortedSet.next();
                
                System.out.println(sortedSetNumber.contains("Bharat"));
                System.out.println(sortedSetNumber.last());

                // Remove element
                System.out.println(sortedSetNumber.remove("Africa"));
                System.out.println(sortedSetNumber);

                // Remove all elements
                sortedSetNumber.removeAll(sortedSetNumber);
                System.out.println(sortedSetNumber);

            // NavigableSet
                NavigableSet<Integer> navigableSetNumber = new TreeSet<Integer>();
                navigableSetNumber.add(10);
                navigableSetNumber.add(20);
                navigableSetNumber.add(30);
                navigableSetNumber.add(40);
                navigableSetNumber.add(1);
                navigableSetNumber.add(2);
                navigableSetNumber.add(3);

                
                // Reverse the order
                NavigableSet<Integer> reverseNavigableSetNumber = navigableSetNumber.descendingSet();
                System.out.println(navigableSetNumber);
                System.out.println(reverseNavigableSetNumber);
                
                // Returns elements that are greater than or equal to condition
                NavigableSet<Integer>navigableSetNumber1 = navigableSetNumber.tailSet(3, true);
                System.out.println(navigableSetNumber1);

                // Return the greatest elements lower than a number
                System.out.println(navigableSetNumber.lower(3));

            // TreeSet
                    NavigableSet<String> treeSetNumber = new TreeSet<String>();
                    treeSetNumber.add("A");
                    treeSetNumber.add("B");
                    treeSetNumber.add("C");
                    treeSetNumber.add("D");
                    treeSetNumber.add("E");

                    System.out.println(treeSetNumber);

                    // Search for an element
                    System.out.println(treeSetNumber.contains("F"));
                    // Returns the lowest element
                    System.out.println(treeSetNumber.first());
                    // Returns the highest element
                    System.out.println(treeSetNumber.last());
                    // Return the least element higher than the one we indicate
                    System.out.println(treeSetNumber.higher("B"));
                    // Return the greatest element less than the one we indicate
                    System.out.println(treeSetNumber.lower("B"));
                    // Retrieves and removes the first (lowest) element
                    System.out.println(treeSetNumber.pollFirst());
                    // Retrieves and removes the last (highest) element
                    System.out.println(treeSetNumber.pollLast());

                
    }


    
}
