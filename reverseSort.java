import java.util.ArrayList;
import java.util.Collections;

public class reverseSort {
       public static void main(String[] args)
    {
        // Declaring arraylist without any initial size
        ArrayList<Integer> arrayli = new ArrayList<Integer>();
 
        // Appending elements at the end of the list
        arrayli.add(3);
        arrayli.add(0);
        arrayli.add(7);
        arrayli.add(6);
        arrayli.add(5);
        System.out.print("Elements before reversing: ");
        printElements(arrayli);
 
        // Collections.reverse method takes a list as a 
        // parameter and reverses the passed parameter
      //(no new array list is required)
        Collections.reverse(arrayli);
        System.out.print("\nElements after reversing: ");
        printElements(arrayli);
    }
 
    // Iterate through all the elements and print
    public static void printElements(ArrayList<Integer> alist)
    {
        for (int i = 0; i < alist.size(); i++) {
            System.out.print(alist.get(i) + " ");
        }
    }
}
