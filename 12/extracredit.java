import java.util.Arrays;
import java.util.Scanner;
public class extracredit {
	public static void main(String[] args) {
		System.out.print("Enter five numbers");
		double a= 0.0, b= 0.0, c=0.0, d=0.0, e=0.0,g=0.0,h=0.0, i=0.0, mode = 0;
		int acount =1, bcount =1, ccount =1, dcount =1, ecount =1, A, B, C, D;
		Scanner keyboard = new Scanner(System.in);
		a=keyboard.nextDouble();
		b=keyboard.nextDouble();
		c=keyboard.nextDouble();
		d=keyboard.nextDouble();
		e=keyboard.nextDouble();
		double [] f={a,b,c,d,e};
		Arrays.sort(f);
		g= f[2];
		h= f[0];
		i= f[4];
		if (a == b){
			acount++;
			bcount++;
		}
		if(a == c){
			acount++;
			ccount++;
		}
		if(a == d){
			acount++;
			dcount++;
		}
		if(a == e){
			acount++;
			ecount++;
		}
		if (b == c){
			bcount++;
			ccount++;
		}
		if(b == d){
			bcount++;
			dcount++;
		}
		if(b == e){
			bcount++;
			ecount++;
		}
		if(c == d){
			ccount++;
			dcount++;
		}
		if(c ==e){
			ccount++;
			ecount++;
		}
		if(d ==e){
			dcount++;
			ecount++;
		}
		A = Math.max(acount, bcount);
		B = Math.max(ccount, dcount);
		C = Math.max(A, ecount);
		D = Math.max(B, C);
		if (D == acount){
			mode = a;
		}
		if (D == bcount){
			mode = b;
			}
		if (D == ccount){
			mode =c;}
		if (D == dcount){
			mode = d;
		if (D ==ecount){
			mode = e;}	if(acount==bcount&&bcount==ccount&&ccount==dcount&&dcount==ecount)
			{mode = 0;}
		System.out.println("The max is " +i);
		System.out.println("The min is "+ h);
		System.out.println("The median is "+g);
		System.out.println("The mode is " + mode);
	}
		}
}
