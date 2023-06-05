class testing
{
    public static void main(String[] args) 
    {
        testing() // This being the default constructor
        {
            System.out.println("Hey");
        }

        testing(int a) // This being the parameterized cosntructor
        {
            System.out.println(this.a);
        }    
    }
}