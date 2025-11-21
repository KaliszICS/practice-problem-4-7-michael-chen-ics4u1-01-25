public class PracticeProblem {
	/**
	 * Class to test throwing exceptions
	 * @author Michael Chen
	 * @version 1.0.0
	 */

	public static void main(String args[]) {

	}
	/**
	 * Checks if age is greater than or equal to 0 and less than or equal to 150
	 * @param age age of the person
	 * @return true if the age is <= 150 and >= 0, otherwise false
	 * @throws IllegalArgumentException if age is >150 or <0
	 */
	public static boolean validateAge(int age) throws IllegalArgumentException {
		if (age < 0) {
			throw new IllegalArgumentException("Age cannot be negative");
		} else if (age > 150) {
			throw new IllegalArgumentException("Age must be realistic");
		}
		return true;
	}

	/**
	 * Withdraw funds from your account
	 * @param amount amount to withdraw
	 * @param balance starting balance
	 * @return new balance after withdrawal
	 * @throws IllegalArgumentException if amount is negative
	 * @throws IllegalStateException if you do not have enough funds (balance < amount)
	 */
	public static double withdraw(double amount, double balance) throws IllegalArgumentException, IllegalStateException {
		if (amount <= 0) {
			throw new IllegalArgumentException("Amount cannot be negative");
		} else if (balance < amount) {
			throw new IllegalStateException("Not enough funds");
		}
		return balance - amount;
	}

	/**
	 * Gets the element at a specified index of an array
	 * @param array array to get element from
	 * @param index index to get from array
	 * @return the value at array[index]
	 * @throws NullPointerException if array is null
	 * @throws IndexOutOfBoundsException if index is out of bounds of array
	 */
	public static int getElement(int[] array, int index) throws NullPointerException {
		if (array == null) {
			throw new NullPointerException("Array cannot be null");
		}
		return array[index];
	}

	/**
	 * Validates an email address
	 * @param email email address
	 * @return trimmed email address
	 * @throws IllegalArgumentException if the email address is empty or null, does not contain an @, or does not contain a . after an @
	 */
	public static String validateEmail(String email) throws IllegalArgumentException {
		if (email == null || email.equals(new String())) {
			throw new IllegalArgumentException("Email cannot be empty");
		} else if (!email.contains("@")) {
			throw new IllegalArgumentException("Invalid email format");
		} else if (!email.substring(email.indexOf("@"), email.length()).contains(".")) {
			throw new IllegalArgumentException("Invalid email format");
		}
		return email.trim();
	}

}
