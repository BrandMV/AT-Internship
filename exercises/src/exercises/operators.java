package exercises;

public class operators {
	
	public static void main(String[] args) {
		operators op = new operators();
		op.ex1();
		op.ex2();
		op.ex3();
		
	}
	
	
	public void ex1() {
		Integer a = 10, b = 20, c = 30;
		Boolean res = (a + b) > c;
		System.out.println("(a + b) > c " +  res);
		
		res = (a - b) < c;
		System.out.println("(a – b) < c " +  res);
		
		res = (a - b) == c;
		System.out.println("(a – b) = c " +  res);
		
		res = (a * b) != c;
		System.out.println("(a * b) != c " +  res);
		
				
	}
	
	public void ex2() {
		System.out.println("Operaciones aritméticas");
		
		System.err.println("21 % 7 = " +  21 % 7);
		
		System.err.println("9/2+15 % 2 = " +  9/2+15 % 2);
		
		System.err.println("(3+6)/2+1.5 = " +  (3+6)/2+1.5);
		
		Double res = 32/3 - Math.pow(2,2);
		System.err.println("32/3 - Math.pow(2,2) = " +  res);
		
		System.err.println("2*3+5*6/2*3 = " +  2*3+5*6/2*3);
		
		System.err.println("Math.pow ( (25-7*3) ,3) / 4 * 5 = " +  Math.pow ( (25-7*3) ,3) / 4 * 5);
		
		System.err.println("10+38/(14-(10-12/(2*3))) = " +  10+38/(14-(10-12/(2*3))));

		
	}
	
	public void ex3() {
		System.out.println("Operaciones lógicas");
		
		Boolean res = ! (5>6) && 7<=4;
		System.out.println("! (5>6) && 7<=4 es " + res);
		
		res = 7>4 && 5<=5 || 4==5;
		System.out.println("7>4 && 5<=5 || 4=5 es " + res);
		
		
		res = ! (7==7) && (7>=8 || 8==6);
		System.out.println("! (7=7) && (7>=8 || 8=6) es " + res);
		
		res = (5+2)<=5 && 3*2==5 || 7<=2*2 || 2*2 <= (2+2);
		System.out.println("7>4 && 5<=5 || 4=5 es " + res);
		
		res = (! (14/2>8) || 5>5) && (5<=27/3 || 5+3<=3/2);
		System.out.println("(! (14/2>8) || 5>5) && (5<=27/3 || 5+3<=3/2) es " + res);
		
		res = (3+5*2)==12/3 && ((5+3)==18/9 || 10/2<=9) || !(9>=2);
		System.out.println("(3+5*2)==12/3 && ((5+3)==18/9 || 10/2<=9) || !(9>=2) es " + res);
	}
	

}
