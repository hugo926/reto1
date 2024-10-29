package retos;

import java.util.Scanner;
import retos.funciones1;
import retos.funciones2;

public class Reto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = 0;
		do {
			try {
				System.out.println("Elige la operación:");
				System.out.println("1. Sumar");
				System.out.println("2. Restar");
				System.out.println("3. Multiplicar");
				System.out.println("4. Dividir");
				System.out.println("5. Par");
				System.out.println("6. Impar");
				System.out.println("7. Positivo");
				System.out.println("8. Negativo");
				System.out.println("0. Salir");
				String s = sc.nextLine();
				n = Integer.parseInt(s);
				if (n == 0)
					break;
			} catch (Exception ex) {
				System.out.println("Introduce un numero, no una letra");
			}

			int num1 = 0;
			int num2 = 0;

			if (n <= 4)
				try {
					System.out.println("Introduce un nº");
					String s1 = sc.nextLine();

					num1 = Integer.parseInt(s1);
					System.out.println("Introduce un nº");
					String s2 = sc.nextLine();

					num2 = Integer.parseInt(s2);
					
				} catch (Exception ex) {
					System.out.println("Introduce un nº correcto");
				}
			int num = 0;
			if (n >= 5)
				try {
					System.out.println("Introduce un nº");
					String s = sc.nextLine();
					num = Integer.parseInt(s);
					
				} catch (Exception ex) {
					System.out.println("Introduce un nº correcto");
				}

			int resultado = 0;
			boolean resultadoPost5 = true;

			switch (n) {
			case 1:
				resultado = funciones1.suma(num1, num2);
				System.out.println(resultado);
				break;

			case 2:
				resultado = funciones1.resta(num1, num2);
				break;

			case 3:
				resultado = funciones2.multiplicar(num1, num2);
				break;

			case 4:
				resultado = funciones2.dividir(num1, num2);
				break;

			case 5:
				resultadoPost5 = funciones1.esPar(num);
				break;

			case 6:
				resultadoPost5 = funciones1.esImpar(num);
				break;

			case 7:
				resultadoPost5 = funciones2.esPositivo(num);
				System.out.println(resultadoPost5);
				break;

			case 8:
				resultadoPost5 = funciones2.esNegativo(num);
				break;

			case 0:

			default:
			}
			
		} while (n != 0);
		
		sc.close();
	}

}
