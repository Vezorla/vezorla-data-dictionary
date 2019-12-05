/**
  * AccountDB is responsible for the handling and
 * manipulation of Accounts within the database.
 * It is also responsible for verifying the login
 * as well as checking if an Account is admin.
 *
 * @author Vezorla
 */
package dataAccess;

public class AccountDB {

    /**
     * Gets an account given the account's email address.
     *
     * @param email Email of account to get.
     * @return Account The Account object that matches
     * the email address, null otherwise.
     */
    public Account getAccount(String email) {}

    /**
     * Adds an Account object to the database.
     *
     * @param account Account to be added to the
     * database.
     * @return boolean True if Account was added,
     * false otherwise.
     */
    public boolean addAccount(Account account) {}

    /**
     * Updates an Account within the database given
     * the updated Account object.
     *
     * @param account Account to be (and is already)
     * updated.
     * @return boolean True if Account was updated,
     * false otherwise.
     */
    public boolean updateAccount(Account account) {}

    /**
     * Gets all the Invoice objects from the database.
     *
     * @param account Account to get the invoices
     * @return List<Invoice> Contains all the Invoice
     * objects from the database.
     */
    public List<Invoice> getInvoices(Account account) {}

    /**
     * Gets the Account's Cart object from the database.
     *
     * @param account Account to get the cart
     * @return Cart The Account's Cart from the database.
     * Note: This method must not return null as all Account
     * obejcts must have at least one Cart.
     */
    public Cart getCart(Account account) {}

    /**
     * Verifies the Account Login credentials.
     *
     * @param account Account to be verified.
     * @return Account Account object that is verified,
     * null otherwise.
     */
    public Account verifyLogin(Account account) {}

    /**
     * Checks to see if the Account is of type admin.
     *
     * @param account Account to be checked.
     * @return boolean True if Account is admin,
     * false otherwise.
     */
    public boolean isAdmin(Account account) {}

    /**
     * Checks to see if the email is existed.
     *
     * @param email String to be checked.
     * @return boolean True if Account is existed,
     * false otherwise.
     */
    public boolean emailExists(String email) {}
    
    /**
     * Gets all account that are business type
	 *
     * @return List<Account> Contains all the Account
     * objects from the database.
     */
    public List<Account> getAllBusinesses() {}
}