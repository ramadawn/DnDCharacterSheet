//Class for creating a character sheet object
public class CharacterSheet {

		//Basic character sheet values
		private String name = "";
		private String strength = "";
		private String dexterity = "";
		private String constitution = "";
		private String intelligence = "";
		private String wisdom = "";
		private String charisma = "";
		
		public CharacterSheet() {
		}
		
		public CharacterSheet(String aName, String aStrength, String aDexterity, 
								String aConstitution, String aIntelligence,
								String aWisdom, String aCharisma) {
			name = aName;
			strength = aStrength;
			dexterity = aDexterity;
			constitution = aConstitution;
			intelligence = aIntelligence;
			wisdom = aWisdom;
			charisma = aCharisma;
		}
		
		public void setName(String newName) {
			this.name = newName;
		}
		
		public void setStrength(String newStr) {
			this.strength = newStr;
		}
		
		public void setDexterity(String newDex) {
			this.dexterity = newDex;
		}
		
		public void setConstitution(String newCon) {
			this.constitution = newCon;
		}
		
		public void setIntelligence(String newInt) {
			this.intelligence = newInt;
		}
		
		public void setWisdom(String newWis) {
			this.wisdom = newWis;
		}
		
		public void setCharisma(String newCha) {
			this.charisma = newCha;
		}
		
		public String toString() {
			return this.name + ","+
					this.strength + "," + this.dexterity + "," +
					this.constitution + "," + this.intelligence + "," +	
					  this.wisdom + "," + this.charisma + ",";
		}
		
		
}
