import java.util.Random;
	
public class Aleatorio{
	public static void main(String[] args){
	//Creando un objeto de la clase random
	Random numeros = new Random();
	//Declaracion de un arreglo
	int[] arreglo = new int[10];

	for(int = 0; i < arreglo.length; i++){
		arreglo[i] = numeros.nextInt(100);
	}
	
	System.out.println("Indice	valor");
	for(int i = 0; i < arreglo.length; i++){
		System.out.printf("%5d%8d \n", i, arreglo[i]);
	}
}
	
