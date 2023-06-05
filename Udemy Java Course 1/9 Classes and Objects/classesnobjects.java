// In java, we create only 1 java class with "public" access modifier due to the following reasons :-
// 1) It forces all Java code to be organized in a certain way, which in the long run helps improve code readability.
// 2) The Java designers chose a strict approach that enforces their idea of good design practices, and this is part of that theme.


// Classes and Objects. Return Types and Values

class Methods
{
    String animal;
    int age;
    int month;
    
    void run() // Using void, we can only print the output. We cannot do any calculations or return any values through void.
    {   
        System.out.println("My "+animal+" is "+age+" years "+"old");
    }

    void calculatemonthsleft()
    {
        int monthsleft=12-month;
        System.out.println(monthsleft);     // Here it will print the values that we are calculating at a later stage, but when we write something like- 
    }

    int calmon()
    {
        int monthsleft=12-month;
        return monthsleft; // return will give you output that you might use at a later time.
    }
}

public class classesnobjects
{
    public static void main(String[] args) 
    {
        Methods pr = new Methods();

        pr.animal="Dog";
        pr.age=2;
        pr.month = 8;
        pr.run();
    }
}