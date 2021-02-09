package bootCamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Week4Assignment1 {

	public static void main(String[] args) {
		
		
	/*
	 * 1.
	 * 	Create an instance of an ArrayList of String called employeeNames
	 * 
	 */
		
		List<String> employeeNames = new ArrayList<String>(); 
		
		
		
	/*
	 * 2.
	 * Create and instance of HashSet of Integer called ids 
	 * 
	 */
		
		Set<Integer> ids = new HashSet<Integer>();
		
	/*
	 *3.
	 *Create an instance of HashMap of Integer, String called employeeMap 
	 *
	 */
		
		Map<Integer , String> employeeMap = new HashMap<Integer , String>();
		
		
		
	/*
	 * 4.
	 * Add at least five entries to the employeeNames and ids (make sure both collections have the same number of entries).
	 * 
	 */
		
		// This will add 5 names to the employeeNames ArrayList
		employeeNames.add("Zach");
		employeeNames.add("Sam");
		employeeNames.add("Tom");
		employeeNames.add("Sally");
		employeeNames.add("Chipotle");
		
		// This will Create 5 ids to the ids Hashset
		
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		
		
	/*
	 * 5.
	 *Create a variable int i = 0; then iterate over ids using an enhanced for loop. Inside the 
	 *enhanced for loop use employeeMap.put() to add a new entry to the map. The entry 
	 *should consist of a key that is the id in the enhanced loop’s current iteration, and a value 
	 * that is the employeeName at position i of the employeeNames ArrayList. Increment i so 
	 * that each iteration grabs the next element in the ArrayList.
	 *  
	 */
		
		
		int i = 0;
		// enhanced for loop that will Integer id for all the ints in ids
		for (Integer id : ids) {
			// each time it iterates it will add the Integer of id, and the string of employeeNames at index i.
			employeeMap.put(id, employeeNames.get(i));
			// iterate i
			i++;
			
		}
		
		
		
		
		/*
		 * 6.
		 * Once the employeeMap is fully populated, use another enhanced for loop to iterate over 
		 * the employeeMap.keySet(), and use the key for each current iteration to print to the 
		 * console both the current key and its associated value in the map.
		 */
		// enhanced for loop that will Integer key for each iteration of the employeeMap
		for (Integer key : employeeMap.keySet()) {
			// This will print out the key, and the key iteration of the employeeMap
			System.out.println("Employee id is: " + key + " Employee Name is " + employeeMap.get(key));
		}

		
		/*
		 * 7.
		 * Create a StringBuilder called idsBuilder
		 * 
		 */
		
		StringBuilder idsBuilder = new StringBuilder();
		
		/*
		 * 8.
		 * Iterate over the ids HashSet and append each id, followed by a dash “-“ to idsBuilder.
		 */
		
			// For loop that will take the Integer id in ids.
			for (Integer id : ids) {
				//This will append the idsBuilder ids at the index of id and add a -
				idsBuilder.append(id + "-");
			}
				// If the idsBuilder at the end or length of idsBuilder - 1 
				if (idsBuilder.charAt(idsBuilder.length() - 1) == '-') {
					idsBuilder.setLength(idsBuilder.length() - 1);			
			}

		
		/*
		 * 9.
		 *Print the result of idsBuilder.toString() to the console
		 */
			
		System.out.println(idsBuilder.toString());
		
		
		/*
		 * 10.
		 * Create another StringBuilder called namesBuilder
		 * 
		 */
			// Create a string builder that is named namesBuilder
			StringBuilder namesBuilder = new StringBuilder();
			
			
		/*
		 * 11.	
		 * Iterate over the employeeNames ArrayList and append each name, followed by a space “ “ to the namesBuilder.
		 */
		
			// For loop that will loop through employeeNames and append name to namesBuilder.
			for (String name : employeeNames) {
				namesBuilder.append(name + " ");
			}
			
			
		/*
		 * 12.
		 * Print the result of namesBuilder.toString() to the console.
		 * 
		 */
			// Will print out namesBuilder to a string
			System.out.println(namesBuilder.toString());
			
	}// ARgs 

}// Class
