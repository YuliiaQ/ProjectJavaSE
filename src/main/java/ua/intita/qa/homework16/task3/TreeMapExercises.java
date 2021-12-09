package ua.intita.qa.homework16.task3;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExercises {
    public static void main(String[] args) {
//1.Write a Java program to associate the specified value with the specified key in a Tree Map.
        TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();
        tree_map.put(1, "Moon");
        tree_map.put(2, "Neptune");
        tree_map.put(3, "Pluto");
        tree_map.put(4, "Venus");
        tree_map.put(5, "Mars");
        for (Map.Entry<Integer,String> entry : tree_map.entrySet())
        {
            System.out.println(entry.getKey() + "=>" + entry.getValue());
        }
//2. Write a Java program to copy a Tree Map content to another Tree Map.
        TreeMap<Integer,String> new_tree_map=new TreeMap<Integer,String>();
        new_tree_map.put(23, "Mercury");
        new_tree_map.put(12, "Earth");
        tree_map.putAll(new_tree_map);
        System.out.println(new_tree_map);
//3. Write a Java program to search a key in a Tree Map.
        System.out.println(new_tree_map);
        if(new_tree_map.containsKey("Earth")){
            System.out.println("The Tree Map contains key Earth");
        } else {
            System.out.println("The Tree Map does not contain key Eart");
        }

//4. Write a Java program to search a value in a Tree Map.
        if(new_tree_map.containsValue("Earth")){
            System.out.println("The TreeMap contains value Earth");
        } else {
            System.out.println("The TreeMap does not contain value Earth");
        }
//5. Write a Java program to get all keys from the given a Tree Map.
//6. Write a Java program to delete all elements from a given Tree Map.
//7. Write a Java program to sort keys in Tree Map by using comparator.
//8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
//9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
//10. Write a Java program to get a reverse order view of the keys contained in a given map.
//11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
//12. Write a Java program to get the greatest key less than or equal to the given key.
//13. Write a Java program to get the portion of a map whose keys are strictly less than a given key.
//14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
//15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
//16. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.
//17. Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.
//18. Write a Java program to get NavigableSet view of the keys contained in a map.
//19. Write a Java program to remove and get a key-value mapping associated with the least key in a map.
//20. Write a Java program to remove and get a key-value mapping associated with the greatest key in this map.
//21. Write a Java program to get the portion of a map whose keys range from a given key (inclusive), to another key (exclusive).
//22. Write a Java program to get the portion of a map whose keys range from a given key to another key.
//23. Write a Java program to get a portion of a map whose keys are greater than or equal to a given key.
//24. Write a Java program to get a portion of a map whose keys are greater than to a given key.
//25. Write a Java program to get a key-value mapping associated with the least key greater than or equal to the given key. Return null if there is no such key.
//26. Write a Java program to get the least key greater than or equal to the given key. Returns null if there is no such key.
    }
}
