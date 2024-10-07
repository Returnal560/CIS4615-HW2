package cis4615_HW2;

public class R07_ERR00_J {

	boolean validFlag = false;
	do {
  		try {
    			// ...
    			// If requested file does not exist, throws FileNotFoundException
    			// If requested file exists, sets validFlag to true
    			validFlag = true;
  		} catch (FileNotFoundException e) {
    			// Ask the user for a different file name
  		}
	} while (validFlag != true);
	// Use the file
	
}
