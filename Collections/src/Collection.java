import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> listSource = new ArrayList();
		listSource.add("123");
		listSource.add(4,"123");
		
		Set<String> setA = new HashSet<>();
		//*Set no puede tener elementos repetidos
		setA.add("yeah");
		setA.add("yeah2");
		for(String element : setA) {
			System.out.println(element);
		}
		
		// * Guarda dos elementos, llave y el valor relacionado con la llave
		// * La llave no se puede repetir
		Map<String, String> map = new HashMap<>();
		
		map.put("key1", "element1");
		map.put("key2", "element2");
		map.put("key3", "element3");
	}

}
