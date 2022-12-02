package org.perscholas.models;

import java.time.LocalDate;

public class Mammals extends Animals {
	
	private int id;
	private String name;
	private LocalDate birthOfDate;
	private String habitat;
	
	
	
	public Mammals(int id, String name, LocalDate dateOfBirth, String habitat) {
		super(id, name, dateOfBirth);
		this.habitat = habitat;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	@Override
	public String toString() {
		return "Animal id= " + id +", name= " + name + ", birthOfDate= " + birthOfDate + ", habitat= " + habitat ;
	}
	
	

}
