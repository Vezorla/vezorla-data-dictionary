/**
 * Invoice Report is to calculate information
 * from ProductQuanity. 
 * 
 * It has the following responsibilities:
 * - calcTotalCost()
 * - calcTotalPrice()
 * - caclTotalPercentMargin()
 * 
 * These are associated with a single invoice.  
 */
package problemDomain;

import java.util.Currency;
import java.util.List;

public class InvoiceReport {
	
	/**
	 * productQuantities is a list of products and 
	 * a quantity associated with it. 
	 */
	private List<ProductQuantity> productQuantities;
	/**
	 * Method to calculate the total cost of all the
	 * elements in productQuantities. 
	 * @return Currency the value of the total cost. 
	 */
	public Currency calcTotalCost() {
		Currency totalCost = null;
		return totalCost;
	}
	
	/**
	 * Method to calculate the total price of all the
	 * elements in productQuantities.
	 * @return Currency the value of the total price. 
	 */
	public Currency calcTotalPrice() {
		Currency totalPrice = null;
		return totalPrice;
	}
	
	/**
	 * Method to calculate the total percent margin of 
	 * all the elements in productQuantities. 
	 * @return Currency the value of the total percent margin. 
	 */
	public Currency calcTotalPercentMargin() {
		Currency totalPercentMargin = null;
		return totalPercentMargin;
	}

}
