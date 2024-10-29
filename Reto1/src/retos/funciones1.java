package retos;

public class funciones1 {
	
	
	public static int suma(int num1, int num2)


	{
		return num1+num2;
	}
	
	public static int resta(int num1, int num2) 
	
	{
		return num1-num2;
	}
	
	public static boolean esPar(int num) 
	
	{ 
		if(num%2==0) {
			return true;
		}
		return false;
	}
	
	public static boolean esImpar(int num)
	
	{
		if(num%2!=0) {
			return true;
		}
		return false;
	}

}
