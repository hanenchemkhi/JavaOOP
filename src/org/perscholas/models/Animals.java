package org.perscholas.models;

import java.time.LocalDate;


public class Animals {
	private int id;
	private String name;
	private LocalDate birthOfDate;
	
	public Animals() {}
	public Animals(int id, String name, LocalDate birthOfDate) {
		this.id = id;
		this.name = name;
		this.birthOfDate = birthOfDate;
	}
	

	@Override
	public String toString() {
		return "Animals id= " + id + ", name= " + name + ", birthOfDate= " + birthOfDate ;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirthOfDate() {
		return birthOfDate;
	}	
	
	
}
