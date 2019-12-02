package problemDomain;
import java.util.Currency;
import java.util.List;

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
	 * discounts is a list of
	 * the current Discounts 
	 * associated with the product. 
	 */
	private List<Discount> discounts;
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
	/**
	 * active is a boolean indicating
	 * if the product is an active product
	 * at Vezorla. If the product is 
	 * not active (not being bought or 
	 * sold) this value will be false. 
	 */
	private boolean active;
	/**
	 * threshold is an int representing
	 * the min number of product that 
	 * should be in inventory. 
	 */
	private int threshold;
	/**
	 * price is a Currency that
	 * holds the the price of
	 * the product.
	 */
	private Currency price;

}
