public class pattern4 {
    public static void main(String[] args) {
        int n=10;
        int num=1;
        for(int i=1;i<=n;i++)
        {
            int check=num;
            for(int j=1;j<=i;j++)
            {
                System.out.print(num +" ");
                if(num==1)
                {
                    num--;
                }
                else if (num==0) {
                    num++;
                }
            }
            if(check==num)
            {
                if(num==1)
                {
                    num--;
                }
                else if (num==0) {
                    num++;
                }
            }
            System.out.println();
        }
    }
}
