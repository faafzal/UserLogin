package userlogin;

import java.util.Scanner;

/**
 * 
 * This is the Main Driver for UserLoginMVC
 * It asks the user for username and password, then checks to see if
 * the login was successful. It prints the correct message using the
 * MVC framework. 
 * 
 * One thing to note. The Database Array has users stored from 1 to 10. 
 * The user name Goes from user1 to user10. The passwords go from pass1
 * to pass10 and correspond to the user number. user1 and pass1 will be successful
 * @author fafzal
 *
 */

public class UserLoginMVC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner object to take user input
		Scanner scanner = new Scanner(System.in);
		
		//create a Model object
		Model myModel = new Model();
		
		//create a View object
		View myView = new View();
		
		//create a Controller object
		Controller myController = new Controller(myModel, myView);
		
		//initialize variables
		String user = "";
		String pass = "";
		
		//ask for username
		System.out.println("Username:");
		
		//store user input
		user = scanner.nextLine();
		
		//ask for password
		System.out.println("Password:");
		
		//store password entered
		pass = scanner.nextLine();
		
		//set the username to the user input
		myController.setUsername(user);
		
		//set the password to the password entered
		myController.setPassword(pass);
		
		//call the login function
		myController.login();
		
		//update view
		myController.updateView();
		
	}

}
