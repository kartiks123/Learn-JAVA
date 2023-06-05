import java.util.*;

class Scan
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in); // This command will request the user to input their data, after the message written after this command, is executed.

        System.out.println("Enter your name bitch: "); // This line is added to display the message to the user to enter their name, etc.

        String name=s.nextLine(); // This will print the line in "String" format, hence we used '.nextLine();' here.
        // in case, it is a number, we will use '.nextInt();'
        
        System.out.println("Your name is fucking "+name);

        // in.close(); command can also be used at the end of the Scanner class, so as to mark the things written in the Commands as closed function of the 
        // Scanner class.
    }
}