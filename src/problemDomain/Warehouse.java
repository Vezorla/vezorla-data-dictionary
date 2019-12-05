package problemDomain;

/**
 * The Warehouse class represents a physical warehouse that Vezorla
 * has. This class is important to the system as there is a need to 
 * track each warehouse's inventory as well as its location.
 * 
 * The Warehouse class has the following responsibilities:
 * - location: String (physical location of the warehouse)
 * 
 * The Warehouse class directly associates with the Inventory
 * class as well as the Lot class.
 * 
 * @author Vezorla
 *
 */
public class Warehouse {
	
	/**
	 * warehouseNum to uniquely
	 * identify the warehouse.
	 */
	private int warehouseNum;
	
	/**
	 * address is the address of the 
	 * warehouse.  
	 */
	private String address;
	/**
	 * province is the province
	 * location of the warehouse.
	 */
	private String province;
	/**
	 * City is the city
	 * location of the warehouse. 
	 */
	private String city;
	/**
	 * postal code is the 
	 * postal code of the warehouse. 
	 * Format: X1X-1X1
	 */
	private String postalCode;
	/**
	 * phoneNumber is the phoneNumber
	 * of the Warehouse. 
	 * Format: 1(xxx)xxx-xxxx
	 */
	private String phoneNumber;
	/**
	 * active is a boolean indicating
	 * if the warehouse is an active 
	 * location. If the warehouse is 
	 * no longer active, this value 
	 * is false. 
	 */
	private boolean active;

}
