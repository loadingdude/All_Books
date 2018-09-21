import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateValid {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input date:");
		int a = in.nextInt();
		System.out.println("Input month:");
		int b = in.nextInt();
		System.out.println("Input year in \'yyyy\' format:");
		int c = in.nextInt();
		
		String date = new String(""+c+"-"+b+'-'+a);
		try{
			Date utilDate = sdf.parse(date);
			System.out.println(utilDate);
			int day = sdf.getCalendar().get(Calendar.DAY_OF_WEEK);
			String strDay = "";
			
			switch(day){
				case Calendar.SUNDAY 	:	strDay = "Sunday";
					 						break;
				
				case Calendar.MONDAY 	: 	strDay = "Monday";
		 									break;
		 					
				case Calendar.TUESDAY 	: 	strDay = "Tuesday";
										 	break;
				
				case Calendar.WEDNESDAY : 	strDay = "Wednesday";
											break;	
				
				case Calendar.THURSDAY	: 	strDay = "Thursday";
											break;
							
				case Calendar.FRIDAY 	: 	strDay = "Friday";
											break;
				
				case Calendar.SATURDAY 	: 	strDay = "Saturday";
											break;
		 					
			}
			System.out.println("Valid Date. Day is " + strDay);
		}catch (ParseException e){
			System.out.println("Invalid date");
			e.printStackTrace();
		}
		in.close();
	}
	

}
