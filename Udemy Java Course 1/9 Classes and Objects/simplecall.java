class Methods
{
    String name;
    int age;

    void run()
    {
        System.out.println("My name is"+name+"and my age is"+age+".");
    }
}

public class simplecall
{
    public static void main(String[] args) 
    {
        Methods souvik=new Methods();
        
        souvik.name="Kartik";
        souvik.age=21;
        souvik.run(); // This line I forgot, this is important to call and print the output
    }
}