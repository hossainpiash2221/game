import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class sort {
  public static void main(String[] args) {
        String[] YO = {"Aritra", "Manisha", "Sritama", "Supratik", "Atriya"};

        System.out.println("Before sorting:");
        System.out.println(Arrays.toString(YO));

        Arrays.sort(YO, Comparator.reverseOrder());

        System.out.println("After sorting:");
        System.out.println(Arrays.toString(YO));
       
    }

}
