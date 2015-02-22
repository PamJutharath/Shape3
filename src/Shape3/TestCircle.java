package Shape3;

import java.util.Scanner;


public class TestCircle {

	public static void main(String[] args) {
		Circle obj = new Circle( );
		Scanner scan = new Scanner (System.in);
		System.out.print ("Enter a radius : ") ;
		double r = scan.nextDouble() ;
		obj.setRadius (r) ;
		double radius = obj.getRadius();
		double area = obj.computeArea () ;
		double perimeter= obj.getPerimeter();
		System.out.println ("Radius = "+radius+"\nArea = "+area+"\nperimeyer = "+perimeter) ;
	}
}
