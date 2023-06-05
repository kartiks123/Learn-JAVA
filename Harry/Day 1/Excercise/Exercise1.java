import java.util.Scanner;

public class Exercise1
{
    public static void main(String[] args)
    {
        int fmarks, percentage;
        Scanner sr=new Scanner(System.in);

        System.out.println("Enter your marks in Mathematics : ");
        int marks1=sr.nextInt();

        System.out.println("Enter your marks in English : ");
        int marks2=sr.nextInt();

        System.out.println("Enter your marks in History : ");
        int marks3=sr.nextInt();

        System.out.println("Enter your marks in Physics : ");
        int marks4=sr.nextInt();

        System.out.println("Enter your marks in Science : ");
        int marks5=sr.nextInt();

        fmarks=marks1+marks2+marks3+marks4+marks5;

        System.out.println("Final Total Marks : "+fmarks);

        percentage=fmarks/5;
        System.out.println("Your Percentage Score is : "+percentage+" %");
    }
}
