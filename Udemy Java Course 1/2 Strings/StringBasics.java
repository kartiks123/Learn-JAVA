class Stringbasics
{
	public static void main(String[] args) 
	{
		String s="Kartik"; // String here is a class, hence it is written in capital letter of the starting letter.
		System.out.println(s);
		
		String s1="Hello";
		String s2=" ";
		String s3="There !";
		
		String s4=s1+s2+s3;
		
		System.out.println(s1+s2+s3); // This shows the concept of Concatenation. We can also write the above output as -
		System.out.println("Hello"+" "+"There !");
		System.out.println(s4);
		
		// Now we will try to concatenate different types of data types with String
		
		int a=10;
		double d=9.5;
		
		System.out.println("My number to be printed is : " + a + ", " + d);
	}
}