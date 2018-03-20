public class Multidim{
	public static void main(String[] args){
		int[][] arreglo1 = {{1,2,3}, {4,5,6}};
		int[][] arreglo2 = {{1,2,5},{3},{4,5,6}};

		System.out.println("Los valores en el arreglo1 por filas son: ");
		imprimirArreglo(arreglo1);

		System.out.println("los valores en el arreglo2 por filas son: ");
		imprimirArreglo(arreglo2);
	}
	public static void imprimirArreglo(int[][] arreglo){
		//itera a través de mi fila de arreglo
		for(int fila = 0; fila < arreglo.length; fila ++){
			for(int columna = 0; columna < arreglo[fila].length; 				columna++)
				System.out.printf("%d", arreglo[fila][columna]);
		System.out.println();
		}
	}
}
