package HolaMundo;

public class Principal {
	public static void main(String[] args) {
		//*Operaciones con numeros siempre usamos librerias
		//*Integer es un wrapper: wrapper es como una cascara al rededor del tipo de dato y le agrega más cosas
		//*Los tipos de datos primitivas se puede hacer null
		Integer num1 = 1;
		Integer num2 = 2;
		String word = null;
		boolean flag = true;
		float floatnumber = 14.4f; //*Con la f indicamos que será flotante
		long longIntNumber = 12221; //*Big integer
		String iD = num2.toString(); //*Num to a string
		Integer IDDB = Integer.valueOf(iD); //*String to a number
		
		//*You can add an integer with the primitive int
		
		boolean result = calc(word);
		
		if(result) {
			System.out.println("That's true");
		}else System.out.println("That's false");
		
		
		num2.toString(); //*Convertimos el valor a srting
		System.out.println("Number using ++ is "+ (num1 + num2));
		
		
	}
	
	
	public static boolean calc(String saludo) {
		if(saludo != null) {
			return true;
		}
		return false;
	}
}
