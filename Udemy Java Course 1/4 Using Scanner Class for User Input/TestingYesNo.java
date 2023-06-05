import java.util.Scanner;

class TestingYesNo
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        
        System.out.println("I am getting printed, yes ?");
        String str=s.nextLine();
        System.out.println("Your answer -> "+str);
        if(str.equals("Yes"))
        {
            System.out.println("I knew it !");
        }
        else
        {
            System.out.println("Ohh man...");
        }
    }
}