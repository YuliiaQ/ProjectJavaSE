package ua.intita.qa.homework15;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExercises {
    public static void main(String[] args) {
//    Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");
        System.out.println("Tree set: " + tree_set);
// Write a Java program to iterate through all elements in a tree set.
        for (String element : tree_set) {
            System.out.println(element);
        }

//Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<String> tree_set1 = new TreeSet<String>();
        tree_set1.add("Blue");
        tree_set1.add("Violet");
        tree_set1.add("Pink");
        tree_set1.add("Beige");
        tree_set1.add("Yellow");
        System.out.println("Tree set1: "+ tree_set1);
        tree_set.addAll(tree_set1);
        System.out.println("Tree set: "+tree_set);

//Write a Java program to create a reverse order view of the elements contained in a given tree set.
        Iterator reverse = tree_set.descendingIterator();
        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (reverse.hasNext()) {
            System.out.print(reverse.next());
        }
        System.out.println("\n");

//Write a Java program to get the first and last elements in a tree set.
        Object first_element = tree_set.first();
        System.out.println("First Element is: "+first_element);
        Object last_element = tree_set.last();
        System.out.println("Last Element is: "+last_element);

//Write a Java program to clone a tree set list to another tree set.
        TreeSet<String> new_t_set = (TreeSet<String>)tree_set.clone();
        System.out.println(new_t_set);

// Write a Java program to get the number of elements in a tree set.
        System.out.println("Size of the tree set: " + tree_set.size());

//Write a Java program to compare two tree sets.
        TreeSet<String> result_set = new TreeSet<String>();
        for (String element : tree_set){
            System.out.println(tree_set1.contains(element) ? "Yes" : "No");
        }

//Write a Java program to find the numbers less than 7 in a tree set.
        TreeSet <Integer>tree_num = new TreeSet<Integer>();
        TreeSet <Integer>tree_num1 = new TreeSet<Integer>();
        tree_num.add(1);
        tree_num.add(2);
        tree_num.add(3);
        tree_num.add(5);
        tree_num.add(6);
        tree_num.add(7);
        tree_num.add(8);
        tree_num.add(9);
        tree_num.add(10);
        tree_num1 = (TreeSet)tree_num.headSet(7);
        System.out.println(tree_num1);

//Write a Java program to get the element in a tree set which is greater than or equal to the given element.
        System.out.println("Greater than or equal to 8 : "+tree_num.ceiling(8));

//Write a Java program to get the element in a tree set which is less than or equal to the given element.
        System.out.println("Less than or equal to 8 : "+tree_num.floor(8));

//Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element.

//Write a Java program to get an element in a tree set which is strictly less than the given element.
        System.out.println("Strictly less than 4 : "+tree_num.lower(4));

//Write a Java program to retrieve and remove the first element of a tree set.
        tree_num.pollFirst();
        System.out.println("Tree set after removing first element: "+tree_num);

//Write a Java program to retrieve and remove the last element of a tree set.
        tree_num.pollLast();
        System.out.println("Tree set after removing last element: "+tree_num);

//Write a Java program to remove a given element from a tree set.
    }
}