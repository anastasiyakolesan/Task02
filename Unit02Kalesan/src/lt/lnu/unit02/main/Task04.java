package lt.lnu.unit02.main;
import java.util.Scanner;
public abstract class Task04 {

	public static void main(String[] args) {
		Scanner vv = new Scanner(System.in);
		int var;
		int mar;
		
		System.out.print("Введите число: ");
		var = vv.nextInt();
		System.out.print("Введите число: ");
		mar = vv.nextInt();
		System.out.print("Ваше число: "+ (var+mar));
		
}
}
