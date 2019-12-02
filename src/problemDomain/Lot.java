package problemDomain;
import java.util.Currency;
import java.util.Date;
import java.util.List;

/**
 * The Lot class creates a Lot number to be associated with a shipment of purchase.
 * The Lot is a mandatory class for the system as to abide by the Government of Canada
 * laws on Safe Food.
 * 
 * The class has the following responsibilities:
 * - lotNum: String
 * - quantity: int
 * - cost: float
 * - price: float
 * 
 * The Lot class directly associates itself with the Warehouse, PurchaseOrder, Product,
 * and LineItem classes.
 * 
 * @author Vezorla
 *
 */
public class Lot {
	
	/**
	 * lotNum to uniquely identify the lot.
	 */
	private String lotNum;
	/**
	 * product is the product that 
	 * the lot is for.  
	 */
	private Product product;
	/**
	 * purchaseOrder is the PurchaseOrder
	 * the Lot belong to. 
	 */
	private PurchaseOrder purchaseOrder;
	/**
	 * warehouse is the Warehouse that
	 * the lot is stored at. 
	 */
	private Warehouse warehouse;
	/**
	 * lineItems is a list of LineItem
	 * that the lot is associated with. 
	 * This is for tracability purposes. 
	 */
	private List<LineItem> lineItems;
	/**
	 * quantity is the current quantity
	 * on hand for the lot. 
	 */
	private int quantity;
	
	/**
	 * cost is the how much the 
	 * product costs Vezorla. 
	 */
	private Currency cost;
	
	
	/**
	 * bestBefore is the Date in 
	 * which the product is best 
	 * to be consumed.  
	 */
	private Date bestBefore;
}
