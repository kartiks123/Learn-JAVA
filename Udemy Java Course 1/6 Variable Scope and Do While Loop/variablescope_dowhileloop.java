import java.util.Scanner;

class variablescope_dowhileloop
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int num;

        do
        {
            System.out.println("Enter the number : ");
            num = s.nextInt();
        }
        while(num != 11);

        System.out.println("No boiii, you can't go print 10 !");
    }
}