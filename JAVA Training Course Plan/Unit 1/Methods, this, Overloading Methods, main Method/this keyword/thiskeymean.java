class thiskeymean
{
    int a; // This is an instance of a class or object
    thiskeymean(int a) // constructor here, not a method
                       // This is a local variable
    {
        this.a=a; // Here, JVM gets confused as which is which ?
    }

    void disp()
    {
        System.out.println(a);
    }

    public static void main(String[] args) 
    {
        thiskeymean t = new thiskeymean(100); // since this obj is given the value 100, i.e., a=100
        t.disp();
    }
}