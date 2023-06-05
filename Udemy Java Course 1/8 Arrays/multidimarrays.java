class multidimarrays
{
    public static void main(String[] args) 
    {
        // Like we studied one dimentional arrays, where every number within it was an integer...
        // In multi dim array, each element is an array of an array...

        int[][] multidimarray = {{5,10,15},{20,25,30},{68,92,12}};
        System.out.println(multidimarray[1][1]);

        double[][] darr = new double[3][2];
        System.out.println(darr[2][1]); // Here, JAVA will automatically assign 0.0 as the default value of the double[][] array.
        // Also, at max, we can only type [2][1], as we have from 0,1,2,3 arrays (total=4) only and 0,1 items (total=2) only.

        // Also, we can omit the 2nd array, but not the 1st array -
        // double[][] darr = new double[4][];
        // But, we cannot do this -
        // double[][] darr = new double[][2]; as there are no arrays specified

        // Of course, we can add our own items in our arrays

        double[][] dar = new double[3][2];
        dar[2][1]=2.5;

        System.out.println(dar[2][1]);

        for(int array=0; array<multidimarray.length; array++)
        {
			for(int item=0; item<multidimarray[array].length; item++) 
            {
				System.out.print(multidimarray[array][item] + "\t");
			}

			System.out.println();
        }
    }
}