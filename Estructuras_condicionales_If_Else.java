
public class Estructuras_condicionales_If_Else {
	public static void main(String args[]) {
		
		int matematicas = 5;
		int biologia = 5;
		int quimica = 5;
		int promedio = 0;
		
		promedio = (matematicas + biologia + quimica) / 3;
		
		if(promedio >= 6) {
			System.out.println("El alumno aprob�: " + promedio);
		}else{
			System.out.println("El alumno reprob�: " + promedio);
		}
		
	}
}
