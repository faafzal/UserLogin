package userlogin;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * JUnit test for MyModel
 * @author fafzal
 *
 */
public class ModelTest {
	//create a Model object
	Model myModel = new Model();
	
	/*
	 * testing the database array
	 */
	@Test
	public void testDatabaseArray() {
		//assert to see if the database array has the correct values.
		assertArrayEquals(myModel.getDatabaseArray(), new String[][]{{"user1", "pass1"},
			{"user2", "pass2"}, {"user3", "pass3"}, {"user4", "pass4"}, {"user5", "pass5"},
			{"user6", "pass6"}, {"user7", "pass7"},{"user8", "pass8"}, {"user9", "pass9"},
			{"user10", "pass10"}
		});
	}
}
