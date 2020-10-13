import java.util.Scanner;

public class Metodo_Equals_Login {
	public static void main(String args[]) {
		
		String usuario = "";
		String password = "";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa tu nombre de usuario: ");
		usuario = entrada.nextLine();
		
		System.out.println("Ingresa tu contraseña: ");
		password = entrada.nextLine();
		
		if(usuario.equals("francisco") && password.equals("1234")){
			System.out.println("Inicio de sesión correcto.");
		}else{
			System.out.println("Nombre de usuario o contraseña incorrectos");
		}
		
	}
}
