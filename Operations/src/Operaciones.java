
public class Operaciones {
	private String name =  "Brandon";
	private Integer age = 20;
	//*Sums two given numbers
	public static Integer sum(Integer num1, Integer num2) {	
		Integer res = num1 + num2;
		return res;
	}
	
	//*Subtracts two given numbers
	public static Integer sub(Integer num1, Integer num2) {
		Integer res = num1 - num2;
		return res;
	}
	
	//*Divides two given numbers
	public static Integer div(Integer num1, Integer num2) {
		Integer res = num1 / num2;
		return res;
	}
	
	//*Multiplies two given numbers
	public static Integer mult(Integer num1, Integer num2) {
		Integer res = num1 * num2;
		return res;
	}
}
