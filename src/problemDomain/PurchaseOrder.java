package problemDomain;
import java.util.Date;
import java.util.List;

/**
 * The PurchaseOrder class contains the information of purchase 
 * orders for Vezorla. Purchase orders are the products being
 * ordered by the supplier. 
 * As such, it only directly associates itself
 * with the Lot class as each purchase order must contain a Lot object.
 * 
 * The PurchaseOrder class has the following responsibilities:
 * - lotNum: String
 * - quantity: int
 * - cost: Currency
 * - price: Currency
 * 
 * The cost of the product is how much the product cost Vezorla. 
 * The price of the product is how much vezorla is selling the product for. 
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
	 * purchase order. Essentially, this is 
	 * what product, quantity, and etc. 
	 * is on the purchase order. 
	 */
	private List<Lot> lots;

}
