package com.techelevator;

import org.junit.Test;
import org.junit.Assert;

public class DiceRollerTest {
	/*
	 * check rollDice for 0 or number greater than sides of dice
	 * 
	 * check abilityScoreRoll for 0 or number greater than 6 (total result cannot be over 18)
	 * 
	 * ask Walt about running the same test as a loop to cover for random generator possibilities
	 */
	
	@Test
	public void rollDice_does_not_return_zero_or_number_higher_than_sides_of_dice() {
		//Arrange
		DiceRoller roller = new DiceRoller();
		
		//Act
		int result = roller.rollDice(1, 6);
		
		//Assert
		Assert.assertEquals((result > 0 && result < 7), result);
	}
	
	@Test
	public void abilityScoreRoll_does_not_include_zero_or_return_over_18() {
		//Arrange
		DiceRoller roller = new DiceRoller();
		
		//Act
		int result = roller.abilityScoreRoll();
		
		//Assert
		Assert.assertEquals(result > 0 && result < 19, result);
	}

}
