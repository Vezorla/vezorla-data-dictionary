package dataAccess;

import problemDomain.LineItem;
import problemDomain.ProductQuantity;
import problemDomain.PurchaseOrder;

/**
 * LineItemDB will interface with the LineItem table in the Vezorla database
 */
public class LineItemDB {
    /**
     * Return a list of all LineItem
     * 
     * @return List of LineItems
     */
    public List<LineItem> getAllLineItems() {}

    /**
     * Return all lots that are added to the line item
     * 
     * @param lineItem LineItem the line item need to find lot
     * @return List of lots in that line number
     */
    public List<Lot> getLots(LineItem lineItem) {}

    /**
     * Delete a LineItem from the LineItem table
     * 
     * @param lineItem lineitem to be deleted
     * @return success
     */
    public boolean deleteLineItem(LineItem lineItem) {}

    /**
     * Delete a LineItem from the LineItem table
     * 
     * @param lineNum line number of the line item to be deleted
     * @return success
     */
    public boolean addLineItem(int lineNum) {}

    /**
     * Get the purchase order as specified by the PO Number
     * 
     * @param poNum ID of the PO to get
     * @return PO
     */
    public PurchaseOrder getPO(int poNum) {}

    /**
     * Get a list of the product quantity from an invoice
     * Will be called with <code>getInvoice()</code>
     * 
     * @param invoice invoice to find the product quantity of
     * @return List of ProductQuantity
     */
    public List<ProductQuantity> getProductsDetail(Invoice invoice) {}
    
    /**
     * Updates an lineItem quantity within the database given
     * the updated LineItem object.
     *
     * @param lineItem LineItem to be (and is already)
     * updated.
     * @param quantity int new quanity of the lineItem
     * @return boolean True if Account was updated,
     * false otherwise.
     */
    public boolean updateQuantity(LineItem lineItem, int quantity) {}
}
