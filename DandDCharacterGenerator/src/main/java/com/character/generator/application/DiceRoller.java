package com.character.generator.application;

import java.util.Arrays;
import java.util.Random;

public class DiceRoller {
	
	/*
	 * seems like it will be best if this is purely a dice roller. All other classes, races, ability scores, etc will use this, but specific changes 
	 * to the results of the roll will all be handled in the respective classes.
	 */

	//accepts the number of dice needed and the number of sides per dice and return the total rolled amount
	public int rollDice(int numberOfDice, int numberOfSides) {
		int totalResult = 0;
		int rollResult = 0;
		
		Random randomNum = new Random();
		
		for (int i = 0; i < numberOfDice; i++) {
			
			rollResult = randomNum.nextInt(numberOfSides) + 1;
			totalResult += rollResult;
		}
		return totalResult;
	}
	
	//specifically for rolling ability scores. Rolls 4 d6, throws out the lowest score, and return the total of the highest 3
	public int abilityScoreRoll() {
		
		int abilityScore = 0;
		int[] diceRolls = new int[4];
		Random randomNum = new Random();
		
		for (int i = 0; i < 4; i++) {
			diceRolls[i] = randomNum.nextInt(6) + 1;
		}
		
		Arrays.sort(diceRolls);
		
		for (int i = 1; i < diceRolls.length; i++) {
			abilityScore += diceRolls[i];
		}
		return abilityScore;
	}
	

	
}
