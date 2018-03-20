import java.util.Arrays;

public class ClaseArrays{
	public static void main(String[] args){
		int num[] = {8,10,12,30,3,31};
		//binarysearch
		System.out.println("Metodo binarySearch: "+Arrays.binarySearch(num, 8));
		//copyOf	
		int num2[] = Arrays.copyOf(num, 4);
		System.out.prinln("Metodo copyOf");
		muestraArreglo(num2);
		//copyOfRange
		int num3[] = Arrays.copyOfRange(num, 2, 5);
		System.out.println("Metodo copyOfRange");
		muestraArreglo(num2);
		//equals
		System.out.println("Metodo equals: "+Arrays.equals(num, num2); 
		//Rellenar un arreglo con algun valor
		//fill
		System.out.println("Metodo fill");
		Arrays.fill(num, 5);
		muestraArreglo(num);
		//Sort
		System.out.println("Metodo Sort");
		Arrays.sort(num);{
		System.out.println(Arrays.toString(num));

	}
	public static void muestraArreglo(int num[]){
		for(int i = 0; i < num.length; i++)
			System.out.println(num[i]);
	}
}

