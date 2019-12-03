/**
 * ProductDB is responsible for the handling and
 * manipulation of Products within the database.
 *
 * @author Vezorla
 */
package dataAccess;

public class ProductDB {

    /**
     * Gets a list of all Product ID's from the database.
     *
     * @return List<Integer> Contains all Product ID's
     * within the database.
     */
    public List<Integer> getProdIDs();

    /**
     * Gets a list of all Products from the database.
     *
     * @return List<Integer> Contains all Products
     * within the database.
     */
    public List<Product> getAllProducts();

    /**
     * Adds a Product object to the database.
     *
     * @param product Product to be added.
     * @return boolean True if product was added, false otherwise.
     */
    public boolean addProduct(Product product);

    /**
     * Updates a Product in the database. The updated Product
     * is passed into this method and is then persisted within
     * the database.
     *
     * @param product Product to be updated.
     * @return boolean True if product was updated, false otherwise.
     */
    public boolean updateProduct(Product product);

    /**
     * Searches for a Product object within the database.
     *
     * @param keyword Product keyword to search for.
     * @return List<Product> Contains all Products within
     * the database that contain the search keyword.
     */
    public List<Product> searchProduct(String keyword);

    /**
     * Gets a Product from the database given the Product's ID.
     *
     * @param prodID ID of Product to get from database.
     * @return Product that matches the prodID parameter, null otherwise.
     */
    public Product getProduct(int prodID);

}