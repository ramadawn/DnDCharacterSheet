package com.info3245.gamemasterutility;

import android.content.Context;
import android.widget.Toast;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors


public class Save {
		public static void saveSheet(CharacterSheet character, Context context)  {
			
			String output = character.toString();
			String path = character.getSaveFileName();
			
			
			try {
			      FileWriter myWriter = new FileWriter(path);
			      myWriter.write(output);
			      myWriter.close();
			      Toast.makeText(context,"Save SUCCESS",Toast.LENGTH_LONG).show();
			    } catch (IOException e) {
					Toast.makeText(context,"Save FAILED",Toast.LENGTH_LONG).show();
					e.printStackTrace();
			    }
			}
		}	


