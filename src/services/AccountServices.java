/**
 * AccountServices is responsible for the services of an
 * Account. These services can only be used and called
 * by a user with an account. The class is also responsible
 * for validating account input as well as email validation.
 *
 * @author Vezorla
 */
package services;

import problemDomain.Account;

public class AccountServices {

    /**
     * Gets the account that is associated with the
     * email parameter.
     *
     * @param email a String for the email.
     * @return Account object to hold the account data.
     */
    public Account getAccount(String email) {
        Account account = new Account();
        return account;
    }

    /**
     * Updates a current account with new data.
     *
     * @param account Account to be updated.
     * @return boolean true if updated, false otherwise.
     */
    public boolean updateAccount(Account account) {
        return false;
    }

    /**
     * Creates an account in the system.
     *
     * @param lastName for the account holder's last name.
     * @param firstName for the account holder's first name.
     * @param phonNum for the account holder's phone number.
     * @param accountType for the account type. (Business or individual).
     * @param address for the account holder's address.
     * @param city for the account holders city. 
     * @param country for the account holder's country.
     * @param postalCode for the account holder's postalCode. 
     * @param passsword for the account holder's password.
     * @param email for the account holder's email.
     * @param userCreated is the account was user or system created. 
     * @param accountAdmin if the account is an admin account. 
     * @return boolean true if created, false otherwise.
     */
    public boolean createAccount(String lastName, String firstName, String phonNum, char accountType, String address, String city, String country, String postalCode, String passsword, String email, boolean userCreated, boolean accountAdmin) {
        return false;
    }

    /**
     * Populates the fields of an Account object.
     */
    private void populateFields() {

    }

    /**
     * Gets the order history of the Account from the
     * system.
     */
    public void getOrderHistory() {

    }

    /**
     * Validates the user input to be safe for
     * system persistence.
     *
     * @return boolean true if valid, false otherwise.
     */
    public boolean validateInput() {
        return false;
    }

    /**
     * Validates the account email to be safe for
     * system persistence and email sending.
     *
     * @return boolean true if valid, false otherwise.
     */
    public boolean verifyEmail() {
        return false;
    }

    /**
     * Deletes/removes an account's email address from
     * the Vezorla mailing list.
     *
     * @return boolean true if removed, false otherwise.
     */
    public boolean deleteEmailFromMailingList() {
        return false;
    }

}
