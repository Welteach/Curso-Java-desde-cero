import java.util.Scanner;

public class Libreria_Scanner {
	public static void main(String args[]) {
		
		String nombre = "";
		int numero_uno = 0, numero_dos = 0, numero_resultado = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("¿Cual es tu nombre?");
		nombre = in.nextLine();
		
		System.out.println("Dame el primer valor para tu suma");
		numero_uno = in.nextInt();
		
		System.out.println("Dame el segundo valor para tu suma");
		numero_dos = in.nextInt();
		
		numero_resultado = numero_uno + numero_dos;
		
		System.out.println("Hola " + nombre + " el resultado de tu suma es: " + numero_resultado);
		
	}
}
