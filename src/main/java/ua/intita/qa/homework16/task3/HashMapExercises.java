package ua.intita.qa.homework16.task3;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExercises {
  public static void main(String[] args) {
    //Write a Java program to associate the specified value with the specified key in a HashMap.
    Map<Integer, String> hash_map= new HashMap<>();
    hash_map.put(1, "Tree");
    hash_map.put(2, "Flower");
    hash_map.put(3, "Grass");
    hash_map.put(4, "Bush");

//Write a Java program to count the number of key-value (size) mappings in a map.
    System.out.println("Size of the hash map: "+hash_map.size());

//Write a Java program to copy all of the mappings from the specified map to another map.
    Map<Integer, String> hash_map1= new HashMap<>();
    hash_map.put(1, "Sun");
    hash_map.put(2, "Earth");
    hash_map.put(3, "Mercury");
    hash_map.put(4, "Jupiter");
    hash_map1.putAll(hash_map);
    System.out.println("\nSecond map: " + hash_map1);

//Write a Java program to remove all of the mappings from a map.
    hash_map1.clear();

//Write a Java program to check whether a map contains key-value mappings (empty) or not.
    boolean result = hash_map.isEmpty();
    System.out.println("Is hash map empty: " + result);

//Write a Java program to get a shallow copy of a HashMap instance.
    hash_map1 = (HashMap) ((HashMap<Integer, String>) hash_map).clone();
    System.out.println("Cloned map: " + hash_map1);

//Write a Java program to test if a map contains a mapping for the specified key.
    System.out.println("1. Is key 'Jupiter' exists in hash_map?");
    if (hash_map1.containsKey("Jupiter")) {
      System.out.println("yes - " + hash_map1.get("Jupiter"));
    } else {
      System.out.println("no");
    }

//Write a Java program to test if a map contains a mapping for the specified value.
    System.out.println("1. Is value 'Jupiter' exists?");
    if (hash_map.containsValue("Jupiter")) {
      System.out.println("Yes ");
    } else {
      System.out.println("no");
    }

//Write a Java program to create a set view of the mappings contained in a map.
    Set set = hash_map.entrySet();
    System.out.println("Set values: " + set);

//Write a Java program to get the value of a specified key in a map.
    String value=(String)hash_map.get(3);
    System.out.println("Value for key 3 is: " + value);

//Write a Java program to get a set view of the keys contained in this map.
    Set keyset = hash_map.keySet();
    System.out.println("Key set values are: " + keyset);

//Write a Java program to get a collection view of the values contained in this map.
    System.out.println("Collection view is: "+ hash_map.values());
  }
}

