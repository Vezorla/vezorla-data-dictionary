package problemDomain;

import java.util.Currency;

/**
 * ProductQuantity has the responsibility of 
 * holding a product and a quantity for that product. 
 * 
 * The quantity may be the total quantity from an invoice, 
 * or the total quantity of that product in inventory. 
 * 
 * The responsiblites are:
 * - product
 * - quantity
 * - cost 
 * - price
 * - calcPercentMargin
 * @author Vezorla
 *
 */
public class ProductQuantity {
	
	/**
	 * product is a Product object 
	 * to represent what product we 
	 * are working with. 
	 */
	private Product product;
	/**
	 * quantity is the quantity for the
	 * product. This could be a quantity 
	 * from an invoice or from the 
	 * inventory. 
	 */
	private int quantity;
	/**
	 * cost is a Currency object for the
	 * cost of the product. 
	 */
	private Currency cost;
	/**
	 * price is a Currency object for the price
	 * of the product. 
	 */
	private Currency price;
	
	/**
	 * Method to calculate the percentMargin 
	 * of the product. This is calculated by
	 * taking the cost/price * 100. 
	 * @return float for the percent margin. 
	 */
	public float calcPercentMargin() {
		float percentMargin = -1;
		return percentMargin;
	}
	

}
