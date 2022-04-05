
import java.util.Arrays;
import java.util.List;


public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> courses = Arrays.asList("Java","PHP",".Net","Spring boot","Git","Linux");

		System.out.println("\nCourses list");
		for(String course : courses) {
			System.out.println(course);
			if(course.toLowerCase().replace(" ", "").equals("springboot"))
					System.out.println("Found " + course);
		}
		
		//*Printing using streams
		//*Java 8 or superior use streams and lambdas
		//*Streams are immutable, original values are not afected 
		//*Streams can be just used once, if we wanna do another condition we gotta create a new Stream
		
		Stream<String> course2 = courses.stream();
		
		
	}
}
