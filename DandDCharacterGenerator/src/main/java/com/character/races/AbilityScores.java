package com.character.races;

import java.util.LinkedHashMap;
import java.util.Map;

public class AbilityScores {
	
	//will have all of the ability scores and account for base scores and additions from class and race that are generated
	
	// should this be an interface that i implement on the races abstract class?
	
	private Map<String, Integer> abilityScores = new LinkedHashMap<>();
	
	public Map<String, Integer> getAbilityScores() {
		return abilityScores;
	}
	//need to have another map to display ability score modifiers

}
