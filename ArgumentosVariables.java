public class ArgumentosVariables{
	public static void main(String[] args){
		double s1 = 10.0;
		double s2 = 10.0;
		double s3 = 10.0;
		double s4 = 10.0;

		System.out.println("El promedio de d1 y d2"+promedio(d1, d2));
		System.out.println("El promedio de d1 y d2 y d3 es"+promedio(d1,d2,d3));
		System.out.println("El promedio de d1, d2 y d3 y d4 es"+promedio(d1, d2, d3, d4));
	}

	public static double promedio(String nombre, int edaddouble... numeros){
		double total = 0.0;
		for (int contador = 0; contador < numeros.length; contador++)
			total += numeros[contador];
		return total/numeros.length;
	}
		
	
}

