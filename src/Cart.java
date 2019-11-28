
/**
 * The Cart class provides the structure to hold line items from
 * one account holder. It is used when an account holder adds a line
 * item to their cart. When the order is confirmed, all the 
 * line items in the cart will be submitted to the purchase order.
 * 
 * The Cart class is responsible for the following:
 * - fromAccount: Boolean
 * - createSaleOrder: void
 * 
 * An Account object will have at most one Cart object. An Invoice
 * object will associate itself with only one Cart object.
 * 
 * @author Vezorla
 *
 */
public class Cart {
	
	/**
	 * This method determines if the cart is associated with the account.
	 * If true, the cart has at least one item from an account. If false,
	 * then the cart is empty.
	 * 
	 * @return boolean If the cart is from the account.
	 */
	private boolean fromAccount() {
		
		return false;
		
	}
	
	/**
	 * Creates a sale order for the cart object.
	 */
	private void createSaleOrder() {
		
		
		
	}

}
