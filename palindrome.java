import java.util.Scanner;

public class palindrome {
    
    public static boolean isPalindrome(String str)
    {   
        for(int i=0;i<str.length()/2;i++)
        {
            int n=str.length();
            if(str.charAt(i) != str.charAt(n-i-1))
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sc=input.nextLine();
        
        System.out.println(isPalindrome(sc));


    }
}
