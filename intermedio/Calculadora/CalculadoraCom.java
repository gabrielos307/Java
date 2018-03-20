import java.util.Scanner;

public class CalculadoraCom{
	public static void main(String[] args){
		Scanner leer = new Scanner(System.in);
		int real1 = 0;
		int real2 = 0;
		int ima1 = 0;
		int ima2 = 0;
		System.out.println("Calculadora compleja\n");
		System.out.println("Dame el primer valor real: ");
		real1 = leer.nextInt;
                System.out.println("Dame el segundo valor real: ");
                real2 = leer.nextInt;
                System.out.println("Dame el primer valor imaginario: ");
                ima1 = leer.nextInt;
                System.out.println("Dame el segundo valor imaginario: ");
                ima2 = leer.nextInt;
		System.out.prinln("Opciones: ");
		System.out.println("'+' Pulsa para sumar);
                System.out.println("'-' Pulsa para restar);
                System.out.println("'*' Pulsa para Multiplicar);
                System.out.println("'/' Pulsa para Dividir);
		System.out.println("'s' Pulsa para salir);
		char opcion = leer.next().charAt(0);
		while(opcion != s){
			switch(opcion){
				 case '+':
					int resultador = 0;
					int resultadoi = 0;
					System.out.println("("+real1+(ima1)+"i)");
					System.out.println("+("+real2+(ima2)+"i)");
					System.out.println("La suma es : \n");
					resultador = CalculadoraCom.sumar(real1, real2);
					resultadoi = CalculadoraCom.sumai(ima1, ima2);
					System.out.println("("+resultador+(resultadoi)+"i)");
					break;
                       		 case '-':
					int resultador = 0;
                                        int resultadoi = 0;
                                        System.out.println("("+real1+(ima1)+"i)");
                                        System.out.println("+("+real2+(ima2)+"i)");$
                                        System.out.println("La resta es : \n");
                                        resultador = CalculadoraCom.restar(real1,real2); $
                                        resultadoi = CalculadoraCom.restai(ima1, ima2);$
                                        System.out.println("("+resultador+(result$
                                	break;
                       		 case '*':
					int resultador = 0;
                                        int resultadoi = 0;
                                        System.out.println("("+real1+(ima1)+"i)");
                                        System.out.println("+("+real2+(ima2)+"i)");$
                                        System.out.println("La multiplicacion es : \n");
                                        resultador = CalculadoraCom.multr(real1,real2, ima1, ima2);
                                        resultadoi = CalculadoraCom.multi(real1, real2, ima1, ima2);
                                        System.out.println("("+resultador+(result$

                               		 break;
                        	 case '/':
					int resultador = 0;
                                        int resultadoi = 0;
                                        System.out.println("("+real1+(ima1)+"i)");
                                        System.out.println("+("+real2+(ima2)+"i)"$
                                        System.out.println("La division es: \n"); $
                                        resultador = CalculadoraCom.divr(real1,real2, ima1, ima2);
                                        resultadoi = CalculadoraCom.divi(real1, real2, ima1, ima2);
                                        System.out.println("("+resultador+(result$

                               		 break;
			       	 case '?':
					System.out.println("Opción no valida\n");
					break;
			}
		}
	}

	public int sumar(int real1,int real2){
		int r;
		r = real1 + real2;
		return r;
	}
	public int sumai(int ima1,int ima2){
                int im;
                r = im1 + im2;
                return r;
        }
	public int restar(int real1,int real2){
                int r;
                r = real1 - real2;
                return r;
        }
        public int sumai(int ima1,int ima2){
                int im;
                r = im1 - im2;
                return r;
        }
	public int multr(int real1, int real2, int ima1, ima2){
		int re1;
		int re2;
		re1 = real1 * real2;
		re2 = ima1 * ima2;
		return re1 - re2;
	}
	public int multi(int real1, int real2, int ima1, int ima2){
		int res1;
		int res2;
		res1 = real1 * ima2;
		res2 = real2 * ima1;
		return res1 + res2;
	}
	public int divr(int real1, int real2, int ima1, int ima2){
		int re;
		int re1;
		re = real1 * real2 + ima1 * ima2;
		re1 = real2 * real2 + ima2 * ima2;
		return re / re1;
	}
	public int divi(int real1, int real2, int ima1, int ima2){
                int re;
                int re1;
                re = ima1 * real2 - real1 * ima2;
                re1 = real2 * real2 + ima2 * ima2;
                return re / re1;
        }




		
