
/**
 * The LineItem class contains the information regarding a line item within
 * the system. The line item is used to display what products are in a cart.
 * 
 * This class has the following responsibilities:
 * - quantity: int (number of product)
 * - extendedCost: float
 * 
 * The class directly interacts with the Cart and the Lot classes as each line item
 * must be displayed from the cart and will have a Lot associated with it upon
 * confirmation of purchase.
 * 
 * @author Vezorla
 *
 */
public class LineItem {
	
	/**
	 * The total number of a specific LineItem.
	 */
	private int quantity;
	
	/**
	 * The extended cost of a LineItem.
	 */
	private float extendedCost;

}
