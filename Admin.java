package e_commerce;


public class Admin extends User {
    public Admin(int userId, String username, String password, String email) {
        super(userId, username, password, email);
    }

    @Override
    public void viewProfile() {
        System.out.println("Admin Profile - Username: " + getusername() + ", Email: " + getuseremail());
    }

    @Override
    public void updateProfile(String newusername, String newpassword, String newemail) {
        System.out.println("Updating profile for " + getusername());
        
        System.out.println("Profile updated.");
    }

    public void addProduct(Product product) {
        System.out.println("Product " + product.getproductName() + " added.");
    }

    public void removeProduct(Product product) {
        System.out.println("Product " + product.getproductName() + " removed.");
    }

    public void updateProduct(Product product) {
        System.out.println("Product " + product.getproductName() + " updated.");
    }
}