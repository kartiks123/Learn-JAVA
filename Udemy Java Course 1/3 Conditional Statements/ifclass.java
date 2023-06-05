class ifclass
{
    public static void main(String[] args) 
    {
        boolean equals = 5 == 5; // Single '=' means equals to value and double '==' means to test the equality of the numbers specified to both sides of this
                                 // sign.
        boolean notEqual = 3 != 4; // '!=' means not equal to. 

        System.out.println("Is the value written true ?, ANS ->  "+equals);
        System.out.println("It's not equal, I know, right... ?, ANS -> "+notEqual);



        if(5 != 10)
        {
        System.out.println("The value written is True");
        }



        if(10 != 10)                                                  // HERE THE RESULT WILL NOT BE PRINTED AS THE RESULT IS NOT TRUE, AND THERE IS NO
        {                                                             // ELSE STATEMENT TO CAPTURE THE FALSE STATEMENT.
        System.out.println("The value written is True");
        }

        // Now comes, the 'else' statement ->
        else
        {
        System.out.println("The value written is false");
        }
        
        

        int i=5;
        if(i==5)
        {
            System.out.println("Value of i is 5");
        }

        else
        {
            System.out.println("Value of i is not 5");
        }



        int d=20;
        if(d<10)
        {
            System.out.println("Value of d is less than 10");
        }
        else if(d==15)
        {
            System.out.println("Value of d is 15");
        }
        else
        {
            System.out.println("Value of d is 20");
        }
    }
}