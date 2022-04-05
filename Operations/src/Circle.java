
public class Circle extends Figure {
	public static final String ANSI_GREEN = "\u001B[32m";
	private Double radius;
	private Double area;
	private Double diameter;
	
	public Circle() {
		this.radius = 1.0;
	}
	public Circle(Double radius){
		this.radius = radius;
	}
	
	
	/*
	 *  
	 * @param {Double} value Value to perform the operation
	 * @param {boolean} isCircle indicates if is a circle or not
	 * @return 
	 * */
	public void getComplexArea(Double value, boolean isCircle) {
		
		area = (isCircle) ? Math.PI * Math.pow(value, 2) : value*value;
		
		System.err.println("Area = " + area);
	}
	
	
	/*
	 *  Overriding methods
	 * @param {Double} value Value to perform the operation
	 * @param {String} isCircle indicates if is a circle or not
	 * @return
	 * */
	public void getComplexArea(Double value, String isCircle) {
		
		if(isCircle.equals("It's a circle"))
			area = Math.PI * Math.pow(value, 2);
		else if(isCircle.equals("It's not a circle")) 
			area = value*value;
		else {
			System.err.println("Invalid input");
			return;
		}
		
		System.out.println("Area = " + area);
	}
	
	
	
	public void getArea() {
		area = Math.PI * Math.pow(radius, 2);
		System.err.println("Radius: " + area);
	}

}
