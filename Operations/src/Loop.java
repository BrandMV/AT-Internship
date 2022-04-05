import java.util.Calendar;
import java.util.Iterator;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(System.currentTimeMillis());
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		for (int i = 0; i <= 7; i++) {
			if(day == i) {
				System.out.println("Today is " + i + "º day of the week");
				break;
			}
			System.out.println("Day " + i);
			
		}

	}

}
