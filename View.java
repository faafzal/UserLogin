package userlogin;

/**
 * This is the View class. It creates the view using print line statements.
 * @author fafzal
 *
 */
public class View {
	
	/*
	 * The function below prints a success the message,
	 *  if the user entered the correct information.
	 */
	public void printSuccessMessage(String user){
		
		System.out.println("Welcome, " + user + ".");
		System.out.println("You have successfully logged in.");
		
	}
	
	/*
	 * The function below prints an invalid message.
	 * The password is incorrect.
	 */
	public void printInvalidMessage(){
		
		System.out.println("Sorry, the password is incorrect.");
		
	}
	
	/*
	 * The function below says that the username entered
	 * is not a registered user.
	 */
	public void printNotRegistered(String user){
		
		System.out.println(user +" is not a registered user.");
		
	}
	

}
