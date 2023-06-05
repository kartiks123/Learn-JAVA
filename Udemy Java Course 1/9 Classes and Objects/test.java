class Method
{
    void run(String lesgo)
    {
        lesgo="Kartik";
        System.out.println("My name is "+lesgo);
    }
}

class test
{
    public static void main(String[] args) {
        Method m = new Method();
        m.run();
    }
}