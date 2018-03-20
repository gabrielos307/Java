
import java.util.Scanner;
public class Prueba{
	public static void main(String[]args){
		
		Persona p1 = new Persona();
		Scanner teclado= new Scanner(System.in);
        	String nombre = teclado.nextLine();
        	p1.setNombre(nombre);
        	System.out.printf("Mi nombre es %s", p1.getNombre());
		p1.caminar();
		Persona p= new Persona("Gabriel",19, "Masculino");
	}
	
}

