package problemDomain;
import java.util.List;

/**
 * The Account class provides the data structure for holding
 * account information within the web application system. There
 * are different types of accounts that the system handles 
 * (Individual and Shop). As such, this class provides the base
 * attributes and functionalities for these types of classes.
 * 
 * This class is responsible for the following data:
 * - accountNum
 * - lastName
 * - firstName
 * - phoneNum
 * - accountType
 * - address
 * - city
 * - country
 * - postalCode
 * - password
 * - email
 * - userCreated
 * - accountAdmin
 * 
 * Each individual purchaser and shop will have an Account. The account
 * will be used to retrieve transaction history.
 * 
 * @author Vezorla
 *
 */
public class Account {
	
	/**
	 * cart is a Cart object associated 
	 * with the account. 
	 */
	private Cart cart;
	/**
	 * invoices is a list of invoices
	 * associated with that account. 
	 */
	private List<Invoice> invoices;
	/**
	 * accountNum an int for the
	 * unique account. 
	 */
	private int accountNum;
	/**
	 * lastName a String for the
	 * account holder's last name. 
	 */
	private String lastName;
	/**
	 * firstName a String for the 
	 * account holder's first name. 
	 */
	private String firstName;
	/**
	 * phoneNum a String for the
	 * account holder's phone number. 
	 */
	private String phoneNum;
	/**
	 * accountType a char to represent
	 * if the account is for a business or 
	 * non-business user.
	 * 
	 */
	private char accountType;
	/**
	 * address a String for the 
	 * account holder's address. 
	 */
	private String address;
	/**
	 * city is a String for the
	 * account holder's city. 
	 */
	private String city;
	/**
	 * country is a String for the
	 * account holder's country. 
	 */
	private String country;
	/**
	 * postalCode is a String for the 
	 * account holder's postal code. 
	 */
	private String postalCode;
	/**
	 * password is a String for the 
	 * account holder's password. 
	 */
	private String password;
	/**
	 * email is a string for the
	 * account holder's email. 
	 */
	private String email;
	/**
	 * A boolean of true if the account
	 * is user created. Meaning, the user
	 * created an account on the web application.
	 * If a user does not create an account but 
	 * places an order with minimal information, an
	 * account object is created to just hold the
	 * essential information to get the product to
	 * the customer. The value is false. 
	 */
	private boolean userCreated;
	/**
	 * A boolean of true if the account is 
	 * an admin account. False if it is 
	 * not an admin account. 
	 */
	private boolean accountAdmin;
	
	
}
