import java.util.Scanner;

public class VectoresDinamicos {
	public static void main(String[] args) {
		
		int longitud = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("�Cuantos n�meros deseas ingresar?");
		longitud = entrada.nextInt();
		
		int numeros[] = new int[longitud];
		
		for(int i=0; i<numeros.length; i++) {
			System.out.print("Porfavor dame el valor # " + (i + 1));
			numeros[i] = entrada.nextInt();
		}
		for(int i=0; i<numeros.length; i++) {
			System.out.print("[" + numeros[i] + "]");
		}
		
	}
}
