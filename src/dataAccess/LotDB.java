/**
 * LotDB is responsible for the handling and
 * manipulation of Lots within the database.
 *
 * @author Vezorla
 */
package dataAccess;

public class LotDB {

    /**
     * Searches for a Lot in the database given
     * the keyword.
     *
     * @param keyword Search parameter to get Lot
     * from.
     * @return Lot Lot that matches the search keyword.
     */
    public Lot searchLot(String keyword);

    /**
     * Adds a Lot to the database.
     *
     * @param lot Lot to be added to the
     * database.
     * @return boolean True if added to the
     * database, false otherwise.
     */
    public boolean addLot(Lot lot);

    /**
     * Updates the Lot in the database given the lotNum
     * and the newQuantity.
     *
     * @param lotNum LotNum to be updated.
     * @param newQuantity new Quantity to update the Lot to.
     * @return boolean True if Lot is updated, false otherwise.
     */
    public boolean updateLot(String lotNum, int newQuantity);

    /**
     * Gets all the Lots from the database.
     *
     * @return List<Lot> Contains all the Lots from the database.
     */
    public List<Lot> getAllLots();

    /**
     * Gets all the Lots from the database given a filter.
     *
     * @param filter Filters the results to the
     * to get from the database.
     * @return List<Lot> Contains all the Lots from the database.
     */
    public List<Lot> getAllLots(String filter);

    /**
     * Gets all the Lots from the database given warehouse.
     *
     * @param warehouse Warehouse parameter to get Lot
     * @return List<Lot> Contains all the Lots from the database.
     */
    public List<Lot> getAllLots(Warehouse warehouse);
    
    /**
     * Gets all the Lots from the database given a
     * specific Product ID.
     *
     * @param prodId Search parameter to get Lot.
     * @return List<Lot> Contains all the Lots from the
     * search.
     */
    public List<Lot> getAllLots(int prodId);

    /**
     * Get the quantity of the product
     * 
     * @param prodID int Search parameter to get quantity
     * @return int Quantity of the product
     * */
    public int getProductQuantity(int prodID);
    
    /**
     * Gets a Warehouse given the Lot object in
     * which it contains.
     *
     * @param lot Lot to base search of Warehouse on.
     * @return Warehouse Warehouse object that contains
     * the Lot object.
     */
    public Warehouse getWarehouse(Lot lot);

    /**
     * Gets the best before date for the given Lot.
     *
     * @return Date Best Before date.
     */
    public Date getBestBefore();

    /**
     * Gets all product quantities within the database.
     *
     * @return List<ProductQuantity> Contains the quantity
     * of each product within the database.
     */
    public List<ProductQuantity> getInventory();

}