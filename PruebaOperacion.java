public class PruebaOperacion{
	public static void main(String[] args){
		Suma s = new Suma();
		Resta r = new Resta();

		s.pedirDato1();
		s.pedirDato2();
		s.operar();
		s.mostrarResultado();
		
		r.pedirDato1();
                r.pedirDato2();
                r.operar();
                r.mostrarResultado();
	}
}

