


public class Save {
		
		
		public static void writeFileOnInternalStorage(CharacterSheet character){      
		    
			
			String output = character.toString();
			String path = character.getSaveFileName();
			FileOutputStream fos = null;
			
			
			try {
				fos = openFileOutput(path, MODE_PRIVATE);
		        fos.write(output.getBytes());
				Toast.makeText(context:this, "Saved to" + getFilesDir() + "/" + path, Toast.LENGTH_LONG).show();
		    } catch (FileNotFoundException e){
		    	System.out.println("Character Save Error");
		        e.printStackTrace();
		    } catch (IOException e) {
		    	e.printStackTrace();
		    } finally {
		    	if(fos != null) {
		    		try {
		    			fos.close();
		    		}catch(IOException e) {
		    			e.printStackTrace();
		    		}
		    	}
		    }
		}
		    
		  
		}	


