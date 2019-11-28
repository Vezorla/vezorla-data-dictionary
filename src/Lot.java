import java.util.Date;

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
	 * quantity is the current quantity
	 * on hand for the lot. 
	 */
	private int quantity;
	
	/**
	 * cost is the how much the 
	 * product costs Vezorla. 
	 */
	private float cost;
	
	/**
	 * price is how much Vezorla 
	 * is selling the product. 
	 */
	private float price;
	
	/**
	 * bestBefore is the Date in 
	 * which the product is best 
	 * to be consumed.  
	 */
	private Date bestBefore;
	
	/**
	 * product is the product that 
	 * the lot is for.  
	 */
	private Product product;
}
