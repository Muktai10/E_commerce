package e_commerce;

public abstract class User {

	private int userid;
	private String  username;
	private String password;
	private String email;
	
	//parameterised constructor to initialise the private variable
	
	public User(int userid,String username,String password,String email)
	{
		this.userid=userid;
		this.username=username;
		this.password = password;
		this.email = email;
	}
	
	//getter method------------------------------------------------
	
	public int getuserid()
	{
		return userid;
	}
	public String getusername()
	{
		return username;
	}
	public String getpassword()
	{
		return password;
	}
	public String getuseremail()
	{
		return email;
	}
	
	//setter method-----------------------------------------------
	
	 
	public void setuserid(int userid)
	{
		if(userid >0) 
		{
		    this.userid=userid;
		}
		else
		{
			System.out.println("The userid is Wrong");
		}
	}
	
	public void setusername(String username)
	{
		if(username !=null)
		{
			this.username = username;
		}
		else
		{
			System.out.println("The username is wrong");
		}
	}
	
	public void setpassword(String password)
	{
		 if (password != null && password.length() >= 8)
		 {
	            this.password = password;
	     } 
		 else
		 {
			 System.out.println("The password is wrong");
		 }
	}
	
	public void setemail(String email)
	{
		if(email!=null)
		{
			this.email = email;
		}
		else
		{
			System.out.println("The email is wrong");
		}
	}
	
	
	// abstract method-------------------------------------
	
	public abstract void viewProfile();

    public abstract void updateProfile(String newUsername,String newemail, String newpassword);
    
    
    public void login() {
        System.out.println(username + " logged in.");
    }

    public void logout() {
        System.out.println(username + " logged out.");
    }
	
}
