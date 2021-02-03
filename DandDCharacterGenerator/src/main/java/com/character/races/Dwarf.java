package com.character.races;

import com.character.generator.application.DiceRoller;

import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.io.File;
import java.util.ArrayList;
import java.io.FileNotFoundException;

public abstract class Dwarf extends CharacterRace {

	private String name;
	private List<String> maleNames = new ArrayList<>();
	private List<String> femaleNames = new ArrayList<>();
	private List<String> clanNames = new ArrayList<>();
	private DiceRoller diceRoller = new DiceRoller();
	private File dwarfMaleNames = new File("/DandDCharacterGenerator/Name-txt-Files/Dwarf-Male-Names.txt");
	private File dwarfFemaleNames = new File("/DandDCharacterGenerator/Name-txt-Files/Dwarf-Female-Names.txt");
	private File dwarfClanNames = new File("/DandDCharacterGenerator/Name-txt-Files/Dwarf-Clan-Names.txt");

	@Override
	public abstract Map<String, Integer> getAbilityScoreIncrease();
	
	public String getName() {   //This will need to pull a random number, 1 for male, 2 for female, and then roll another random number to pull from the array of names
		int firstNameResult = diceRoller.rollDice(1, 2);
		
		if (firstNameResult == 1) {
			int maleResult = diceRoller.rollDice(1, maleNames.size() - 1);
			name += maleNames.get(maleResult);
			
		} else if (firstNameResult == 2) {
			int femaleResult = diceRoller.rollDice(1, femaleNames.size() - 1);
			name += femaleNames.get(femaleResult);
			
		}
		int clanNameResult = diceRoller.rollDice(1, clanNames.size() - 1);
		name += clanNames.get(clanNameResult);
		return name;
	}
	
	public void setMaleNames() {
		String[] male;
		
		try (Scanner nameScanner = new Scanner(dwarfMaleNames)) {
			while(nameScanner.hasNextLine()) {
				String line = nameScanner.nextLine();
				male = line.split(", ");
				
				for (String name : male) {
					this.maleNames.add(name);
				}
			}
		} catch (FileNotFoundException e){
			System.exit(1);
		}
	}
	
	public void setFemaleNames(String femaleName) {
		String[] female;
		
		try (Scanner nameScanner = new Scanner(dwarfFemaleNames)) {
			while(nameScanner.hasNextLine()) {
				String line = nameScanner.nextLine();
				female = line.split(", ");
				
				for (String name : female) {
					this.femaleNames.add(name);
				}
			}
		} catch (FileNotFoundException e){
			System.exit(1);
		}
	}
	
	public void setClanNames(String clanName) {
		String[] clan;
		
		try (Scanner nameScanner = new Scanner(dwarfClanNames)) {
			while(nameScanner.hasNextLine()) {
				String line = nameScanner.nextLine();
				clan = line.split(", ");
				
				for (String name : clan) {
					this.clanNames.add(name);
				}
			}
		} catch (FileNotFoundException e){
			System.exit(1);
		}
	}
	
	public String getSpeed() {
		return "Walking speed of 25 feet.";
	}
	

	
	
}
