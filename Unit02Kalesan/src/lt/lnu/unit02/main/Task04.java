package lt.lnu.unit02.main;
import java.util.Scanner;
public abstract class Task04 {

	public static void main(String[] args) {
		Scanner vv = new Scanner(System.in);
		int var;
		int mar;
		
		System.out.print("������� �����: ");
		var = vv.nextInt();
		System.out.print("������� �����: ");
		mar = vv.nextInt();
		System.out.print("���� �����: "+ (var+mar));
		
}
}
