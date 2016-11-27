package utils;

public class math {
	public static int factorial(int arg){
		if(arg<=1)
			return 1;
		
		return arg*factorial(arg-1);
	}
	public static int factorialLoop(int arg){
		int b = 1;
		for (int i=2; i<=arg; i++){
			b = b * i;
		}
		return b;
	}
	
}
