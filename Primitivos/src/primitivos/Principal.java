package primitivos;

public class Principal {
	public static void main(String[] args) {
		//byte vByte1 = 0, vByte2 = 0;
		
		//*A todo flotante se le agrega f
//		float aa = 100f;
//		float ab = 100;
//		float ac = (float)100.0;
		
//		System.out.println(aa);
//		System.out.println(ab);
//		System.out.println(ac);
		
		//*Caracteres
//		char letter1 = 't';
//		char letter2 = 97;
//		
//		System.out.println(Character.getNumericValue(letter1));
//		System.out.println(Character.getNumericValue(letter2));
		
		//*Strings: al variar valor de la cadena hace copia de las cadenas
		String string = "hola perros";
		System.out.println(string);
		for (int i = 0; i < string.length(); i++) {
			System.out.println(string.charAt(i));
		}
		
		/*
		try {
			while(true) {
				vByte2 = vByte1;
				vByte1++;
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println(vByte2);
		} //*Finally se ejcuta ocurra o no el error
		*/
		
	}
	


}
