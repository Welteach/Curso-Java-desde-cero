
public class Condiciones_compuestas {
	public static void main(String args[]) {
		
		int edad = 65;
		
		if(edad != 65) {
			System.out.println("La persona tiene: " + edad + " a�os");
		}else if(edad >= 3 && edad <= 14) {
			System.out.println("La persona tiene entre 3 y 14 a�os");
		}else if(edad >= 15 && edad <= 59) {
			System.out.println("La persona tiene entre 15 y 59 a�os");
		}else{
			System.out.println("La persona es de la tercera edad.");
		}
		
	}
}
