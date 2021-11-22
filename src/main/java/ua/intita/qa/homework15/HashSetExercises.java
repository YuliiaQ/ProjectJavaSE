package ua.intita.qa.homework15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExercises {
    public static void main(String[] args) {
        //Write a Java program to append the specified element to the end of a hash set.
        HashSet<String> h_set = new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println(h_set);

        //Write a Java program to iterate through all elements in a hash list.
        Iterator<String> p = h_set.iterator();
        while (p.hasNext()) {
            System.out.println(p.next());
        }

        //Write a Java program to get the number of elements in a hash set.
        System.out.println("Size of the Hash Set: " + h_set.size());

        //Write a Java program to empty a hash set.
        h_set.clear();

        //Write a Java program to test a hash set is empty or not.
        boolean empty = h_set.isEmpty();
        System.out.println(empty);

        //Write a Java program to convert a hash set to a tree set.
        HashSet<String> h_set1 = new HashSet<String>();
        h_set1.add("Red");
        h_set1.add("Green");
        h_set1.add("Black");
        h_set1.add("White");
        h_set1.add("Pink");
        h_set1.add("Yellow");
        System.out.println(h_set1);

        //Write a Java program to clone a hash set to another hash set.
        HashSet <String> new_h_set = (HashSet <String>)h_set1.clone();
        System.out.println("Cloned Hash Set: " + new_h_set);

        //Write a Java program to convert a hash set to an array.
        String arr[] = new String[h_set1.size()];

        int i=0;
        for(String ele:h_set1){
            arr[i++] = ele;
        }
        for (String n : arr)
            System.out.print(n);

        //Write a Java program to convert a hash set to a List/ArrayList.
        ArrayList<String> color_array = new ArrayList<>(h_set1);
        System.out.println("\nElements of flower Arraylist are :" + color_array);

        //Write a Java program to compare two hash set.
        HashSet<String>result_set = new HashSet<String>();
        for (String element : h_set){
            System.out.println(h_set1.contains(element) ? "Yes" : "No");
        }


        //Write a Java program to compare two sets and retain elements which are same on both sets.

        // Write a Java program to remove all of the elements from a hash set.
        h_set1.clear();
    }





}
