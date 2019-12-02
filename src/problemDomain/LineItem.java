package problemDomain;
import java.util.Currency;

/**
 * The LineItem class contains the information regarding a line item within
 * an order. The line item is used to display what products are in a cart.
 * 
 * This class has the following responsibilities:
 * - lineNum
 * - quantity
 * - extendedCost
 * - currentName - Copy of product name if the name changes. Ensures it 
 * 				   does not change for the LineItem. 
 * - currentPrice - Copy of product price if the price changes.Ensures it 
 * 				   does not change for the LineItem.  
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
	 * lot is a Lot that the
	 * LineItem is pulling product from. 
	 */
	private Lot lot;
	/**
	 * quantity is the quantity of the product
	 * being sold.  
	 */
	private int quantity;
	/**
	 * A copy of the product name. 
	 */
	private String currenName;
	/**
	 * A copy of the current price of the
	 * product. 
	 */
	private Currency currentPrice;
	
	/**
	 * Method to calculate the extended price
	 * for the LineItem. 
	 * @return Currency the value of the 
	 * extended price. 
	 */
	public Currency calcExtendedPrice() {
		Currency extendedPrice = null;
		return extendedPrice;
	}
}
