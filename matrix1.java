import java.util.Scanner;

public class matrix1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows=input.nextInt();
        int cols=input.nextInt();

        int[][] num = new int[rows][cols];

        for(int i=0;i<rows;i++)
        {

            for(int j=0;j<cols;j++)
            {
                System.out.print(" ");
                num[i][j]=input.nextInt();
            }
            System.out.println();
            
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.println("Enter a number");
        int check = input.nextInt();

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if (check==num[i][j]) {
                    System.out.println("rows="+i);
                    System.out.println("cols="+j);
                }
            }
            System.out.println();
        }
    }
}
