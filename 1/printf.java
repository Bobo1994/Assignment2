/**
 * 
 * @author Yibing Zhang
 *This is for class exercise 3.1
 */
public class printf {
	public static void main(String[] args) {
		double number2,number3,average;
		char a;
		a='A';
		int number1;
		number1=12;
		number2=24.0;
		number3=30.0;
		average=(number1+number2+number3)/3;//find the average
		String item="basketballs";
		/*The following logic is using if else jva statement
		 * If the statement is true, the program will printout with format(System.out.printf)
		 * Otherwise, the program will printout without using format.(System.out.println)
		 */
		if (true){System.out.printf("Three people have different numbers of %10s",item);}
		else{System.out.println("Three people have different numbers of basketballs.");}
		if (true){System.out.printf(". One of them is %c",a);}
		else{System.out.println("One of them is A.");}
		if (true){System.out.printf(". He has %2d basketballs",number1);}
		else{System.out.println("He has 12 basketballs");}
		if (true){System.out.printf(". Also, the average number of basketballs is %2.3f",average);}
		else{System.out.println("Also, the average number of basketbalss is 22");}
		if (true){System.out.printf(", which means each of them has %e ones.",average);}
		else{System.out.println(", which means each of them should have 22 ones");}
	}

}