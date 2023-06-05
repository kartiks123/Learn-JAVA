import java.util.Scanner;

public class UserInput
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the number that you want to be displayed : ");
        int integer=s.nextInt();
        System.out.println("Your displayed numebr is : "+integer);

        boolean bool = s.hasNextInt();
        System.out.println(bool);

        System.out.println("Type the text that you want to type : ");
        String str=s.nextLine();
        System.out.println("Your printed text is : "+str);
    }
}
