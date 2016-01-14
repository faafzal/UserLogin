package userlogin;

/**
 * 
 * This is the Model class. It has the database information. In this case,
 * the database is a 2D array.
 * 
 * @author fafzal
 *
 */

public class Model {
	
	//initialize databaseArray
	private String[][] databaseArray;

	/* 
	 * create the 2D array in constructor so that it creates the database
	 * when the Model object is created.
	 */
	public Model(){
		
		// The database array is a 10 x 2 array.
		this.databaseArray = new String[10][2];
		
		//loops through the array to add values
		for(int i = 0; i < this.databaseArray.length; i++){
			
			//this function adds 1 to i so that the array creates users from 1 to 10
			int count = i+1;
			
			//databaseArray[i][0] will store the usernames
			this.databaseArray[i][0] = "user" + count;
			
			//databaseArray[i][1] will store the passwords
			this.databaseArray[i][1] = "pass" + count;
		
		}
		
	}
	
	//getter for the database array
	public String[][] getDatabaseArray(){
		
		return this.databaseArray;
		
	}
	
	
}
