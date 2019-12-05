package dataAccess;

public class DiscountDB {
	
	/**
	 * Gets all the Discount Objects from the database.
	 * 
	 * @return List<Discount> Contains all all the Discount 
	 * Objects from the database.
     */
	public List<Discount> getAllDiscount();
	
	
	/**
	 * Get all the Discount Object that the user hasn't used.
	 * 
	 * @param account Account Object that need to get the discount hasn't used.
	 * @return List<Discount> Contains all all the Discount 
	 * Objects from the database.
	 * */
	public List<Discount> getUserDiscountsNotUsed(Account account);
	
    /**
     * Add a Discount Object to the database.
     *
     * @param discount Discount object to
     * be persisted.
     * @return boolean True if discount is added,
     * false otherwise.
     */
	public boolean addDiscount(Discount discount);
	
	/**
     * Updates the discount within the database.
     * Acts as a refresh call to the database.
     *
     * @param discount Discount object to
     * be updated.
     * @return boolean True if discount were updated,
     * false otherwise.
     */
	public boolean updateDiscount(Discount discount);
}
