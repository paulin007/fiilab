package factoryMethod;

/**
 * 
 * @author Alessandro
 */
public class Product {

	private int productId;

	/**
	 * @param productId
	 */
	public Product(int productId) {
		super();
		this.productId = productId;
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
	
}
