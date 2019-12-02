/**
 * Discount is responsible to containing information
 * on discounts. These discounts can apply to 
 * individual products or the whole order.  It 
 * has a code that the customer or client can use. 
 * 
 * It contains the following information about a discount:
 *  - code
 *  - type
 *  - percent
 *  - isHighlighted
 *  - description
 *  - startDate
 *  - endDate
 *  - minimiumOrderValue
 *  - isValid
 *  
 *  @author Vezorla
 */
package problemDomain;

import java.util.Currency;
import java.util.Date;

public class Discount {
	/**
	 * code is a String for the discount 
	 * code. 
	 */
	private String code;
	/**
	 * type is a String 
	 * for the type of discount. 
	 * Example, type could be first
	 * time buy discount. 
	 */
	private String type;
	/**
	 * percent is a float representing 
	 * the percent off the product or
	 * order that is applied. 
	 */
	private float percent;
	/**
	 * isHighlighted is a boolean of true
	 * if the product is the main discount. 
	 * This is shown on the banner in the
	 * front end. The value will be false if
	 * the discount is not included in the banner. 
	 */
	private boolean isHighlighted;
	/**
	 * description is a breif description
	 * of the discount.  How it works. 
	 */
	private String description;
	/**
	 * startDate is the date that the
	 * discount becomes effective. 
	 */
	private Date startDate;
	/**
	 * endDate is the date that the 
	 * discount is no longer effective. 
	 */
	private Date endDate;
	/**
	 * minimiumOrderValue is a Currency 
	 * of the min. value the customer or 
	 * client must spend to be eligible 
	 * for the discount.  
	 */
	private Currency minimiumOrderValue;
	
	/**
	 * Method to return if the discount is 
	 * valid. Based of the start and end dates. 
	 * @return
	 */
	public boolean isValid() {
		boolean valid = false;
		return valid;
	}
}
