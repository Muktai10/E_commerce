package e_commerce;

	public class main {
	   
	    	 public static void main(String[] args) {
	    	        
	    	        LoginSystem loginSystem = new LoginSystem();

	    	        
	    	        customer customer1 = new customer(1, "Radha_pass", "Radha123", "radha@123.com");
	    	        Admin admin1 = new Admin(2, "Muktai", "Muktaipass", "muktai@123.com");

	    	        
	    	        loginSystem.register(customer1);
	    	        loginSystem.register(admin1);

	    	        
	    	        Product product1 = new Product(1, "furniture", 1000, 10, "Homeappliancec");
	    	        Product product2 = new Product(2, "TV", 500, 20, "Homeappliances");

	    	        
	    	        loginSystem.login("Muktai", "Muktaipass");
	    	        if (loginSystem.isAdmin()) {
	    	            Admin admin = (Admin) loginSystem.getLoggedInUser();
	    	            admin.addProduct(product1);
	    	            admin.addProduct(product2);
	    	            admin.updateProduct(product1);
	    	        }
	    	        loginSystem.logout();

	    	        
	    	        loginSystem.login("Radha_pass", "Radha123");
	    	        if (loginSystem.isCustomer()) {
	    	            customer customer = (customer) loginSystem.getLoggedInUser();
	    	            customer.viewProfile();
	    	            customer.addToCart(product1);
	    	            customer.addToCart(product2);
	    	            customer.checkout();

	    	            
	    	            Product[] orderedProducts = { product1, product2 };
	    	            Order order = new Order(1, customer.getuserid(), orderedProducts);
	    	            order.placeOrder();
	    	            order.trackOrder();
	    	            order.cancelOrder();
	    	        }
	    	        loginSystem.logout();
	    	    }
	    	}