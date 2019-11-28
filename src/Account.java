
/**
 * The Account class provides the data structure for holding
 * account information within the web application system. There
 * are different types of accounts that the system handles 
 * (Individual and Shop). As such, this class provides the base
 * attributes and functionalities for these types of classes.
 * 
 * This class is responsible for the following data:
 * - First Name: String
 * - Last Name: String
 * - Phone Number: int
 * - Account Type: char
 * - Address: String
 * - Email: String
 * - Account ID: int
 * 
 * Each individual purchaser and shop will have an Account. The account
 * will be used to retrieve transaction history.
 * 
 * @author Vezorla
 *
 */
class Account {
	
	/**
	 * First name of the account holder.
	 */
	private String firstName;
	
	/**
	 * Last name of the account holder.
	 */
	private String lastName;
	
	/**
	 * Phone number of the account holder.
	 */
	private int phoneNumber;
	
	/**
	 * The type of the account ('I' or 'S').
	 */
	private char accountType;
	
	/**
	 * The physical address of the account holder.
	 */
	private String address;
	
	/**
	 * Email address of the account holder.
	 */
	private String email;
	
	/**
	 * The Account ID is a unique identifier for the account.
	 */
	private int accountId;
	
}
