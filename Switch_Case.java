
public class Switch_Case {
	public static void main(String args[]) {
		
		int parametro = 5;
		int num_uno = 6;
		int num_dos = 3;
		int resultado = 0;
		
		switch(parametro) {
			case 1: resultado = num_uno + num_dos;
					System.out.println("El resultado de la suma es: " + resultado);
				break;
				
			case 2: resultado = num_uno - num_dos;
					System.out.println("El resultado de la resta es: " + resultado);
				break;
				
			case 3: resultado = num_uno * num_dos;
					System.out.println("El resultado de la multiplicación es: " + resultado);
				break;
				
			case 4: resultado = num_uno / num_dos;
					System.out.println("El resultado de la división es: " + resultado);
				break;
				
			default:
				break;
		}
		
	}
}
