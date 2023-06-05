class A
{
    int a; String k;

    A()  // Here, nothing is written for this constructor except the same typing as that of class-name (w.r.t. naming convention only)
    {
        a=10;
        k="Kartik";
    }

    /* 
    When the above section is commented out, this will print default values for both integer and String value, i.e. :
    
    a=0 (for int)
    k=null (for string)

    */

    void display()
    {
        System.out.println(a+" and "+k);
    }

}

class B
{
    public static void main(String[] args) {
        A result = new A();
        result.display();
    }
}