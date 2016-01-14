package userlogin;

/**
 * Controller Class. It is the glue between the view and the model.
 * @author fafzal
 *
 */
public class Controller {
	
	/*
	 * initializing all the variables
	 */
	private Model model = null;
	private View view = null;
	private String username = "";
	private String password = "";
	private boolean success = false;
	private boolean invalid = false;
	private boolean notRegistered = false;
	
	/*
	 * Constructor takes the model object and the view object as the input.
	 */
	public Controller(Model model, View view){
		
		this.setModel(model);
		this.setView(view);
		
	}
	
	
	/*
	 * This is the login function. It loops through the database array
	 * to see if there is a match between the username and password. If
	 * there is, it will set the success variable to true. If the username exists
	 * but the password is wrong it sets invalid to true. If username does not
	 * exist, the notRegistered value will be set to true.
	 */
	public void login(){
		
		/*
		 * Starts by setting variables to false
		 */
		this.setSuccess(false);
		this.setInvalid(false);
		this.setNotRegistered(false);
		
		/*
		 * Loops through the database array to see which values to assign.
		 * database array i 0 represents each username, i 1 represents password.
		 */
		for(int i = 0; i < getModel().getDatabaseArray().length; i++){

			if(this.getUsername().equals(getModel().getDatabaseArray()[i][0])){
				
				if(this.getPassword().equals(getModel().getDatabaseArray()[i][1])){
					
					this.setSuccess(true);
					
				}else{
					
					this.setInvalid(true);
					
				}
				
			}else{
				
				this.setNotRegistered(true);
				
			}
				
		}
		
	}
	
	/*
	 * This method updates the view by calling the relevant functions in the
	 * view.
	 */
	public void updateView(){
		
		/*
		 * It chooses the view based on the value that was set by
		 * the login function
		 */
		if(this.getSuccess() == true){
			
			this.getView().printSuccessMessage(this.getUsername());
			
		}else if(this.getInvalid() == true){
			
			this.getView().printInvalidMessage();
			
		}else if (this.getNotRegistered() == true){
			
			this.getView().printNotRegistered(this.getUsername());
			
		}
		
	}
	
	/*
	 * setters and getters below
	 */
	public void setNotRegistered(boolean n){
		
		this.notRegistered = n;
		
	}
	
	public boolean getNotRegistered(){
		
		return this.notRegistered;
		
	}
	
	public void setInvalid(boolean i){
		
		this.invalid = i;
		
	}
	
	public boolean getInvalid(){
		
		return this.invalid;
		
	}
	
	
	public void setSuccess(boolean s){
		
		this.success = s;
		
	}
	
	public boolean getSuccess(){
		
		return this.success;
		
	}
	
	public void setUsername(String u){
		
		this.username = u;
		
	}
	
	public String getUsername(){
		
		return this.username;
		
	}
	
	public void setPassword(String p){
		
		this.password = p;

	}
	
	public String getPassword(){
		
		return this.password;
		
	}
	
	public void setModel(Model m){
		
		this.model = m;
		
	}
	
	public Model getModel(){
		
		return this.model;
				
	}
	
	public void setView(View v){
		
		this.view = v;
		
	}
	
	public View getView(){
		
		return this.view;
		
	}
}
