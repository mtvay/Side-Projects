package com.character.races;

import com.character.generator.application.DiceRoller; //Does this work??? Or will I have to make is an interface and then put the method in each master class?

import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public abstract class Dwarf extends CharacterRace {

	private String name;
	private List<String> maleNames = new ArrayList<>();
	private List<String> femaleNames = new ArrayList<>();
	private List<String> clanNames = new ArrayList<>();

	@Override
	public abstract Map<String, Integer> getAbilityScoreIncrease();
	
//	public String getName() {   //This will need to pull a random number, 1 for male, 2 for female, and then roll another random number to pull from the array of names
//		int firstNameResult = rollDice(1, 2);
//		if (firstNameResult == 1) {
//			int maleResult = rollDice(1, maleNames.size() - 1);
//			name += maleNames.get(maleResult);
//		} else if (firstNameResult == 2) {
//			int femaleResult = rollDice(1, femaleNames.size() - 1);
//			name += femaleNames.get(femaleResult);
//		}
//		int clanNameResult = rollDice(1, clanNames.size() - 1);
//		name += clanNames.get(clanNameResult);
//		return name;
//	}
	
	public void setMaleNames(String maleName) {
		this.maleNames.add(maleName);
	}
	
	public void setFemaleNames(String femaleName) {
		this.femaleNames.add(femaleName);
	}
	
	public void setClanNames(String clanName) {
		this.clanNames.add(clanName);
	}
	
	public String getSpeed() {
		return "Walking speed of 25 feet.";
	}
	
}
