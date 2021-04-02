package lt.lnu.unit02.main;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner vv = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.print("Введите число: ");
		a = vv.nextInt();
		System.out.print("Введите число: ");
		b = vv.nextInt();
		System.out.print("Введите число: ");
		c = vv.nextInt();
		System.out.print("Ваше число: "+ ((a*a)-((b-c)*(b-c))+ln(b*b+1)));
	}

	private static int ln(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
