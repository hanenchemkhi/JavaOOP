package org.perscholas;

import org.perscholas.models.Mammals;
import org.perscholas.models.Animals;
import java.time.LocalDate;
public class MainRunner {

	public static void main(String[] args) {
		
		Mammals mammals = new Mammals(456,"pet", LocalDate.parse("2021-12-27"), "domestic");
		Animals animals = new Animals(123,"pet", LocalDate.parse("2020-12-27"));
		
		System.out.println(mammals.getId());
		System.out.println(mammals.getName() );
		System.out.println(mammals.getBirthOfDate());
		System.out.println("================================================");
		System.out.println(animals);

	}

}
