package exercises;

public class codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer num1 = 10;
		Integer num2 = 5;
		
		
		System.out.println("Sum: "+sum(num1, num2) );
		System.out.println("Substraction: "+sub(num1, num2) );
		System.out.println("Substraction: "+div(num1, num2) );
		System.out.println("Substraction: "+mult(num1, num2) );

	}
	
	public static int sum(Integer num1, Integer num2) {	
		Integer res = num1 + num2;
		return res;
	}
	
	
	public static int sub(Integer num1, Integer num2) {
		Integer res = num1 - num2;
		return res;
	}
	
	public static int div(Integer num1, Integer num2) {
		Integer res = num1 / num2;
		return res;
	}
	
	public static int mult(Integer num1, Integer num2) {
		Integer res = num1 * num2;
		return res;
	}
	

}
