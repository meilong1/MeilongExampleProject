import javax.swing.JOptionPane;

public class Lab0b {
	public static void main ( String[] args )
	{
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String
		String input;
		input= JOptionPane.showInputDialog("Enter an integer :: ");
		int myInt = Integer.parseInt(input);
		input= JOptionPane.showInputDialog("Enter a byte :: ");
		byte myByte = Byte.parseByte(input);
		input= JOptionPane.showInputDialog("Enter a short :: ");
		short myShort = Short.parseShort(input);
		input= JOptionPane.showInputDialog("Enter a long :: ");
		long myLong = Long.parseLong(input);
		input= JOptionPane.showInputDialog("Enter a float :: ");
		float myFloat = Float.parseFloat(input);
		input= JOptionPane.showInputDialog("Enter a double :: ");
		double myDouble = Double.parseDouble(input);
		input= JOptionPane.showInputDialog("Enter a char :: ");
		char myChar = input.charAt(0);
		input= JOptionPane.showInputDialog("Enter a string :: ");
		String myString = (input);
		input= JOptionPane.showInputDialog("Enter a boolean :: ");
		boolean myBool = Boolean.parseBoolean(input);
		
		
		//integer variables
//		byte byteOne = 127;
//		byte myByte = 125;
//		int myInt = 42;
//
//		//decimal variables
//		float myFloat = 32.52f;
//		double myDouble = 2.5d;
//
//		//other integer types
//		short myShort = 21;
//		long myLong = 1000000;
//
//		//other types
//		char myChar = 'a';
//		boolean myBool = true;
//		String myString = "Hello World!";

		//output your information here
		System.out.println("/////////////////////////////////");
		System.out.println("*Jim Bob                08/18/06*");
		System.out.println("*                               *");
		System.out.println("*        integer types          *");
		System.out.println("*                               *");
		System.out.println("*8 bit - myByte = "+myByte+"\t\t*");
		
		
		System.out.println("*16 bit - myShort = " +myShort+"\t\t*");
		System.out.println("*32 bit - myInt = " +myInt+"\t\t*");
		System.out.println("*64 bit - myLong = " +myLong+"\t\t*");
		System.out.println("*32 bit - myFloat = " +myFloat+"\t\t*");
		System.out.println("*64 bit - myDouble = " +myDouble+"\t\t*");
		System.out.println("*16 bit - myChar = " +myChar+"\t\t*");
		System.out.println("*myBool = " +myBool+"\t\t*");
		System.out.println("*myString = " +myString+"\t\t*");
		




	}
}
