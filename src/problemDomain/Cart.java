package problemDomain;
import java.util.Currency;

/**
 * The Cart class provides the structure to hold line items from
 * one account holder. It is used when an account holder adds a line
 * item to their cart. When the order is confirmed, all the 
 * line items in the cart will be submitted to the Invoice.
 * 
 * The Cart class is responsible for the following:
 * - orderNum
 * - fromAccount
 * - calculateTotalDiscount
 * 
 * An Account object will have at most one Cart object. An Invoice
 * object will associate itself with only one Cart object.
 * 
 * @author Vezorla
 *
 */
public class Cart {
	
	/**
	 * orderNum is an int for the order number.
	 * This is generated when an item is added to
	 * an empty cart. 
	 */
	private int orderNum;
	
	/**
	 * This method determines if the cart is associated with the account.
	 * If true, the cart is associated with an account holder.  If false,
	 * then the cart is associated with a buyer who does not wish to 
	 * create an account.
	 * 
	 * @return boolean If the cart is from an account.
	 */
	private boolean fromAccount() {
		
		return false;
		
	}

	/**
	 * Method to calculate the monetary value of the 
	 * discount(s) applied to the order.  
	 * @return Currency the value of the discounts. 
	 */
	private Currency calculateTotalDiscount() {
		Currency totalDiscounts = null;
		return totalDiscounts;
		
	}

}
