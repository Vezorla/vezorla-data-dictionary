import java.util.Date;

/**
 * The Transaction class acts as a placeholder for a transaction
 * within the system. This is due to the actual transactions being
 * handled outside the system by Google Pay and PayPal.
 * 
 * At this time, this class does not have any responsibilities.
 * 
 * The Transaction class is directly associated with the Invoice class 
 * as each Invoice will include a transaction.
 * 
 * @author Vezorla
 *
 */
public class Transaction {
	
	/**
	 * date is the date of the
	 * transaction.  Taken from 
	 * the invoice. 
	 */
	private Date date;
	
	/**
	 * invoiceNum is the invoice number
	 * that the transaction is for. 
	 */
	private int invoiceNum;
	
	/**
	 * total is the total value of the
	 * transaction. 
	 */
	private float total;
	
	/**
	 * invoice is the invoice 
	 * containing the detials of the
	 * transaction. 
	 */
	private Invoice invoice;

}
