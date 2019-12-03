/**
 * UserServices is responsible for the services
 * of user action and interaction using the web application.
 *
 * @author Vezorla
 */
package services;

public class UserServices {

    /**
     * Searches for a Product to be displayed
     * to the user.
     *
     * @param product Product to be searched for.
     */
    public void searchProduct(Product product);

    /**
     * Gets a selected product from the UI and
     * retrieves its data from the database. This
     * data is then displayed to the user.
     *
     * @param prodId Product ID to search for
     * the product.
     * @return Product Product selected from the UI.
     */
    public Product getSelectedProduct(int prodId);

    /**
     * Adds a Product to the users Cart.
     *
     * @param product Product to be added.
     * @return boolean True if product was
     * added to the Cart, false otherwise.
     */
    public boolean addToCart(Product product);

    /**
     * Places an order in the system; calls
     * the appropriate database persistence
     * methods to do so.
     */
    public void placeOrder();

    /**
     * Updates the Cart with the specified
     * quantity.
     *
     * @param quantity New quantity of items
     * in the Cart.
     * @return boolean True if Cart was
     * updated, false otherwise.
     */
    public boolean updateCart(int quantity);

    /**
     * Deletes a Product from the Cart.
     *
     * @param product Product to be deleted
     * from the Cart.
     * @return boolean True if Product was
     * deleted, false otherwise.
     */
    public boolean deleteFromCart(Product product);

    /**
     * Calls the appropriate database management
     * methods to get the cart and display it to
     * the user.
     */
    public void viewCart();

    /**
     * Applies a discount to a Cart given the discount
     * to be applied.
     *
     * @param discount Discount to be applied to the
     * Cart.
     * @return boolean True if discount was applied,
     * false otherwise.
     */
    public boolean applyDiscount(Discount discount);

    /**
     * Adds the users to the Vezorla mailing list.
     */
    public void addMialing();

    /**
     * Checks to see if an account exists in the system.
     *
     * @return boolean True if account is in the
     * system, false otherwise.
     */
    public boolean checkForAccount();

    /**
     * Adds an Account to the system.
     *
     * @return boolean True if a new Account
     * was added to the system, false otherwise.
     */
    public boolean addAccount();

    /**
     * Adds an Invoice to the system.
     *
     * @return boolean True if a new Invoice
     * was created and added to the system,
     * false otherwise.
     */
    public boolean addInvoice();

    /**
     * Adds a users email address to the email mailing list.
     * @return boolean True if email was added to the mailing
     * list, false otherwise.
     */
    public boolean addEmailToMailingList();

    /**
     * Gets all the Products from the system and displays
     * it to the user.
     */
    public void getAllProducts();

    /**
     * Gets the Cart for the user.
     *
     * @return Cart Cart object for the user.
     */
    public Cart getCart();

    /**
     * Gets the URL for the map of all the locations
     * provided by Google Maps.
     *
     * This method is related to the view all locations
     * use case.
     *
     * @return
     */
    public String getLocationsMapUrl();

    /**
     * Searches for a location given a specific keyword.
     *
     * @param keyword String keyword to use in the search.
     * @return List<Account> Contains all accounts that
     * match the specified keyword.
     */
    public List<Account> searchLocation(String keyword);

    /**
     * Searches for information across the system related to
     * the keyword provided by the user.
     *
     * @param keyword keyword to search the system for.
     * @return List<UserComponent> Contains all search results
     * that match the specified keyword.
     */
    public List<UserComponent> searchInInfoViews(String keyword);

}