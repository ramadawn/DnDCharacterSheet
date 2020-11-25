package com.info3245.gamemasterutility;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Load {
	
	public static void loadSheet(CharacterSheet character, String data)  {

		data = data.substring(1, data.length() - 1);
		List<String> statList = new ArrayList<String>(Arrays.asList(data.split(",")));

		character.setName(statList.get(0)); //name
		character.setAC(statList.get(1));//AC
		character.setMaxHP(statList.get(2));//maxHP
		character.setCurrentHP(statList.get(3));//currentHP
		character.setWeapon1(statList.get(4));//weapon1
		character.setWeapon2(statList.get(5));//weapon2
		character.setWeapon3(statList.get(6));//weapon3
		character.setArmour(statList.get(7));//armour
		character.setShield(statList.get(8));//shield
		character.setStr(statList.get(9));//strength
		character.setDex(statList.get(10));//dexterity
		character.setCon(statList.get(11));//constitution
		character.setInt(statList.get(12));//intelligence
		character.setWis(statList.get(13));//wisdom
		character.setCha(statList.get(14));//charisma
		character.setAthletics(statList.get(15));//athletics
		character.setAcrobatics(statList.get(16));//acrobatics
		character.setSleightOfHand(statList.get(17));//sleightOfHand
		character.setStealth(statList.get(18));//stealth
		character.setArcana(statList.get(19));//arcana
		character.setHistory(statList.get(20));//history
		character.setInvestigation(statList.get(21));//investigation
		character.setNature(statList.get(22));//nature
		character.setReligion(statList.get(23));//religion
		character.setAnimalHandling(statList.get(24));//animal handling
		character.setInsight(statList.get(25));//insight
		character.setMedicine(statList.get(26));//medicne
		character.setPerception(statList.get(27));//perception
		character.setSurvival(statList.get(28));//survival
		character.setDeception(statList.get(29));//deception
		character.setIntimidation(statList.get(30));//intimidation
		character.setPerformance(statList.get(31));//performance
		character.setPersuasion(statList.get(32));//persuasion
		character.setSaveFileName(statList.get(32));//savefile
	}
}


