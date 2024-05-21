package e_commerce;

public class Product {

	private int productid;
	private String productName;
	private int productPrice;
	private int productQuantity;
	private String productCategory;
	
	//constructor to initialise the private variable--------------------------------------------
	
	public Product(int productid, String productName, int  productPrice, int productQuantity, String productCategory) {
        this.productid = productid;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productCategory = productCategory;
    }
	
	//getter method---------------------------------------------------------------
	
	public int getproductid()
	{
		return productid;
	}
	public String  getproductName()
	{
		return productName;
	}
	public int getproductPrice()
	{
		return productPrice;
	}
	public int getproductQuantity()
	{
		return productQuantity;
	}
	public String getproductCategory()
	{
		return productCategory;
	}
	
	// setter method-----------------------------------------------------------------------
	
	public void setproductid(int productid )
	{
		if (productid > 0) 
		{
	        this.productid = productid;         // if the product id is valid 
	    }
		else
		{
			System.out.println("The product is not valid");
		}
	}
	
	public void setproductName(String productName)
	{
		if(productName !=null)
		{
			this.productName = productName;
		}
		else
		{
			System.out.println("The product name  is not  valid");
		}
		
	}
	
	public void setproductPrice(int productPrice )
	{
		if(productPrice > 0)
		{
			this.productPrice = productPrice;
		}
		else
		{
			System.out.println("The product price is not  valid");
		}
	}
	
	public void setproductQuantity(int productQuantity)
	{
		if(productQuantity > 0)
		{
			this.productQuantity = productQuantity;
		}
		else
		{
			System.out.println("The product Quantity  is not  valid");

		}
	}
	
	public void setproductCategory(String productCategory)
	{
		if(productCategory !=null)
		{
			this.productCategory = productCategory;
		}
		else
		{
			System.out.println("The product category  is not  valid");
		}
		
	}
	
	// methods 
	
	public String getProductDetails() 
	{
        return "Product id: " + productid + ", productName:" + productName + ", productPrice:" + productPrice + ",productQuantity: " + productQuantity + ",productCategory: " + productCategory;
    }
	
	public void updateQuantity(int newQuantity)
	{
        setproductQuantity(newQuantity);
    }
	
	public void updatePrice(int newPrice) 
	{
        setproductPrice(newPrice);
    }
}

  
	
	

	
	
	
	
	
	

