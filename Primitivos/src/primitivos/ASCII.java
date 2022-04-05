package primitivos;

public class ASCII {

	public static void main(String[] args) {
		String cadena = "hello world";
		
		for (int i = 0; i < cadena.length(); i++) {
			char l = cadena.charAt(i);
			System.out.println(l + " en ASCII es: " + Character.getNumericValue(l) );
		}
		
		char space = 'h';
		int ascii = (int) space;
		System.out.println("Space in ascii numeric value "+ ascii);

	}

}
