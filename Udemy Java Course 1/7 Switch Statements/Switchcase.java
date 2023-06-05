import java.util.Scanner;

class Switchcase
{
    public static void main(String[] args) 
    {
        // We can only enter values like byte, char, int, short and String

        Scanner s=new Scanner(System.in);
        System.out.println("Enter your Text here : ");
        String text=s.nextLine();

        switch(text)

        {
            case "run":
                System.out.println("Text entered is matching the 'run'");
                break;
            case "stop":
                System.out.println("Text entered is 'stop'");
                break;
            default:
                System.out.println("Text entered doesn't matches any of the above lines.");

        // If however, we have decided to put default under any of these cases, we have to put a break for that same case.
        }
    }
}