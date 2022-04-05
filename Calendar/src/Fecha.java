import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Fecha {

	public static void main(String[] args) {
		// Getting today date
		
		Date currDate = new Date();
		
		System.out.println(currDate);
		
		//*Date format 	DD - year day, dd - week day
		SimpleDateFormat sdtf = new SimpleDateFormat("YYYY-MM-dd");
		SimpleDateFormat sdtf2 = new SimpleDateFormat("dd/MM/YYYY");
		SimpleDateFormat sdtf3 = new SimpleDateFormat("HH:mm:s.S");
		SimpleDateFormat sdtf4 = new SimpleDateFormat("YYYY-MM-dd KK:mm:s.S a");
		
		System.out.println(sdtf.format(currDate));
		System.out.println(sdtf2.format(currDate));
		
		System.out.println(sdtf3.format(currDate));
		
		System.out.println(sdtf4.format(currDate));
		
		//*Parsing dates
		String fechaDumm = "2022-04-05";
		try {
			Date dfechaDumm = sdtf.parse(fechaDumm);
			System.out.println(dfechaDumm);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//*Milis UNIX
		System.out.println(System.currentTimeMillis());
		long miliDate = System.currentTimeMillis();
		Date dateMilli = new Date();
		dateMilli.setTime(miliDate);
		System.out.println(dateMilli);
		System.out.println(sdtf4.format(dateMilli));
		
		//*Using Calendar
		Calendar calendar = new GregorianCalendar();
		calendar.set(20200, 03, 0);
		System.out.println(calendar.getTime());
		System.out.println(sdtf4.format(calendar.getTime()));
		
		//*Modifying date in Calendar
		calendar.add(Calendar.DAY_OF_WEEK, 1);
		System.err.println(sdtf4.format(calendar.getTime()));
		
		//*LocalDate
		
		LocalDate localDate = LocalDate.now(); //*We don't use new cause is declared as a static
		System.out.println(localDate);
		
		LocalDate localDate2 = LocalDate.of(2020, 02, 02);
		LocalDate localDate3 = LocalDate.parse("2020-03-03");
		
		System.out.println(localDate2);
		System.out.println(localDate3);
		
		//*Modifiyng dates
		
		
		//*LocalTime

	}

}
