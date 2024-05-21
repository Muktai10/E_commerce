package e_commerce;


public class LoginSystem {
    private User[] users;
    private int userCount;
    private User loggedInUser;

    public LoginSystem() {
        users = new User[20]; 
        userCount = 0;
        loggedInUser = null;
    }

    public void register(User user) {
        if (userCount < users.length) {
            users[userCount++] = user;
            System.out.println("User " + user.getusername() + " registered successfully.");
        } else {
            System.out.println("User limit reached. Cannot register more users.");
        }
    }

    public void login(String username, String password) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getusername().equals(username) && users[i].getpassword().equals(password)) 
            {
                loggedInUser = users[i];
                loggedInUser.login();
                return;
            }
        }
        System.out.println("Invalid username or password.");
    }

    public void logout() {
        if (loggedInUser != null) {
            loggedInUser.logout();
            loggedInUser = null;
        } else {
            System.out.println("No user is currently logged in.");
        }
    }

    public User getLoggedInUser() {
        return loggedInUser;
    }

    public boolean isAdmin() {
        return loggedInUser instanceof Admin;
    }

    public boolean isCustomer() {
        return loggedInUser instanceof customer;
    }
}