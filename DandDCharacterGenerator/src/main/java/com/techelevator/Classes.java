package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Classes {

	//will contains information for all of the classes available in the base player's handbook
	
	//need to make sure that any changes to ability score or special characteristics are accounted for
	
	//classes should be an ABSTRACT -- I can have each dnd class be its own java class. Then i can map a list of dnd classes to randomly pull from.
	
	private String name; //each class has a suggested set of names that I will pull from
	private String racialTraits;
	private Map<String, Integer> abilityScoreIncrease = new HashMap<>();
	private int age;
	private String allignment;
	private String size;
	private String speed;
	private String languages;
	private String race;
	
	public String getName() {
		return name;
	}
	
}
