import java.util.Scanner;
public class assignment{
	public static void main(String[] args) {
		System.out.print("Enter five numbers");
		Scanner keyboard = new Scanner(System.in);
		double a= 0.0, b= 0.0, c=0.0, d=0.0, e=0.0, f=0.0, g=0.0;
		a=keyboard.nextDouble();
		b=keyboard.nextDouble();
		c=keyboard.nextDouble();
		d=keyboard.nextDouble();
		e=keyboard.nextDouble();
		f=a+b+c+d+e;
		g=f/5;
		System.out.print("The sum of these five nuerbers is "+f);
		System.out.print("The average of these five numbers is "+ g);
	}

}
