public class Variable_Types 
{
	public static void main(String[] args) 
    {
		// THESE ARE ALL THE PRIMITIVE DATA TYPES

		int a = 10; // 32 bit value can be stored
		short b = 5; // 16 bit value can be stored
		long c = 12312; // 64 bit value can be stored; usually used for very big numbers
		
		double d = 3.4534; // used for decimal numbers; used for printing very precise decimal
					       // numbers, upto 15 digits
		float f = 3.45f; // used for precise estimation of upto 7 digits only; 'f' needs to be put 
					     // at the back of every number if we are using float
		// Out of these 2 above, double is the default decimal data type used in Java.
	
		char cc = 'K'; // It can be written in single quotation only 
		boolean bb = true; // The default value for boolean fields is false
		byte byte1 = 127; // can hold 6 bit of data, either positive till 127 or negative till -128

		// No default value is assigned to the local variables, REASON :-
		// Local Variables do not have default values. Once we create a local variable we must initialize it before using it. Since the local variables 
		// in Java are stored in stack in JVM there is a chance of getting the previous value as default value. Therefore, In Java default values for local 
		// variables are not allowed.

        System.out.println("This is an integer :"+" "+a); 
        System.out.println("This is a short :"+" "+b); 
        System.out.println("This is a long :"+" "+c); 
        System.out.println("This is a double :"+" "+d); 
        System.out.println("This is a float :"+" "+f); 
        System.out.println("This is a character :"+" "+cc); 
        System.out.println("This is a boolean :"+" "+bb); 
        System.out.println("This is a byte :"+" "+byte1); 
	}
}