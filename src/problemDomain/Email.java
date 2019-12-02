package problemDomain;
/**
 * Email is responsible for holding
 * the contents of an email that is
 * sent by the web application. 
 * 
 * It contains:
 * -email
 * -fromEmail
 * -body
 * -subject
 * -sendEmail()
 * 
 * @author Vezorla
 *
 */
public class Email {
	/**
	 * toEmail is the email
	 * address to send the email
	 * to. 
	 */
	private String toEmail;
	/**
	 * fromEmail is the email
	 * address that the email
	 * is being sent from. 
	 * An email from Vezorla. 
	 */
	private String fromEmail;
	/**
	 * subject is the subject
	 * of the email. 
	 */
	private String subject;
	/**
	 * body is the contents of
	 * the email. 
	 */
	private String body;
	
	/**
	 * Method to send the email from
	 * the web application. 
	 */
	public void sendEmail() {}
	
}
