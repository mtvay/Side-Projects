package com.techelevator;

import java.util.Arrays;
import java.util.Random;

public class DiceRoller {

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
	
	public int abilityScoreRoll() {
		
		int abilityScore = 0;
		int[] diceRolls = new int[4];
		Random randomNum = new Random();
		
		for (int i = 0; i < 5; i++) {
			diceRolls[i] = randomNum.nextInt(6) + 1;
		}
		
		Arrays.sort(diceRolls);
		
		for (int i = 1; i < diceRolls.length; i++) {
			abilityScore += diceRolls[i];
		}
		return abilityScore;
	}
	
	/*
	 * seems like it will be best if this is purely a dice roller. All other classes, races, ability scores, etc will use this, but specific changes 
	 * to the results of the roll will all be handled in the respective classes.
	 * 
	 */
	
	//will have the dice rolling program to determine ability scores and ?starting health?
	
	//will need to make sure the program accounts for any special cases arising from class/race
	
	//should include preferences for distributing points based on class (intelligence for wizard, strength/constitution for fighter, etc...)
	
}
