import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors


public class Save {
		public static void saveSheet(CharacterSheet character)  {
			
			String output = character.toString();
			String path = character.getSaveFileName();
			
			
			try {
			      FileWriter myWriter = new FileWriter(path);
			      myWriter.write(output);
			      myWriter.close();
			      System.out.println("Successfully saved character sheet");
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			

			
			}
		    
		  
		}	


