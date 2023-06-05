class arrays
{
    public static void main(String[] args) 
    {
        int num=10; // This is a primitive data type; this is just written as an example to compare 'int num' with 'int[] num'.

        int[] numarr=new int[5]; // This is a reference data type. Here we allocate the memory upto 5 bytes for array elements

        System.out.println(numarr[0]); // Here we are initializing those 5 values.
        System.out.println(numarr[1]);
        System.out.println(numarr[2]);
        System.out.println(numarr[3]);
        System.out.println(numarr[4]);

        // Here the result will be printed as 0, 5 times as we have not yet specified the numbers which are stored at these locations.
        // But to be more precise, it's not because of this reason it's written as '0'. It is written as if we don't specify any value, by default it is 
        // going to consider it as '0'.
        // Similarly, we have 'false' as default value of boolean, 'null' as default value of Strings.
        
        numarr[0] = 1;
        numarr[1] = 2;
        numarr[2] = 3;
        numarr[3] = 4;
        numarr[4] = 5;

        System.out.println(numarr[0]);
        System.out.println(numarr[1]);
        System.out.println(numarr[2]);
        System.out.println(numarr[3]);
        System.out.println(numarr[4]);

        // Here the results have been displayed as we have thought, because we have specified the numbers to be printed and they are printed as such.


        // Suppose we want to iterate through the values of Arrays

        int[] numarr2 = new int[6];

        numarr2[0] = 10;
        numarr2[1] = 15;
        numarr2[2] = 20;
        numarr2[3] = 25;
        numarr2[4] = 30;
        numarr2[5] = 35;

        System.out.println(numarr2[0]);
        System.out.println(numarr2[1]);
        System.out.println(numarr2[2]);
        System.out.println(numarr2[3]);
        System.out.println(numarr2[4]);
        System.out.println(numarr2[5]);
        
        for(int i=0; i<numarr2.length; i++)
        {
            System.out.println(numarr2[i]);
        }


        // There is also another, easy way to do arrays :-

        int[] numarr3={50,55,60,65,70};

        System.out.println(numarr3.length);

        for(int i=0;i<numarr3.length;i++)
        {
            System.out.println(numarr3[i]);
        }
    }
}