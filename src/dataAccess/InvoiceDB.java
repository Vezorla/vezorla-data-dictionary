package DBOps;


/**
 * The InvoiceOrderDB class provides access to manage the Purchase Orders transactions from the Vezorla Application and it's database.
 * 
 * Methods include:
 * 
 * - Get Invoice by Invoice No.
 * - Add an Invoice.
 * - Update an Invoice using Invoice Number.
 * - Get all Invoices.
 * - Get all invoices by Invoice state.
 * - Get state of Invoice by Invoice No.
 * - Get a report of Invoices by (Date, Date Range, User applied Filters)
 * 
 */
public class InvoiceDB {

	/**
	 * Searches Database for invoice by Invoice Number. Returns Invoice Object that matches invoiceNum parameter.
	 * 
	 * 
	 * @param invoiceNum Invoice number for method to perform search with.
	 * @return Invoice The invoice that matches the Invoice Number
	 */
	public Invoice searchInvoice(int invoiceNum) {};
	
	
	/**
	 * Method takes an Invoice Object and creates an entry in the Vezorla Database.
	 * 
	 * 
	 * @param invoice Invoice Object used to create Database Entry
	 * @return boolean Indicates operation success. True - Succeeded. False - Failed.
	 */
	public boolean addInvoice(Invoice invoice) {};
	
	
	/**
	 * Updates an existing Invoice to indicated payment has been received by altering the state. 
	 * Finds invoice using the Invoice Number. An optional message can be applied to indicate the reason for state change.
	 * 
	 * 
	 * @param invoiceNum The Invoice Number of the Invoice Object that needs to be updated.
	 * @param state The new state of Invoice
	 * @param message Optional message to Denote the reason for state change of invoice.
	 * @return Indicates operation success. True - Succeeded. False - Failed.
	 */
	public boolean updateInvoice(int invoiceNum, String state, String message) {};
	
	
	/**
	 * Creates a List of all Invoice Objects stored in Vezorla Database. Returns that list for presentation.
	 * 
	 * 
	 * @return List<Invoice> List of all Invoice Objects stored within Vezorla Database.
	 */
	public List<Invoice> getInvoices() {};
	
	
	/**
	 * Retrieves the current state of an Invoice Object using the Invoice Number to select the appropriate Invoice.
	 * 
	 * @param invoiceNum The Invoice Number corresponding to the Invoice to retrieve state from.
	 * @return The state of the Invoice. True - Invoice currently open. False - Invoice is closed. 
	 */
	public boolean getState(int invoiceNum) {};
	
	
	/**
	 * Retrieves a List of InvoiceReport Objects. Can be filtered by Date or User applied filters.
	 * 
	 * The Date can be a range, or if only one date is input Method will substitute the other to equal the input date.
	 * Ex: start = null, end = 1/1/2019 ===> start = 1/1/2019, end = 1/1/2019
	 * 
	 * User applied filters are a comma separated string of all the filters to be applied to the search.
	 * 
	 * @param start The Start Date of date range.
	 * @param end  The End Date of date range.
	 * @param filters Comma delimited string of all user applied filters.
	 * @return List<InvoiceReport> A list of InvoiceReport Objects for each Product applicable to the filters and date range.
	 */
	public List<InvoiceReport> getInvoiceReports(Date start, Date end, String filters) {};
	
	
	/**
	 * Retrieves a List of Invoice Objects. Can be filtered by Date or User applied filters.
	 * 
	 * The Date can be a range, or if only one date is input Method will substitute the other to equal the input date.
	 * Ex: start = null, end = 1/1/2019 ===> start = 1/1/2019, end = 1/1/2019
	 * 
	 * User applied filters are a comma separated string of all the filters to be applied to the search.
	 * 
	 * @param start The Start Date of date range.
	 * @param end  The End Date of date range.
	 * @param filters Comma delimited string of all user applied filters.
	 * @return List<Invoice> A list of Invoice Objects applicable to the filters and date range.
	 */
	public List<Invoice> getInvoices(Date start, Date end, String filters) {};
}
