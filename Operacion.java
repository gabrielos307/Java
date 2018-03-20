import java.util.Scanner;
public class Operacion{
	protected int valor1, valor2, resultado;
	protected Scanner sc = new Scanner(System.in);

	public void pedirDato1(){
		System.out.println("Ingresa el primer valor: ");
		valor1 = sc.nextInt();
	}
	public void pedirDato2(){
		System.out.println("Ingresa el segundo valor: ");
		valor2 = sc.nextInt();
	}
	public void mostrarResultado(){
	System.out.println("Resultado= "+resultado);
	}
}
