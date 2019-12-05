package DBOps;
/**
 * The PurchaseOrderDB class provides access to manage the Purchase Orders transactions from the Vezorla Application and it's database.
 * 
 * Methods include:
 * 
 * - Search Purchase Order
 * - Add Purchase Order
 * - Update Purchase Order
 * - Get Lots
 * - Get All Purchase Orders
 * - Toggle Received
 * 
 */
public class PurchaseOrderDB {
	
	/**
	 * 
	 * Retrieves a PurchaseOrder object, Matched using user input keyword.
	 * 
	 * @param keyword The keyword input by user. Used to match a Purchase Order within Database.
	 * @return PurchaseOrder The Purchase Order that matched the search keyword.
	 */
	public PurchaseOrder searchPO(String keyword) {};
	
	
	/**
	 * 
	 * Adds a PurchaseOrder Object to the Database.
	 * 
	 * @param po Purchase Order to be added into the database.
	 */
	public void addPO(PurchaseOrder po) {};
	
	
	/**
	 * Updates a PurchaseOrder within Database given a PurchaseOrder object.
	 * 
	 * @param po PurchaseOrder object that overwrites existing entry using PurchaseOrder number.
	 */
	public void update(PurchaseOrder po) {};
	
	
	/**
	 * Returns a List of Product Objects arranged by Lot Number.
	 * 
	 * 
	 * @return List<Product> List of Product Objects.
	 */
	public List<Product> getLots(){};
	
	
	/**
	 * Returns a List of all PurchaseOrder objects stored in database.
	 * 
	 * 
	 * @return List<PurchaseOrder> A List of all PurchaseOrder objects stored within the database.
	 */
	public List<PurchaseOrder> getAllPO() {};
	
	
	/**
	 * Responsible for changing the received status of a PurchaseOrder object from False to True.
	 * 
	 * @return boolean Indicator of operation success. True - Operation Succeed. False - Operation Failed.
	 */
	public boolean toggleReceived() {};
}
