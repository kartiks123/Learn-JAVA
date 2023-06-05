class booleancheck
{
    public static void main(String[] args)
    {
        boolean mybool1 = 30 < 23;
        int mynum1 = 20;
        boolean mybool2 = mynum1 > 30;

        System.out.println("The final result whether it's true/false, is : "+mybool1);
        System.out.println("Again please check the final result whether it's true/false, is : "+mybool2);

        while(mynum1<75)
        {
            System.out.println("Added final value -> "+mynum1);
            mynum1=mynum1 + 5;
        }
    }
}