package com.character.races;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class CharacterRace implements Describable {
	
	//will contain information for all the races available in the base player's handbook
	
	//need to make sure that any changes to ability score or special characteristics are accounted for
	
	//should races be an interface? I can have each race be its own java class. Then i can map a list of races to randomly pull from.

	private String name; //create array of possible names for each race inside the race class
	private String racialTraits;
	private String size;
	private String speed;
	private String languages;
	private String race;
	private Map<String, Integer> abilityScoreIncrease = new LinkedHashMap<>();
	private int age;
	private String description;
	
	public String getName() {
		return name;
	}
	
	public String getRacialTraits() {
		return racialTraits;
	}
	
	public String getSize() {
		return size;
	}
	
	public String getSpeed() {
		return speed;
	}
	
	public String getLanguages() {
		return languages;
	}
	
	public String getRace() {
		return race;
	}

	public abstract Map<String, Integer> getAbilityScoreIncrease();
	
	public int getAge() {
		return age;
	}
	
	public String getDescription() {
		return description;
	}
	
}
