public class LeerFile{
	public static void main(String[] args){
		FileInputStream fis = new FileInputStream("./miarchivo.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String s;
		while((s = br.readLine()) != null)
			System.out.println(s);
		br.close();
	}
}
