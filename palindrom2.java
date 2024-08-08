import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class palindrom2 {
     public static boolean isPalindrome(String str)
    {   
       List<String> list =Arrays.asList(str);

        Collections.reverse(list);

       str = list.toArray(new String[0]);

        if(!str.equals(str2))
        {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sc=input.nextLine();
        
        System.out.println(isPalindrome(sc));


    }
}
