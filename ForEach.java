//For mejorado
public class ForEach{
  public static void main(String[] args){
	int[] arreglo = {1,10,73,46 ,21 ,5,7 ,8,1};
	int total = 0;
	//int numero = 0;
	//int x;
	for ( int x : arreglo)
		System.out.printf("%d\n", x);

	for(int numero : arreglo){
		total += numero;
	 }
	System.out.printf("Suma de elementos del arreglo: %d", total);
  }
}
