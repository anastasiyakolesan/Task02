package lt.lnu.unit02.main;

public class Task05 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		a=1.0; 
		b=2.0; 
		c=4.0;
		
		double temp;
		temp= (b+(Math.sqrt(b*b) + (4*a*c))) / 2*a - ((a*a*a)*c) + b;
double result;
		result = temp;
		System.out.println("result=" + result);
	}

}
