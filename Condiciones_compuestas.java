
public class Condiciones_compuestas {
	public static void main(String args[]) {
		
		int edad = 65;
		
		if(edad != 65) {
			System.out.println("La persona tiene: " + edad + " años");
		}else if(edad >= 3 && edad <= 14) {
			System.out.println("La persona tiene entre 3 y 14 años");
		}else if(edad >= 15 && edad <= 59) {
			System.out.println("La persona tiene entre 15 y 59 años");
		}else{
			System.out.println("La persona es de la tercera edad.");
		}
		
	}
}
