package dataAccess;

/**
 * MailingListDB will interface with the table of emails that are subscribed to the Vezorla newsletter
 */
public class MailingListDB {
    /**
     * Add email to the MailingList table
     * 
     * @param email email to be added
     * @return success
     */
    public boolean addEmail(String email) {}

    /**
     * Remove the email from the MailingList table
     * 
     * @param email email to be removed
     * @return success
     */
    public boolean deleteEmail(String email) {}

    /**
     * Update an existing email in the MailingList table
     * 
     * @param oldEmail email to be changed
     * @param newEmail updated email
     * @return success
     */
    public boolean updateEmail(String oldEmail, String newEmail) {}

    /**
     * Returns a list of all emails in the MailingList table
     * 
     * @return List of emails
     */
    public List<String> getEmails() {}
}
