package ua.intita.qa.homework14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class ArrayListExercises {
        public static void main(String[] args) {

            ArrayList<String> color = new ArrayList<>();
            color.add("white");
            color.add("purple");
            color.add("black");
            color.add("grey");
            color.add("pink");
            System.out.println(color);

            for (String element : color) {
                System.out.println(element);
            }

            color.add(0, "purple");
            System.out.println("After inserting at the first position: " + color);

            System.out.println("Retrieved element: " + color.get(2));

            color.set(1, "grey");
            System.out.println("After updating: " + color);

            color.remove(2);
            System.out.println("After removing: " + color);

            System.out.println(color.get(5));

            System.out.println("Before sorting: " + color);
            Collections.sort(color);
            System.out.println("After sorting: " + color);

            List<String> newColor = new ArrayList<>(color);
            System.out.println("After copying: " + newColor);

            Collections.shuffle(color);
            System.out.println("After shuffling: " + color);

            Collections.reverse(color);
            System.out.println("After reversing: " + color);

            System.out.println("List: " + color);
            List<String> subColor = color.subList(1, 3);
            System.out.println("Sublist: " + subColor);

            System.out.println("List 1: " + color);
            System.out.println("List 2: " + newColor);
            System.out.println("Are array lists 1 and 2 equal? " + color.equals(newColor));
            List<String> newColor1 = new ArrayList<>(newColor);
            System.out.println("List 3: " + newColor1);
            System.out.println("Are array lists 2 and 3 equal? " + newColor.equals(newColor1));

            System.out.println("Before swapping " + color);
            Collections.swap(color, 0, 3);
            System.out.println("After swapping: " + color);

            color.addAll(newColor);
            System.out.println("After joining: " + color);

            ArrayList<String> colorClone = (ArrayList<String>) color.clone();
            System.out.println("Cloned array list: " + colorClone);

            //empty an array list.
            colorClone.clear();
            System.out.println(colorClone);

            System.out.println(colorClone.isEmpty());
            System.out.println(color.isEmpty());

            ArrayList<String> color1 = new ArrayList<>(4);
            System.out.println(color1.size());
            color1.add("white");
            color1.add("blue");
            color1.add("green");
            color1.trimToSize();
            System.out.println(color1.size());

            color1.ensureCapacity(100);
            color1.add("green");
            color1.add("blue");
            System.out.println(color1);

            System.out.println("Before replacing: " + color);
            color.set(1, "red");
            System.out.println("After replacing: " + color);

            int indexEnd = color.size();
            for (int index = 0; index < indexEnd; index++) {
                System.out.println(color.get(index));
            }
        }
    }