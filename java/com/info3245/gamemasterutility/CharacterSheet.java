//Class for creating a character sheet object
public class CharacterSheet {

		//Basic character sheet values
	
		//Character attributes
		private String name = "0";
		private String strength = "0";
		private String dexterity = "0";
		private String constitution = "0";
		private String intelligence = "0";
		private String wisdom = "0";
		private String charisma = "0";
		
		//Character skills
		
		//Strength
		private String athletics = "0";
		
		//Dexterity
		
		private String acrobatics = "0";
		private String sleightOfHand = "0";
		private String stealth = "0";
		
		//Intelligence 
		private String arcana = "0";
		private String history = "0";
		private String investigation = "0";
		private String nature = "0";
		private String religion = "0";
		
		//wisdom
		private String animalHandling = "0";
		private String insight = "0";
		private String medicine = "0";
		private String perception = "0";
		private String survival = "0";
		
		// Charisma
		
		private String deception = "0";
		private String intimidation = "0";
		private String performance = "0";
		private String persuasion = "0";
		
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
		
		//Get and Set Anme
		
		public void setName(String newName) {
			this.name = newName;
		}
		
		public String getName() {
			return this.name;
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
				
				
		//SKILL getter and setters
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
				
//----------acrobatics
				
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
				
				
				
			
				
				
		
		
		// Character sheet output string
		public String toString() {
			return this.name + ","+
					this.strength + "," + this.dexterity + "," +
					this.constitution + "," + this.intelligence + "," +	
					  this.wisdom + "," + this.charisma + "," +
					  this.athletics + "," + this.acrobatics + "," +
						this.sleightOfHand + "," + this.stealth + "," +	
						  this.arcana + "," + this.history + "," +
						  this.religion + "," + this.nature + "," +
							this.animalHandling + "," + this.insight + "," +	
							  this.medicine + "," + this.perception + ","+
							  	this.deception + "," + this.intimidation + "," +	
							  		this.performance + "," + this.persuasion + ",";
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
