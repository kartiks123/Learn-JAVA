class A
{
    public void meth1()
    {
        System.out.println("Hey, there");
    }
}

class ObjectCreation extends A
{
    public static void main(String[] args) {
        B pri=new B(); 
        /*
        Here, 
        B = Class-name
        pri = object-reference
        new = new keyword for referencing an object creation in memory space table
        B() = constructor for class-name created earlier.
        */
        pri.meth1();   
    }
}