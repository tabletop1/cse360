package cse360assign3;

public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/** returns the value of private instance total
	 * 
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/** adds a value to the total
	 * 
	 * @param value		integer to add to total
	 */
	public void add (int value) {
		total += value;
	}
	
	/** subtracts a value from the total
	 * 
	 * @param value		integer to subtract from total
	 */
	public void subtract (int value) {
		total -= value;
	}
	
	/** multiplies the total by a value
	 * 
	 * @param value		integer to multiply with the total
	 */
	public void multiply (int value) {
		total *= value;
	}
	
	/** divides the total by a value
	 * 
	 * @param value		integer to divide from the total
	 */
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total /= value;
	}
	
	/** returns a history of all actions
	 * 
	 * @return an empty String
	 */
	public String getHistory () {
		return "";
	}
}