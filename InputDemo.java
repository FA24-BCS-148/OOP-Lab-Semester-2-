import java.util.Scanner;

public class InputDemo{

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);

		System.out.println("This is an input demo code.");

		//Integer values
		byte b = 127;
		short s = 32767;
		int i = 2147483647;
		long l = 9223372036854775807l;

		//Decimal values
		float f = 25.1f;
		double d = 35.29;

		//Character values
		char c = 'A';
		String word;

		//Boolean Values
		Boolean bool = true;
	
		// Taking input
		System.out.print("Enter byte value: ");
		b = input.nextByte();

		System.out.print("Enter int value: ");
		i = input.nextInt();

		System.out.print("Enter double value: ");
		d = input.nextDouble();

		System.out.print("Enter boolean value: ");
		bool = input.nextBoolean();


		// Output
		System.out.printf("\nValue of byte: %b \n", b);
		System.out.printf("Value of int: %d \n", i);
		System.out.printf("Value of short: %d \n", s);
		System.out.printf("Value of long: %d \n", l);
		System.out.printf("Value of float: %,.1f \n", f);
		System.out.printf("Value of double: %,.1f \n", d);
		System.out.printf("Value of char: %c \n", c);
		System.out.printf("Value of boolean: %b \n", bool);
		System.out.printf("Value of string: %s", "This is a string");

	}





}