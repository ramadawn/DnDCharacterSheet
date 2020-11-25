package com.info3245.gamemasterutility;

//Class for creating a character sheet object
public class CharacterSheet {

		//Basic character sheet values
	
		//Other Stats
		private String name = "0";
		private String AC = "0";
		private String maxHP = "0";
		private String currentHP = "0";
		private String weapon1 = "";
		private String weapon2 = "";
		private String weapon3 = "";
		private String armour = "";
		private String shield = "";
		
		//Character attributes
		private String strength = "0";
		private String dexterity = "0";
		private String constitution = "0";
		private String intelligence = "0";
		private String wisdom = "0";
		private String charisma = "0";
		
		//Character skills
		
		//Strength
		private String athletics = "0";
		private String athleticsStat = "Strength";
		
		//Dexterity
		private String acrobatics = "0";
		private String acrobaticsStat = "Dexterity";
		
		private String sleightOfHand = "0";
		private String sleightOfHandStat = "Dexterity";
		
		private String stealth = "0";
		private String stealthStat = "Dexterity";
		
		//Intelligence 
		private String arcana = "0";
		private String arcanaStat = "Intelligence";
		
		private String history = "0";
		private String historyStat = "Intelligence";
		
		private String investigation = "0";
		private String investigationStat = "Intelligence";
		
		private String nature = "0";
		private String natureStat = "Intelligence";
		
		private String religion = "0";
		private String religionStat = "Intelligence";
		
		//wisdom
		private String animalHandling = "0";
		private String animalHandlingStat = "Wisdom";
		
		private String insight = "0";
		private String insightStat = "Wisdom";
		
		private String medicine = "0";
		private String medicineStat = "Wisdom";
		
		private String perception = "0";
		private String perceptionStat = "Wisdom";
		
		private String survival = "0";
		private String survivalStat = "Wisdom";
		
		// Charisma
		
		private String deception = "0";
		private String deceptionStat = "Charisma";
		
		private String intimidation = "0";
		private String intimidationStat = "Charisma";
		
		private String performance = "0";
		private String performanceStat = "Charisma";
		
		private String persuasion = "0";
		private String persuasionStat = "Charisma";
		
		//save file name
		private String saveFileName = "save.txt";
		
		public CharacterSheet() {
		}
		
		
		//Set all of the characters attributes
		public void setAttributes(String aStrength, String aDexterity, 
								String aConstitution, String aIntelligence,
								String aWisdom, String aCharisma) {
			strength = aStrength;
			dexterity = aDexterity;
			constitution = aConstitution;
			intelligence = aIntelligence;
			wisdom = aWisdom;
			charisma = aCharisma;
		}
		
		
		
		//Set all Skill values
		public void setSkills(String athletics, String acrobatics, 
								String sleightOfHand, String stealth,
									String arcana, String history,         
										String investigation, String nature, 
											String religion, String animalHandling,
												String insight, String medicine,
													String perception, String survival, 
														String deception, String intimidation,
															String performance, String persuasion) 	
		
		
		{
			this.athletics = athletics;
			this.acrobatics = acrobatics;
			this.sleightOfHand = sleightOfHand;
			this.stealth = stealth;
			this.arcana = arcana;
			this.history = history;
			this.investigation = investigation;
			this.nature = nature;
			this.religion = religion;
			this.animalHandling = animalHandling;
			this.insight = insight;
			this.medicine = medicine;
			this.perception = perception;
			this.survival = survival;
			this.deception = deception;
			this.intimidation = intimidation;
			this.performance = performance;
			this.persuasion = persuasion;

		}
		
		//Get and Set name
		
		public void setName(String newName) {
			this.name = newName;
		}
		
		public String getName() {
			return this.name;
		}
		
		//Get and set Hit points
	public String getMaxHPStr(){
			return this.maxHP;
	}
	public int getMaxHPInt(){
			return Integer.parseInt(this.maxHP);
	}
		//Set max HP with a string
		public void setMaxHP(String hp) {
			this.maxHP = hp;
		}
		
		//Set max HP with an int
		public void setMaxHP(int hp) {
			this.maxHP = Integer.toString(hp);
		}
		
		//set character to full health
		public void fullHealth() {
			this.currentHP = this.maxHP;
		}
		
		//Set max HP with an int
		public void setCurrentHP(int hp) {
			this.currentHP = Integer.toString(hp);
			}
		
		public void setCurrentHP(String hp) {
			this.currentHP = hp;
			}
		
		
		//Get current HP as a string
		public String getCurrentHPStr() {
			return this.currentHP;
		}
		
		//Get current HP as an Int
		public int getCurrentHPInt() {
			return Integer.parseInt(this.currentHP);
		}
		
		//Handles character healing
		public void Heal(int healAmount){
			int newHealth = Integer.parseInt(this.currentHP) + healAmount;
		
			if(newHealth > Integer.parseInt(this.maxHP)) {
				this.currentHP = this.maxHP;
			}
			
			else {
				this.currentHP = Integer.toString(newHealth);
			}
		}
//----------------------------------------------------------
		//Set weapons
			//weapon 1
			public void setWeapon1(String weapon) {
				this.weapon1 = weapon;
			}
			
			//weapon 2
			public void setWeapon2(String weapon) {
				this.weapon2 = weapon;
			}
			
			//weapon 3
			public void setWeapon3(String weapon) {
				this.weapon3 = weapon;
			}
			
			
			//Get weapons
			//weapon 1
			public String getWeapon1() {
				return this.weapon1;
			}
			
			//weapon 2
			public String getWeapon2() {
				return this.weapon2;
			}
			
			//weapon 3
			public String getWeapon3() {
				return this.weapon3;
			}
		
// Armour and Shield -------------------------------------------
			public void setArmour(String armour) {
				this.armour = armour;
			}
			
			public String getArmour() {
				return this.armour;
			}
			
			public void setShield(String shield) {
				this.shield = shield;
			}
			
			public String getShield() {
				return this.shield;
			}
			
			public void setAC(String AC) {
				this.AC = AC;
			}
		
			public void setAC(int AC) {
				this.AC = Integer.toString(AC);
			}
			
			//Get current HP as a string
			public String getACString() {
				return this.AC;
			}
			
			//Get current HP as an Int
			public int getACInt() {
				return Integer.parseInt(this.AC);
			}
			
			
//Get and set attributes		
//-------------Strength--------------------------------		
		//set string
		public void setStr(String att) {
			this.strength = att;
		}
		//set Int
				public void setStr(int att) {
					this.strength = Integer.toString(att);
				}
		//get string
		public String getStrString() {
			return this.strength;
		}
		
		//get integer
		public int getStrInt() {
			return Integer.parseInt(this.strength);
		}
		
		//-------------Dexterity--------------------------------		
				//set string
				public void setDex(String att) {
					this.dexterity = att;
				}
				//set Int
						public void setDex(int att) {
							this.dexterity = Integer.toString(att);
						}
				//get string
				public String getDexString() {
					return this.dexterity;
				}
				
				//get integer
				public int getDexInt() {
					return Integer.parseInt(this.dexterity);
				}
		
		
		
				//-------------Constitution--------------------------------		
				//set string
				public void setCon(String att) {
					this.constitution = att;
				}
				//set Int
						public void setCon(int att) {
							this.constitution = Integer.toString(att);
						}
				//get string
				public String getConString() {
					return this.constitution;
				}
				
				//get integer
				public int getConInt() {
					return Integer.parseInt(this.constitution);
				}
				
				//-------------Intelligence--------------------------------		
				//set string
				public void setInt(String att) {
					this.intelligence = att;
				}
				//set Int
						public void setInt(int att) {
							this.intelligence = Integer.toString(att);
						}
				//get string
				public String getIntString() {
					return this.intelligence;
				}
				
				//get integer
				public int getIntInt() {
					return Integer.parseInt(this.intelligence);
				}
				
				//-------------wisdom--------------------------------		
				//set string
				public void setWis(String att) {
					this.wisdom = att;
				}
				//set Int
						public void setWis(int att) {
							this.wisdom = Integer.toString(att);
						}
				//get string
				public String getWisString() {
					return this.wisdom;
				}
				
				//get integer
				public int getWisInt() {
					return Integer.parseInt(this.wisdom);
				}
				
				//-------------charisma--------------------------------		
				//set string
				public void setCha(String att) {
					this.charisma = att;
				}
				//set Int
						public void setCha(int att) {
							this.charisma = Integer.toString(att);
						}
				//get string
				public String getChaString() {
					return this.charisma;
				}
				
				//get integer
				public int getChaInt() {
					return Integer.parseInt(this.charisma);
				}
				
				//return saving throw mods
				public int saveThrowMod(int att) {
					return attributeMod(att);
				}
				
				public int saveThrowMod(String att) {
					return attributeMod(Integer.parseInt(att));
				}
				
				//get attribute bonus with Integer -> returns Int
				public int attributeMod(int att) {
					switch(att) {
					 	case 1: 
					 		return -5;
					 	case 2:
					 	case 3:
					 		return -4;
					 	case 4:
					 	case 5:
					 		return -3;
					 	case 6:
					 	case 7:
					 		return -2;
					 	case 8:
					 	case 9:
					 		return -1;
					 	case 10:
					 	case 11:
					 		return 0;
					 	case 12:
					 	case 13:	
					 		return 1;
					 	case 14:
					 	case 15:
					 		return 2;
					 	case 16:
					 	case 17:
					 		return 3;
					 	case 18:
					 	case 19:
					 		return 4;
					 	case 20:
					 	case 21:
					 		return 5;
					 	case 22:
					 	case 23:
					 		return 6;
					 	default:
					 		return 7;
					 	
					}
				}
				
				
				
				//get attribute bonus with String - returns int
				public int attributeMod(String attstring) {
					int att = Integer.parseInt(attstring);
					switch(att) {
					 	case 1: 
					 		return -5;
					 	case 2:
					 	case 3:
					 		return -4;
					 	case 4:
					 	case 5:
					 		return -3;
					 	case 6:
					 	case 7:
					 		return -2;
					 	case 8:
					 	case 9:
					 		return -1;
					 	case 10:
					 	case 11:
					 		return 0;
					 	case 12:
					 	case 13:	
					 		return 1;
					 	case 14:
					 	case 15:
					 		return 2;
					 	case 16:
					 	case 17:
					 		return 3;
					 	case 18:
					 	case 19:
					 		return 4;
					 	case 20:
					 	case 21:
					 		return 5;
					 	case 22:
					 	case 23:
					 		return 6;
					 	default:
					 		return 7;
					 	
					}
				}
				
				
				
				
				
				
		//SKILL getter and setters
				
				
				
				
				
				//When given a skill's particular stat will return the right skill modifier
				public int skillModifier(String SkillStat) {
					switch(SkillStat) {
					 	case "Strength":
					 		return attributeMod(this.getStrInt());
					 	
					 	case "Dexterity":
					 		return attributeMod(this.getDexInt());
					 		
					 	case "Intelligence":
					 		return attributeMod(this.getIntInt());
					 	case "Wisdom":
					 		return attributeMod(this.getWisInt());
					 	case "Charisma":
					 		return attributeMod(this.getChaInt());
					 	
					 	default :
					 		return -1;
					}
				}
				
				
//----------athletics
				
				//String
				public void setAthletics(String att) {
					this.athletics = att;
				}
				public void setAthletics(int att) {
					this.athletics = Integer.toString(att);
				}
				
				//get string
				public String getAthleticsStr() {
					return this.athletics;
				}
				
				//get integer
				public int getAthleticsInt() {
					return Integer.parseInt(this.athletics);
				}
				
				//get Skills associated stat
				public String getAthleticsStat() {
					return this.athleticsStat;
				}
				
//----------acrobatics
				
				//String
				public void setAcrobatics(String att) {
					this.acrobatics = att;
				}
				public void setAcrobatics(int att) {
					this.acrobatics = Integer.toString(att);
				}
				
				//get string
				public String getAcrobaticsStr() {
					return this.acrobatics;
				}
				
				//get integer
				public int getAcrobaticsInt() {
					return Integer.parseInt(this.acrobatics);
				}
				
				//get Skills associated stat
				public String getAcrobaticsStat() {
					return this.acrobaticsStat;
				}
				
//----------setSleightOfHand
				
				//String
				public void setSleightOfHand(String att) {
					this.sleightOfHand = att;
				}
				public void setSleightOfHand(int att) {
					this.sleightOfHand = Integer.toString(att);
				}
				
				//get string
				public String getSleightOfHandStr() {
					return this.sleightOfHand;
				}
				
				//get integer
				public int getSleightOfHandInt() {
					return Integer.parseInt(this.sleightOfHand);
				}
				
				//get Skills associated stat
				public String getSleightOfHandStat() {
					return this.sleightOfHandStat;
				}
				
//----------stealth
				
				//String
				public void setStealth(String att) {
					this.stealth = att;
				}
				public void setStealth(int att) {
					this.stealth = Integer.toString(att);
				}
				
				//get string
				public String getStealthStr() {
					return this.stealth;
				}
				
				//get integer
				public int getStealthInt() {
					return Integer.parseInt(this.stealth);
				}	
				
				//get Skills associated stat
				public String getStealthStat() {
					return this.stealthStat;
				}
				
//----------arcana
				
				//String
				public void setArcana(String att) {
					this.arcana = att;
				}
				public void setArcana(int att) {
					this.arcana = Integer.toString(att);
				}
				
				//get string
				public String getArcanaStr() {
					return this.arcana;
				}
				
				//get integer
				public int getArcanaInt() {
					return Integer.parseInt(this.arcana);
				}
				
				//get Skills associated stat
				public String getArcanaStat() {
					return this.arcanaStat;
				}
				 
//----------history
				
				//String
				public void setHistory(String att) {
					this.history = att;
				}
				public void setHistory(int att) {
					this.history = Integer.toString(att);
				}
				
				//get string
				public String getHistoryStr() {
					return this.history;
				}
				
				//get integer
				public int getHistoryInt() {
					return Integer.parseInt(this.history);
				}	
				
				//get Skills associated stat
				public String getHistoryStat() {
					return this.historyStat;
				}

//----------investigation
				
				//String
				public void setInvestigation(String att) {
					this.investigation = att;
				}
				public void setInvestigation(int att) {
					this.investigation = Integer.toString(att);
				}
				
				//get string
				public String getInvestigationStr() {
					return this.investigation;
				}
				
				//get integer
				public int getInvestigationInt() {
					return Integer.parseInt(this.investigation);
				}	
				
				//get Skills associated stat
				public String getInvestigationStat() {
					return this.investigationStat;
				}
				
//----------nature
				
				//String
				public void setNature(String att) {
					this.nature = att;
				}
				public void setNature(int att) {
					this.nature = Integer.toString(att);
				}
				
				//get string
				public String getNatureStr() {
					return this.nature;
				}
				
				//get integer
				public int getNatureInt() {
					return Integer.parseInt(this.nature);
				}
				
				//get Skills associated stat
				public String getNatureStat() {
					return this.natureStat;
				}

//----------Religion
				
				//String
				public void setReligion(String att) {
					this.religion = att;
				}
				public void setReligion(int att) {
					this.religion = Integer.toString(att);
				}
				
				//get string
				public String getReligionStr() {
					return this.religion;
				}
				
				//get integer
				public int getReligionInt() {
					return Integer.parseInt(this.religion);
				}
				
				//get Skills associated stat
				public String getReligionStat() {
					return this.religionStat;
				}
				
//----------animalHandling
				
				//String
				public void setAnimalHandling(String att) {
					this.animalHandling = att;
				}
				public void setAnimalHandling(int att) {
					this.animalHandling = Integer.toString(att);
				}
				
				//get string
				public String getAnimalHandlingStr() {
					return this.animalHandling;
				}
				
				//get integer
				public int getAnimalHandlingInt() {
					return Integer.parseInt(this.animalHandling);
				}	
				
				//get Skills associated stat
				public String getAnimalHandlingStat() {
					return this.animalHandlingStat;
				}
				
//----------insight
				
				//String
				public void setInsight(String att) {
					this.insight = att;
				}
				public void setInsight(int att) {
					this.insight = Integer.toString(att);
				}
				
				//get string
				public String getInsightStr() {
					return this.insight;
				}
				
				//get integer
				public int getInsightInt() {
					return Integer.parseInt(this.insight);
				}
				
				//get Skills associated stat
				public String getInsightStat() {
					return this.insightStat;
				}
								
//----------medicine
				
				//String
				public void setMedicine(String att) {
					this.medicine = att;
				}
				public void setMedicine(int att) {
					this.medicine = Integer.toString(att);
				}
				
				//get string
				public String getMedicineStr() {
					return this.medicine;
				}
				
				//get integer
				public int getMedicineInt() {
					return Integer.parseInt(this.medicine);
				}	
				
				//get Skills associated stat
				public String getMedicineStat() {
					return this.medicineStat;
				}
				
//----------perception
				
				//String
				public void setPerception(String att) {
					this.perception = att;
				}
				public void setPerception(int att) {
					this.perception = Integer.toString(att);
				}
				
				//get string
				public String getPerceptionStr() {
					return this.perception;
				}
				
				//get integer
				public int getPerceptionInt() {
					return Integer.parseInt(this.perception);
				}	
				
				//get Skills associated stat
				public String getPerceptionStat() {
					return this.perceptionStat;
				}

//----------survival
				
				//String
				public void setSurvival(String att) {
					this.survival = att;
				}
				public void setSurvival(int att) {
					this.survival = Integer.toString(att);
				}
				
				//get string
				public String getSurvivalStr() {
					return this.survival;
				}
				
				//get integer
				public int getSurvivalInt() {
					return Integer.parseInt(this.survival);
				}
				
				//get Skills associated stat
				public String getSurvivalStat() {
					return this.survivalStat;
				}

//----------deception
				
				//String
				public void setDeception(String att) {
					this.deception = att;
				}
				public void setDeception(int att) {
					this.deception = Integer.toString(att);
				}
				
				//get string
				public String getDeceptionStr() {
					return this.deception;
				}
				
				//get integer
				public int getDeceptionInt() {
					return Integer.parseInt(this.deception);
				}
				
				//get Skills associated stat
				public String getDeceptionStat() {
					return this.deceptionStat;
				}
				
//----------intimidation
				
				//String
				public void setIntimidation(String att) {
					this.intimidation = att;
				}
				public void setIntimidation(int att) {
					this.intimidation = Integer.toString(att);
				}
				
				//get string
				public String getIntimidationStr() {
					return this.intimidation;
				}
				
				//get integer
				public int getIntimidationInt() {
					return Integer.parseInt(this.intimidation);
				}
				
				//get Skills associated stat
				public String getIntimidationStat() {
					return this.intimidationStat;
				}

//----------performance
				
				//String
				public void setPerformance(String att) {
					this.performance = att;
				}
				public void setPerformance(int att) {
					this.performance = Integer.toString(att);
				}
				
				//get string
				public String getPerformanceStr() {
					return this.performance;
				}
				
				//get integer
				public int getPerformanceInt() {
					return Integer.parseInt(this.performance);
				}
				
				//get Skills associated stat
				public String getPerformanceStat() {
					return this.performanceStat;
				}
				
//----------persuasion
				
				//String
				public void setPersuasion(String att) {
					this.persuasion = att;
				}
				public void setPersuasion(int att) {
					this.persuasion = Integer.toString(att);
				}
				
				//get string
				public String getPersuasionStr() {
					return this.persuasion;
				}
				
				//get integer
				public int getPersuasionInt() {
					return Integer.parseInt(this.persuasion);
				}	
				
				//get Skills associated stat
				public String getPersuasionStat() {
					return this.persuasionStat;
				}
				
				
				
//-----------------Save File
				
				//set save file
				public void setSaveFileName(String att) {
					this.saveFileName = att;
				}
				
				//get save filename
				public String getSaveFileName() {
					return this.saveFileName;
				}
				
				
		
		
		// Character sheet output string
		public String toString() {
			return this.name + ","+
					this.AC + "," + this.maxHP + "," +
						this.currentHP + "," 
					
						+ this.weapon1 + "," 
						+ this.weapon2 + "," 
						+ this.weapon3 + "," 
						+ this.armour + ","
						+ this.shield + ","
						
						+
						
					
					this.strength + "," + this.dexterity + "," +
					this.constitution + "," + this.intelligence + "," +	
					  this.wisdom + "," + this.charisma + "," +
					  
					  this.athletics + "," + 
					   this.acrobatics + "," + 
					    this.sleightOfHand + "," + 
						this.stealth + "," + 	
						 this.arcana + "," + 
						  this.history + "," + 
						 this.investigation + "," +
						  this.nature + "," + 
						  this.religion + "," + 
						   this.animalHandling + "," + 
						   this.insight + "," +	
						    this.medicine + "," + 
						    this.perception + ","+ 
							this.survival + "," +
						    this.deception + "," + 
						     this.intimidation + "," + 
							  this.performance + "," + 
						       this.persuasion + "," +
						       this.saveFileName + ","
						       ;
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
