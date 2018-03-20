import java.util.Scanner;
public class Acceso{
	public static void main(String[] args){
		Trabajador t1 = new Trabajador();
		Scanner teclado= new Scanner(System.in);
		t1.setSalario(teclado.nextInt());
		System.out.println("El salario de t1 es: "+t1.getSalario);
	}
}
