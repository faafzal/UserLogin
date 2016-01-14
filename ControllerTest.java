package userlogin;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * JUnit test for controller class
 * @author fafzal
 *
 */
public class ControllerTest {

	/*
	 * create the objects
	 */
	Model myModel = new Model();
	View myView = new View();
	Controller myController = new Controller(myModel, myView);
	
	/*
	 * this will test the login for success
	 */
	@Test
	public void testLoginSuccess() {
		
		//set username as user 1
		myController.setUsername("user1");
		
		//set password as pass 1
		myController.setPassword("pass1");
		
		//call login function
		myController.login();
		
		//run the test
		assertEquals(myController.getSuccess(), true);
	}
	
	/*
	 * this will test the login to see if it is invalid
	 */
	@Test
	public void testLoginInvalid() {
		
		//set username to user1
		myController.setUsername("user1");
		
		//set password to wrong password
		myController.setPassword("dkashhf");
		
		//call login function
		myController.login();
		
		//run the test
		assertEquals(myController.getInvalid(), true);
	}
	
	
	/*
	 * test login function for non registered user
	 */
	@Test
	public void testLoginNotRegistered() {
		
		//set username to random user
		myController.setUsername("user124");
		
		//set password to pass
		myController.setPassword("pass");
		
		//call login function
		myController.login();
		
		//run the test
		assertEquals(myController.getNotRegistered(), true);
	}

}
