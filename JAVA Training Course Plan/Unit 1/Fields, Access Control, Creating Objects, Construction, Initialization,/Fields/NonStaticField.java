class toprint
{
    int a;
}

class NonStaticField
{
    public static void main(String[] args)
    {
        toprint result=new toprint();
        result.a=10;
        System.out.println(result.a);
    }
}