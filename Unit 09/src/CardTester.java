/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card newCard = new Card("King", "Clubs", 13);
		System.out.println(newCard);
		
		Card newCard3 = new Card("Queen", "Spades", 12);
		
		
		Card newCard2 = new Card("Queen", "Spades", 12);
		System.out.println(newCard2.matches(newCard3));
		System.out.println(newCard2.matches(newCard));
	}
}
