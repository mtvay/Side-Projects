package com.character.classes;


public abstract class CharacterClass{

	//will contains information for all of the classes available in the base player's handbook
	
	//need to make sure that any changes to ability score or special characteristics are accounted for
	
	//classes should be an ABSTRACT -- I can have each dnd class be its own java class. Then i can map a list of dnd classes to randomly pull from.
	
	private String description;
	
	public String getDescription() {
		return description;
	}
	
	//public CharacterClass (CharacterClass characterClass, String[] startingEquipment, )
	
	public abstract CharacterClass getCharacterClass();
	
}
