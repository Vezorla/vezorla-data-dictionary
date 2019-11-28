import java.util.Date;
import java.util.List;

/**
 * The PurchaseOrder class contains the order information of a 
 * Cart of Products. As such, it only directly associates itself
 * with the Lot class as each order must contain a Lot object.
 * 
 * The PurchaseOrder class has the following responsibilities:
 * - lotNum: String
 * - quantity: int
 * - cost: float
 * - price: float
 * 
 * Cost and Price are different as the actual cost of within the Lot may
 * be different than the original price of the Lot.
 * 
 * @author Vezorla
 *
 */
public class PurchaseOrder {
	
	/**
	 * poNum uniquely identifies the
	 * purchase order. 
	 */
	private int poNum;
	/**
	 * dateOrdered is the Date 
	 * when the product was ordered
	 * on the po.
	 */
	private Date dateOrdered;
	/**
	 * dateReceived is the Date
	 * that the product was received by
	 * Vezorla. 
	 */
	private Date dateReceived;
	/**
	 * received is a boolean indicating
	 * if the purchase ordered has been 
	 * received or not. 
	 */
	private boolean received;
	/**
	 * lots is a list of lots on the 
	 * purchase.  Essentially, this is 
	 * what product, quantity, and etc. 
	 * is on the purchase order. 
	 */
	private List<Lot> lots;

}
