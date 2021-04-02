package lt.lnu.unit02.main;

public class Task07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c;
       a= 1.0;
       b=-3.0;
       c=4.0;
    
 
        if (a>=0) {
            double G = a * a;
            System.out.println("Квадрат a ="  +G);
        }
        else {
        	double L =a*a*a*a;
        	System.out.println("Четвертая степень a ="  +L);
        }
       if (b>=0) {
            double H = b * b;
            System.out.println("Квадрат b  ="+H);
        }
       else {
       	double M =b*b*b*b;
       	System.out.println("Четвертая степень b ="  +M); 
       }
 
         if (c>=0) {
            double J = c * c;
            System.out.println("Квадрат с ="+J);
        }
         else {
            	double D =c*c*c*c;
            	System.out.println("Четвертая степень c ="  +D); 
            }
	}
}
	


