class print
{
    static int a; // This is a static field created. No values are passed yet.
}

class StaticField
{
    public static void main(String args[])
    {
        print.a=10; // Value of the static field is initialized here.
        System.out.println(print.a); // Here the value is printed by printing the object.
    }
}

// REMEMBER: There can only be 1 public class at a time, in a JAVA file.