package se.jpdc.mvnApp.domain;

import java.io.Serializable;

public class Raceturtle implements Serializable {
	
	private String name;
	private int startNo;
	private static int counter = 0;
	
	
	public Raceturtle(String name) {
		this.name = name;
	}
	

	public Raceturtle(String name, int startNo) {
		this.name = name;
		this.startNo = startNo;
	}




	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getStartNo() {
		return startNo;
	}


	public void setStartNo(int startNo) {
		this.startNo = startNo;
	}


	@Override
	public String toString() {
		return String.format("Raceturtle with the name %s and starting no: %d", name, startNo);
	}
	
	
	
	
	
	

}
