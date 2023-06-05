package kartik;

class A
{
    protected int a=5;
    protected void msg()
    {
        System.out.println("Keep up the good work : )");
    }
}

class B
{
    public static void main(String[] args) 
    {
        A result = new A();
        System.out.println(result.a);
        result.msg();
    }
}