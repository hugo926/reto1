package retos;

public class funciones2 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
public static int multiplicar(int numero1,int numero2) {
	
	 return numero1*numero2;
	
}
public static int dividir(int numero1,int numero2) {
	int resultado=0;
	if(numero2>0)
		 resultado= numero1/numero2;
	return resultado;
}
public static boolean esPositivo(int numero) {
	if(numero>0)
		return true;
	else
	return false;
	
}
public static boolean esNegativo(int numero) {
	if(numero<0)
		return true;
	else
		return false;
}
}
