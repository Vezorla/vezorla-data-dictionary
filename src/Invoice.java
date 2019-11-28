import java.util.Date;

/**
 * This Invoice class contains all the attributes and methods regarding
 * the creation of an Invoice. The Invoice class interacts with the Cart
 * and the Transaction classes to create an invoice object.
 * 
 * The Invoice class is responsible for the following:
 * - invoiceNum: int
 * - date: Date
 * - orderNum: int
 * - email: String
 * - address: String
 * - shipped: boolean
 * 
 * Note that this class does not directly interact with the PurchaseOrder
 * class or the Lot class.
 * 
 * @author Vezorla
 *
 */
public class Invoice {
	
	/**
	 * The invoice number; unique identifier.
	 */
	private int invoiceNum;
	
	/**
	 * The date the invoice was created.
	 */
	private Date date;
	
	/**
	 * The order number associated with the Invoice.
	 */
	private int orderNum;
	
	/**
	 * The email address of the account holder who created the Invoice.
	 */
	private String email;
	
	/**
	 * The physical address of the account holder.
	 */
	private String address;
	
	/**
	 * Determines if the order has been shipped or not.
	 */
	private boolean shipped;

}
