/**
 * UserServices is responsible for the services
 * of user action and interaction using the web application.
 *
 * @author Vezorla
 */
package services;

import java.util.List;

import problemDomain.Account;
import problemDomain.Cart;
import problemDomain.Discount;
import problemDomain.Invoice;
import problemDomain.LineItem;
import problemDomain.Product;

public class UserServices {

    /**
     * Searches for a Product to be displayed
     * to the user.
     *
     * @param keyword Search for product based
     * off specified keyword. 
     */
    public void searchProduct(String keyword) {};

    /**
     * Gets a selected product from the UI and
     * retrieves its data from the database. This
     * data is then displayed to the user.
     *
     * @param prodId Product ID to search for
     * the product.
     * @return Product Product selected from the UI.
     */
    public Product getSelectedProduct(int prodId) {
    	Product product = null;
    	return product;
    };

    /**
     * Adds a Product to the users Cart.
     *
     * @param product Product to be added.
     * @return boolean True if product was
     * added to the Cart, false otherwise.
     */
    public boolean addToCart(Product product) {
    	boolean success = false;
    	return success;
    };

    /**
     * Places an order in the system; calls
     * the appropriate database persistence
     * methods to do so.
     */
    public void placeOrder() {};

    /**
     * Updates the Cart with the specified
     * quantity.
     * 
     * @param lineItem LineItem that needs a quantity change.
     * @param quantity the new quantity value. 
     * @return
     */
    public boolean updateProductCartQuantity(LineItem lineItem, int quantity) {
    	boolean success = false;
    	return success;
    };

    /**
     * Deletes a LineItem from the Cart.
     * 
     * @param product a LineItem that is to be deleted.
     * @return boolean true if the line item was successfully
     * deleted, otherwise false is returned.
     */
    public boolean deleteFromCart(LineItem product) {
    	boolean success = false;
    	return success;
    };

    /**
     * Calls the appropriate database management
     * methods to get the cart and display it to
     * the user.
     */
    public void viewCart() {};

    /**
     * Applies a discount to a Cart given the discount
     * to be applied.
     *
     * @param discount Discount to be applied to the
     * Cart.
     * @return boolean True if discount was applied,
     * false otherwise.
     */
    public boolean applyDiscount(Discount discount) {
    	boolean success = false;
    	return success;
    }

    /**
     * Checks to see if an account exists in the system.
     *
     * @return boolean True if account is in the
     * system, false otherwise.
     */
    public boolean checkForAccount() {
    	boolean found = false;
    	return found;
    }

    /**
     * Adds an Account to the system.
     *
     * @return boolean True if a new Account
     * was added to the system, false otherwise.
     */
    public boolean addAccount() {
    	boolean success = false;
    	return success;
    }

    /**
     * Adds an Invoice to the system.
     *
     * @return boolean True if a new Invoice
     * was created and added to the system,
     * false otherwise.
     */
    public boolean addInvoice() {
    	boolean success = false;
    	return success;
    };

    /**
     * Adds a users email address to the email mailing list.
     * @param email String email to add
     * @return boolean True if email was added to the mailing
     * list, false otherwise.
     */
    public boolean addEmailToMailingList(String email) {
    	boolean success = false;
    	return success;
    }

    /**
     * Gets all the Products from the system and displays
     * it to the user.
     * 
     * @return list of all the products. 
     */
    public List<Product> getAllProducts(){
    	List<Product> products = null;
    	return products;
    }

    /**
     * Gets the Cart for the user.
     *
     * @return Cart Cart object for the user.
     */
    public Cart getCart() {
    	Cart cart = null;
    	return cart;
    }
    
    /**
     * Gets the URL for the map of all the locations
     * provided by Google Maps.
     *
     * This method is related to the view all locations
     * use case.
     *
     * @return String of the url location of the map. 
     */
    public String getLocationsMapUrl() {
    	String url = null;
    	return url;
    }

    /**
     * Searches for a location given a specific keyword.
     *
     * @param keyword String keyword to use in the search.
     * @return List<Account> Contains all accounts that
     * match the specified keyword.
     */
    public List<Account> searchLocation(String keyword){
    	List<Account> locations = null;
    	return locations;
    }

    /**
     * Searches for information across the system related to
     * the keyword provided by the user.
     *
     * @param keyword keyword to search the system for.
     * @return List<UserComponent> Contains all search results
     * that match the specified keyword.
     */
    public List<UserComponent> searchInInfoViews(String keyword){
    	List<UserComponent> userComponents = null;
    	return userComponents;
    }
    
    /**
     * Method to get a list of the products sold
     * at the businesses. 
     * @return list of the accounts. 
     */
    public List<Account> getProductsBusinesses(){
    	List<Account> accounts = null;
    	return accounts;
    }
    
    /**
     * To get data info from the database to 
     * insert onto the front-end. 
     * E.g. The About me page.  
     * 
     * @return String the info that is 
     * provided for the front end to display. 
     */
    public String getInfoSection() {
    	String info = null;
    	return info;
    }
    
    /**
     * Method to get the discounts already used in an
     * account. Used to ensure same account doesn't use
     * the same discount. 
     * @param account the account to search through. 
     * @return List of discounts used on account. 
     */
    public List<Discount> getAvailableDiscounts(Account account){
    	List<Discount> discounts = null;
    	return discounts;
    }
    
    /**
     *  Method to get the invoices associated with an account. 
     *  Allows the user to view their invoices. 
     * @param account the account used to get the invoices. 
     * @return list of invoices for the account. 
     */
    public List<Invoice> getInvoices(Account account){
    	List<Invoice> invoices = null;
    	return invoices;
    }

}