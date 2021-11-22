package ua.intita.qa.homework15;

import java.util.PriorityQueue;

public class PriorityQueueExercises {
    public static void main(String[] args) {
//Write a Java program to create a new priority queue, add some colors (string) and print out the elements of the priority queue.
        PriorityQueue<String> queue=new PriorityQueue<String>();
        queue.add("Red");
        queue.add("Green");
        queue.add("Orange");
        queue.add("White");
        queue.add("Black");
        System.out.println("Elements of the Priority Queue: "+queue);

//Write a Java program to iterate through all elements in priority queue.
        for (String element : queue) {
            System.out.println(element);
        }

//Write a Java program to add all the elements of a priority queue to another priority queue.
        PriorityQueue<String> queue1 = new PriorityQueue<String>();
        queue1.addAll(queue);
        System.out.println("New Priority Queue1: "+queue1);

//Write a Java program to insert a given element into a priority queue.
        queue1.offer("Blue");
        System.out.println(queue1);

//Write a Java program to remove all the elements from a priority queue.

//Write a Java program to count the number of elements in a priority queue.

//Write a Java program to compare two priority queues.

//Write a Java program to retrieve the first element of the priority queue.
//Write a Java program to retrieve and remove the first element.
//Write a Java program to convert a priority queue to an array containing all of the elements of the queue.
//Write a Java program to convert a Priority Queue elements to a string representation.
//Write a Java program to change priorityQueue to maximum priorityqueue.
    }

}
