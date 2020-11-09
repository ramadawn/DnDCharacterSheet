
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Load {
	
	public static void loadSheet(CharacterSheet character)  {
	
		String path = "save.txt";
		String data;
		
	
		try {
			//loads save file and converts contents into list 
			List<String> lines = Files.readAllLines(Paths.get(path));
		     data = lines.toString();
			 System.out.println("Sheet Loaded");
			 data = data.substring(1, data.length() - 1);
			 List<String> statList = new ArrayList<String>(Arrays.asList(data.split(",")));
		     
		    character.setName(statList.get(0));
		    character.setStrength(statList.get(1));
		    character.setDexterity(statList.get(2));
		    character.setConstitution(statList.get(3));
		    character.setIntelligence(statList.get(4));
		    character.setWisdom(statList.get(5));
		    character.setCharisma(statList.get(6));
		    
		    System.out.print(character.toString());
		       
		    } catch (IOException e) {
		      System.out.println("Cannot Find File");
		      e.printStackTrace();
		    }
		
		
	
	}	

}
