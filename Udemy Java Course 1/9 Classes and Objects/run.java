class Methods
{
    void run(String text)
    {
        System.out.println(text);
    }
}

public class run
{
    public static void main(String[] args)
    {
        Methods a = new Methods();
        a.run("Hey there, I am getting printed !");
    }
}

// This code is used to print the String context which is written at a later stage in the code itself
// Notice, how we didn't wrote the value directly in the parenthesis, like we did in the case of Int.