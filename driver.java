import shapes.rectangle;
import shapes.square;
import utils.math;


public class driver {
	public static void main(String[] arg){
		double a = 15.6;
		
		square mysquare = new square(100);
		System.out.println("The area of the square is" + " " + mysquare.getArea());
		
		rectangle myrectangle = new rectangle(50,80);
		System.out.println("The area of the rectangle is" + " " + myrectangle.getArea());
		
		System.out.println("recursive factorial: " + math.factorial((int) a));
		System.out.println("factorial loop: " + math.factorialLoop((int) a));
	}

}
