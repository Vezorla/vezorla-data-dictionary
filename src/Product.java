
/**
 * The Product class contains the data for a Product within the system.
 * The product is the main asset that Vezorla will sell and manage within 
 * the inventory management, transaction, warehouse, cart, inventory, and 
 * invoice subsystems.
 * 
 * This class has the following responsibilities:
 * - prodID: int
 * - name: String
 * - description: String
 * - image: String
 * 
 * The Product class directly associates with the Lot and the Inventory classes.
 * 
 * @author Vezorla
 *
 */
public class Product {
	/**
	 * prodID to uniquely identify 
	 * the product. 
	 */
	private int prodID;
	/**
	 * name is the name of the product. 
	 */
	private String name;
	/**
	 * description is the further details
	 * about the product. 
	 */
	private String description;
	/**
	 * image is the path to an image that
	 * shows the product.  
	 */
	private String image;

}
