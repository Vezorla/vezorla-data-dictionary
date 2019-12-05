/**
 * Admin Services acts as the middle layer between the 
 * servlets and database. It is responsible for providing the 
 * beans and information for the dataAccess layer to use. 
 * 
 * It contains the functionality for what the admin account 
 * deals with. 
 * 
 * @author Vezorla
 */
package services;

import java.util.Currency;
import java.util.Date;
import java.util.List;

import problemDomain.Email;
import problemDomain.Invoice;
import problemDomain.Product;
import problemDomain.ProductQuantity;
import problemDomain.PurchaseOrder;

public class AdminServices {
	
	/**
	 * Method to return a list of all 
	 * the Products in the database. 
	 * 
	 * @return List<Product> the list
	 * of products.  
	 */
	public List<Product> getAllProducts(){
		List<Product> products = null;
		return products;
	}
	
	/**
	 * Method to get all the products and 
	 * the sum of their quantities.  
	 * ProductQuantity is used to associate
	 * a product with it's quantity. 
	 * This is calculated by taking all the 
	 * lots of the product and summing the 
	 * quantities (if quantity in lot > 0).
	 *  
	 * @return List<ProductQuanity> a list
	 * of products with their summed quantities. 
	 */
	public List<ProductQuantity> getInventory(){
		List<ProductQuantity> productQuantities = null;
		return productQuantities;
	}
	
	/**
	 * Method to change the received boolean
	 * attribute of a PurchaseOrder to true.
	 *  
	 * @param po PurchaseOrder to be received. 
	 * 
	 * @return boolean true if the process was
	 * successful, otherwise false is returned. 
	 */
	public boolean receivePurchaseOrder(PurchaseOrder po) {
		boolean received = false;
		return received;
	}
	
	/**
	 * Method to create a Product that will
	 * be added to the database.  
	 * 
	 * @param name a String for the name of the product. 
	 * @param description a String for a description of the product. 
	 * @param image a String for the file path to the image of the product. 
	 * @param active a boolean for if the product is active or not. 
	 * @param threshold an int for the minimum amount of product to be inventory. 
	 * @param price a Currency for the price of the product. What the product is sold for. 
	 * @return a boolean if the product was added successfully to the database. False is
	 * returned if something went wrong and the product was not added. 
	 */
	public boolean addProduct(String name, String description, String image, boolean active, int threshold, Currency price) {
		boolean success = false;
		return success;
	}
	
	/**
	 * Method to update a products information in 
	 * the database.
	 * 
	 * @param prodID the id of the product to be changed. Can not be changed.  
	 * @param name the name of the product. Could be old or new value. 
	 * @param description the description of the product. Could be old or new value. 
	 * @param image the file page to the image. Could be old or new value. 
	 * @param active the status of the product. Could be old or new value. 
	 * @param threshold the minimum product needed in inventory. Could be old or new value.
	 * @param price the price of the product. Could be old or new value. 
	 * @return true if the product was updated successfully, otherwise false is returned. 
	 */
	public boolean updateProduct(int prodID, String name, String description, String image, boolean active, int threshold, Currency price) {
		boolean success = false;
		return success;
	}
	
	/**
	 * Method to search for a product based off the keyword
	 * provided. 
	 * @param keyword a String for what to be searched for. 
	 * @return List<Product> a list of products that match the
	 * keyword's criteria. 
	 */
	public List<Product> searchProduct(String keyword) {
		List<Product> products = null;
		return products;
	}
	
	/**
	 * Method to add a warehouse to the database. 
	 * 
	 * @param address a String for the address of the warehouse. 
	 * @param postalCode a String for the postal code of the warehouse. Must be format: "X1X-1X1".
	 * @param phoneNumber a String for the phone number of the warehouse. Must be format: "x(xxx)xxx-xxxxx"
	 * @param active a boolean if the warehouse is active or not. 
	 * @return boolean true if the warehouse was successfully added to 
	 * the database. Otherwise, false is returned. 
	 */
	public boolean addWarehouse(String address, String postalCode, String phoneNumber, boolean active) {
		boolean success = false;
		return success;
	}

	/**
	 * Method to update a Warehouse information.
	 * 
	 * @param warehouseNum an int for the Warehouse to be updated. This value can not be changed. 
	 * @param address a String for the address of the warehouse. Can be old or new value.
	 * @param postalCode a String for the postal code of the warehouse. Can be old or new value. 
	 * @param phoneNumber a String for the phone number of the warehouse. Can be old or new value. 
	 * @param active a boolean if the warehouse is active. Can be old or new value.
	 * @return
	 */
	public boolean updateWarehouse(int warehouseNum, String address, String postalCode, String phoneNumber, boolean active) {
		boolean success = false;
		return success; 
	}
	
	/**
	 * Method to add a PurchaseOrder to the database. 
	 * 
	 * @param dateOrdered is a Date for when the product was ordered.
	 * @param dateReceived is a Date for when the product was received. 
	 * @param received a boolean if the PurchaseOrder is received or not. True
	 * if it is received, otherwise false. 
	 * @return a boolean true if the PurchaseOrder was successfully added to the 
	 * database, otherwise false is returned. 
	 */
	public boolean addPurchaseOrder(Date dateOrdered, Date dateReceived, boolean received) {
		boolean success = false;
		return success;
	}
	
	/**
	 * Method to update an invoice in the database. 
	 * 
	 * @param invoiceNum an int for the invoice to be updatd. This value can not be changed. 
	 * @param shipped a boolean of true if the product has been shipped. Otherwise false. This can be old or new value. 
	 * @param shippingCost a Currency for the shipping cost. Can be old or new value.
	 * @param state a String for the state of the invoice "Open", "Closed", "Cancelled". This can be old or new value. 
	 * Once a state is closed, the invoice can not be altered in any way. 
	 * @param message a String for the message on the invoice. Can be old or new value. 
	 * @return
	 */
	public boolean updateInvoice(int invoiceNum, boolean shipped, Currency shippingCost, String state, String message) {
		boolean success = false;
		return success;
	}
	
	/**
	 * Method to obtain values from the database to display
	 * as a report.
	 * 
	 * @param start a Date for the start date of the report. 
	 * @param end a Date for the end date of the report.
	 * @param filter a String for the type of filter the report 
	 * contains. 
	 * @return List<ProductQuantity> a list of ProductQuantity.
	 * ProductQuantity contains the information about each 
	 * product that will be used on to display onto the report. 
	 */
	public List<ProductQuantity> generateReports(Date start, Date end, String filter) {
		List<ProductQuantity> productQuantities = null;
		return productQuantities;
	}
	
	/**
	 * Method to export data from the database to a 
	 * .csv file. This is done with the use 
	 * of SQL statements. 
	 * 
	 * @return boolean of true if the export was 
	 * completed successfully, otherwise false
	 * is returned. 
	 */
	public boolean exportData() {
		boolean success = false;
		return success;
	}
	
	/**
	 * Method to backup an image of the database 
	 * in its current state.  
	 * 
	 * @return a boolean if the backup was completed successfully, 
	 * otherwise false is returned. 
	 */
	public boolean backupData() {
		boolean success = false;
		return success;
	}
	
	/**
	 * Method to restore the database with 
	 * a selected backup. 
	 * @return a boolean of true is the restore was successful, 
	 * otherwise false is returned. 
	 */
	public boolean restoreBackup() {
		boolean success = false;
		return success;
	}
	
	/**
	 * Method to return all the invoices into a list. 
	 * 
	 * @return List<Invoices> a list of all the invoices. 
	 */
	public List<Invoice> getInvoices(){
		List<Invoice> invoices = null;
		return invoices;
	}
	
	/**
	 * Method to return all the open invoices 
	 * currently in system. 
	 * 
	 * @return List<Invoice> of invoices that are in
	 *  an "Open" status. 
	 */
	public List<Invoice> getOpenInvoices(){
		List<Invoice> invoices = null;
		return invoices;
	}
	
	/**
	 * Method to approve a Business order.  
	 * Approving a business order changes
	 * an invoice from an "Open" to 
	 * "Closed" state. 
	 * 
	 * @return boolean of true is returned
	 * if the invoice is updated successfully to
	 * "Closed", otherwise false is returned. 
	 */
	public boolean approveBusinessOrder() {
		boolean success = false;
		return success;
	}
	
	/**
	 * Method to reject a business. 
	 * Rejecting a business order changes
	 * and Invoice from an "Open" to 
	 * "Cancelled" state. 
	 * 
	 * @return boolean of true is returned if the
	 * invoice is updated successfully to "Canceled", 
	 * otherwise false is returned. 
	 */
	public boolean rejectBusinessOrder() {
		boolean success = false;
		return success;
	}
	
	/**
	 * Method to create an email that contains PurchaseOrder
	 * information to send to a supplier. 
	 * 
	 * @param po a PurchaseOrder for the contents of the email. 
	 * 
	 * @return Email an email that is be used to send to supplier. 
	 */
	public Email createPurchaseOrderEmail(PurchaseOrder po) {
		Email email = null;
		return email;
	}
	
	/**
	 * Method to create an email that contains Invoice 
	 * information to send to a client. The email 
	 * states that the Invoice has been declined. 
	 *  
	 * @param invoice an Invoice for the contents of the email. 
	 * 
	 * @return Email and email that is used to send to a client. 
	 */
	public Email createBusinessOrderEmailDecline(Invoice invoice) {
		Email email = null;
		return email;
	}
	
	/**
	 * Method to create an email that contains Invoice
	 * information to send to a client. The email states
	 * that the Invoice has been accepted. 
	 * 
	 * @param invoice an Invoice for the contents of the email. 
	 * 
	 * @return Email and email that is used ot send to a client. 
	 */
	public Email createBusinessOrderEmailAccept(Invoice invoice) {
		Email email = null;
		return email;
	}

}
