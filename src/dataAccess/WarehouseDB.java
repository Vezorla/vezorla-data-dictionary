/**
 * WarehouseDB is responsible for the handling and
 * manipulation of Warehouses within the database.
 *
 * @author Vezorla
 */
package dataAccess;

public class WarehouseDB {

    /**
     * Get all the Warehouse objects within the
     * database.
     *
     * @return List<Warehouse> Contains all Warehouse
     * objects within the database.
     */
    public List<Warehouse> getAllWarehouses();

    /**
     * Add a Warehouse object to the database.
     *
     * @param warehouse Warehouse object to
     * be persisted.
     * @return boolean True if warehouse is added,
     * false otherwise.
     */
    public boolean addWarehouse(Warehouse warehouse);

    /**
     * Updates the warehouses within the database.
     * Acts as a refresh call to the database.
     *
     * @return boolean True if warehouses were updated,
     * fasel otherwise.
     */
    public boolean updateWarehouse();

    /**
     * Gets all the Lot Objects within the
     * Warehouse Objects from the database.
     *
     * @return List<Lot> Contains all the Lot
     * Objects within all the Warehouse Objects
     * from the database.
     */
    public List<Lot> getAllLotsInWarehouse();

    /**
     * Gets the Warehouse that holds the product
     * passed into the method.
     *
     * @param product Product object to get Warehouse object.
     * @return Warehouse Warehouse object that contains product.
     */
    public Warehouse getWarehouse(Product product);

}