import java.util.Scanner;

class usingScanner
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the line that you want to print : ");
        String text = s.nextLine();
        System.out.println("Your line is : " + text);

        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = n.nextInt();
        System.out.println("Your number entered is : " + num);

        Scanner d = new Scanner(System.in);
        System.out.println("Enter the decimal number : ");
        double dig = d.nextDouble();
        System.out.println("Your decimal value is : " + dig);

        Scanner testing_again=new Scanner(System.in);
        System.out.println("Enter the message you want to print here : ");
        String s1=testing_again.nextLine();
        System.out.println("Here is your message : " + s1);
    }
}