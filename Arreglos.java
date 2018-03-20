//Inicializacion de un arreglo

public class Arreglos{
	public static void main(String[] args){
		int[] arreglo = new int[10];
		int[] arreglo2;
		arreglo2 = new int[10];
		int[] arreglo3 = {32, 4, 5, 10, 4, 2, 9};
		for(int i = 0; i < arreglo.length; i++){
			arreglo[i] = i * 2;
		} 
		for(int i = 0; i < arreglo.length; i++){
			System.out.printf("%d %d \n", i, arreglo[i]);
		}
		for(int i = 0; i < arreglo3.length; i++){
			System.out.printf("%d \n", arreglo3[i]);
		}
	} 
}
