package com.character.generator.application;

import org.junit.Test;

import com.character.generator.application.DiceRoller;

import org.junit.Assert;

public class DiceRollerTest {
	/*
	 * check rollDice for 0 or number greater than sides of dice
	 * 
	 * check abilityScoreRoll for 0 or number greater than 6 (total result cannot be over 18)
	 * 
	 * Walt mentioned breaking the arrange, act, assert rules and doing act and assert a second time, just make sure the message says when it failed (if it does)
	 */
	
	@Test
	public void rollDice_does_not_return_zero_or_number_higher_than_sides_of_dice() {
		//Arrange
		DiceRoller roller = new DiceRoller();
		
		//Act
		int result = roller.rollDice(1, 6);
		boolean inRange = result >= 1 && result <= 6;
		
		//Assert
		Assert.assertTrue("Result should be greater than or equal to 1 and less than or equal to sumber of sides on the die", inRange);
	}
	
	//check if sort works and lowest vlaue is dropped
	@Test
	public void abilityScoreRoll_does_not_include_zero_or_return_over_18() {
		//Arrange
		DiceRoller roller = new DiceRoller();
		
		//Act
		int result = roller.abilityScoreRoll();
		boolean inRange = result >= 3 && result <= 18;
		
		//Assert
		Assert.assertTrue("Result should be greater than or equal to 3 and less than or equal to 18", inRange);
	}

}
