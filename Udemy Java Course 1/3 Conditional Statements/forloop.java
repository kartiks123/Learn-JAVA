class forloop
{
    public static void main(String[] args) 
    {
        int i;
        for(i=0;i<10;i++) // Loop will run until it is proven wrong.
        {
            System.out.println("The value of the item getting printed is : " + i);
        }

        System.out.print("\n");

        for(i=0;i<10;i++)
        {
            System.out.printf("The value of the item getting printed is : %d\n", i); 
            
            // '%d' specifier is used for integer values.
            // Here as you can see, we need 2 arguments if we are using the printf statement to print our values accordingly.
            // Also, I have used '\n' directly written after %d, for spacing.
        }
    }
}