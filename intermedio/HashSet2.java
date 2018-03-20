import java.util.HashSet;
import java.util.Iterator;
public class HashSet2{
	public static void main(String[] args){
		HashSet<Integer> hashSet = new HashSet<Integer>();
		Integer numero = new Integer("2");
		
		hashSet.add(numero);
		hashSet.add(new Integer(6));

		System.out.printl(hashSet);

		for(int i = 0; i<5; i++){
			hashSet.add(new Integer(i));
		}
		
		for(Integer num: hashSet){
			System.out.println(num);
		}
	
		System.out.println(hashSet);
		HashSet<Person> hashSet2 = new HashSet<Person>();
		
		Person persona1 = new Person(0, "Paco el chato", 20);
                Person persona2 = new Person(0, "Berewell", 20);
                Person persona3 = new Person(1, "Pedro de la Mar", 20);
                Person persona4 = new Person(2, "Irish", 20);
                Person persona5 = new Person(2, "Torvip", 20);
		
		hashSet.add(persona1);
		hashSet.add(persona2);
		hashSet.add(persona3);
		hashSet.add(persona4);
		hashSet.add(persona5);
	
		Iterator iterator = hashSet2.iterator();
	
		while(iterator.hasNext()){
			Person p = (Person)iterator.next();
			System.out.println(p.nombre);
		}
	}
}





