/*
class C
{
    C()
    {
        this();
        System.out.println(a);
    }

    C(int a)
    {
        System.out.println("Hey");
    }

    public static void main(String[] args) 
    {
        C it=new C(10);
    }
}

*/

class C
{
    C()
    {
        this(10);
    }

    C(int a)
    {
        System.out.println("Hey");
    }

    public static void main(String[] args) 
    {
        C ner=new C();        
    }
}