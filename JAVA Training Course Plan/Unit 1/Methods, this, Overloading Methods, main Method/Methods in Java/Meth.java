import java.util.Scanner;

class Calculator_Using_ScannerClass
{
    int a,b;

    Scanner s=new Scanner(System.in);

    void input()
    {
        System.out.println("Enter the numbers : ");

        a=s.nextInt();
        b=s.nextInt();
    
        System.out.println("Number 1 : "+a);
        System.out.println("Number 2 : "+b);
    }

    void meth1()
    {
        System.out.println("Hey, I am getting printed.");
    }

    void add()
    {
        System.out.println("Sum = "+(a+b));
    }

    void sub()
    {
        System.out.println("Difference = "+(a-b));
    }

    void mult()
    {
        System.out.println("Multiplication = "+(a*b));
    }

    void div()
    {
        System.out.println("Division = "+(a/b));
    }

    public static void main(String[] args) 
    {
        Meth m=new Meth();
        m.meth1();
        m.input();
        m.add();
        m.sub();
        m.mult();
        m.div();

    }
}