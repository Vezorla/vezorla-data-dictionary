package problemDomain;
import java.util.Currency;
import java.util.Date;

/**
 * This Invoice class contains all the attributes and methods regarding
 * the an Invoice. The Invoice class interacts with the Cart to create an invoice object.
 * 
 * The Invoice class is responsible for the following:
 * - invoiceNum
 * - date
 * - shipped
 * - shippingCost
 * - state
 * - message
 * - calcSubtotal
 * - calcTaxes
 * - calcTotal
 * 
 * Note that this class does not directly interact with the PurchaseOrder
 * class or the Lot class.
 * 
 * @author Vezorla
 *
 */
public class Invoice {
	
	/**
	 * invoiceNum is an int for the
	 * unique invoice. 
	 */
	private int invoiceNum;
	/**
	 * date is a Date object for the
	 * Date of the invoice. 
	 */
	private Date date;
	/**
	 * shipped is a boolean of true
	 * if the products of the invoice 
	 * have been shipped. Otherwise 
	 * this value is false. 
	 */
	private boolean shipped;
	/**
	 * shippingCost is a Currency of 
	 * how much shipping cost to ship
	 * the product to the customer or client. 
	 */
	private Currency shippingCost;
	/**
	 * state is a String showing either
	 * an "Open", "Closed", or "Cancelled" state. If the 
	 * state is open, the invoice can still be
	 * adjusted. If it's in the closed state, 
	 * the invoice can not be adjusted. 
	 */
	private String state;
	/**
	 * message is a String for a message
	 * on the invoice from the admin if the 
	 * invoice has been cancelled. 
	 * 
	 */
	private String message;
	
	/**
	 * Method to calculate the subtotal
	 * on the invoice. This is the sum 
	 * of all the extended prices. 
	 * @return Currency the value 
	 * of the subtotal. 
	 */
	public Currency calcSubtotal() {
		Currency subtotal = null;
		return subtotal;
	}
	
	/**
	 * Method to calculate the taxes that
	 * is applied to the invoice. 
	 * @return Currency the value of the
	 * taxes. 
	 */
	public Currency calcTaxes() {
		Currency taxes = null;
		return taxes;
	}
	
	/**
	 * Method to caculate the total
	 * of the invoice.  This includes the
	 * subtotal + the taxes. 
	 * @return Currency the value of the
	 * total of the invoice. 
	 */
	public Currency calcTotal() {
		Currency total = null;
		return total;
	}

}
