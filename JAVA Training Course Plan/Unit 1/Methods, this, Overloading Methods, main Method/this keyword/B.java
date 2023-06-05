class B
{
    B() // Default Constructor
    {
        System.out.println("Hey");
    }

    B(int n) // Parameterized Constructor
    {
        this(); // this is written to call Default Constructor
        System.out.println(n);
    }

    public static void main(String[] args) 
    {
        B b=new B(100);
    }
}