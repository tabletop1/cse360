package cse360assign3;

public class Calculator {

	private int total;
	private String history;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
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
		history += " + " + value;
		total += value;
	}
	
	/** subtracts a value from the total
	 * 
	 * @param value		integer to subtract from total
	 */
	public void subtract (int value) {
		history += " - " + value;
		total -= value;
	}
	
	/** multiplies the total by a value
	 * 
	 * @param value		integer to multiply with the total
	 */
	public void multiply (int value) {
		history += " * " + value;
		total *= value;
	}
	
	/** divides the total by a value
	 * 
	 * @param value		integer to divide from the total
	 */
	public void divide (int value) {
		history += " / " + value;
		
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
		return history;
	}
}