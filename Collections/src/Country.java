import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Country {

	public static void main(String[] args) {
		
		//*list with 1 - 3 countries and choose and it'll print 10 states
		//*Write the country states desc or asc order
		Scanner scan = new Scanner(System.in);

		//*Saving country states
		List<String> mexicoStates = new ArrayList();
		mexicoStates.add("Aguascalientes");
		mexicoStates.add("Campeche");
		mexicoStates.add("Chiapas");
		mexicoStates.add("Chihuahua");
		mexicoStates.add("Coahuila");
		mexicoStates.add("Colima");
		mexicoStates.add("Durango");
		mexicoStates.add("Guanajuato");
		mexicoStates.add("Guerrero");
		mexicoStates.add("Hidalgo");
		
		List<String> USAStates = new ArrayList();
		USAStates.add("Alabama");
		USAStates.add("Alaska");
		USAStates.add("Arizona");
		USAStates.add("Arkansas");
		USAStates.add("California");
		USAStates.add("Colorado");
		USAStates.add("Connecticut");
		USAStates.add("Delaware");
		USAStates.add("Florida");
		USAStates.add("Georgia");
		
		List<String> spainStates = new ArrayList();
		spainStates.add("Burgos");
		spainStates.add("Almería");
		spainStates.add("Huelva");
		spainStates.add("Lleida");
		spainStates.add("Navarra");
		spainStates.add("Palencia");
		spainStates.add("Pontevedra");
		spainStates.add("Sevilla");
		spainStates.add("Tarragona");
		spainStates.add("Ceuta");
		

		
		//*Creating map
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		map.put("Mexico", mexicoStates);
		map.put("USA", USAStates);
		map.put("Spain", spainStates);

		
		System.err.println("Choose a country from the list shown below");
		for(Map.Entry<String, List<String>> element : map.entrySet()) {
			String key = element.getKey();
			System.out.println(key);
		}
		
		System.out.println("Your selection ");
		String selection = scan.nextLine();
		
		List<String> values = null;
		for(Map.Entry<String, List<String>> element : map.entrySet()) {
			String key = element.getKey();
			if(key.equalsIgnoreCase(selection)) {
				values = element.getValue();
				break;
			}
		}
		
		System.out.println();
		System.out.println("Print states in descending mode - 1 ");
		System.out.println("Print states in ascending mode - 2 ");
		System.out.println();
		
		System.out.print("Your selection: ");
		Integer opt = scan.nextInt();
		System.out.println();
		
		//*Switch to select the print mode
		switch(opt) {
			case 1:
				Collections.reverse(values);
				for(String st : values) {
					System.out.println(st);
				}
				break;
			case 2:
				for(String st : values) {
					System.out.println(st);
				}
				break;
			default:
				System.err.println("Not valid mode");
				System.exit(0);
		}

	}



}
