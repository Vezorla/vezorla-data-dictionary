package dataAccess;

import problemDomain.LineItem;

/**
 * CartDB will interface with the Cart table in the Vezorla database
 */
public class CartDB {
    /**
     * Return a list of all line items in a cart
     * @return list of line items in the cart
     */
    public List<LineItem> getLineItems() {}

    /**
     * Add a lineItem to the cart
     * @param lineItem line item to be added to the cart
     * @return success
     */
    public boolean addLineItem(LineItem lineItem) {}

    /**
     * Remove a line item from the cart
     * @param lineItem line item to be removed from the cart
     * @return success
     */
    public boolean deleteLineitem(LineItem lineItem) {}

    /**
     * Get the total cost of all line items in the cart
     * @return total cost of the cart
     */
    public Currency getTotalCost() {}
    
    /**
     * Apply discount to the cart
     * 
     * @param discount Discount to be added
     * @return boolean True if Discount was applied,
     * false otherwise.
     * */
    public boolean applyDiscount(Discount discount) {}
}
