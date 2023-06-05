class Meth
{
    void walk(int speed)
    {
        System.out.println("Your walking speed is "+speed);
    }
}

public class Hey
{
    public static void main(String[] args)
    {
        Meth m = new Meth();

        m.walk(7);
    }
}

// This code is written to run my code when calling the int function inside the void walk function and I have input the value later on...