/**
 * A program to carry on conversations with a human user.
 * This version: 
 * <ul><li>
 *    Uses advanced search for keywords 
 * </li></ul> 
 *    
 * @author Laurie White
 * @version April 2012
 */
public class Magpie3
{
	/**
	 * Get a default greeting
	 * 
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		if (statement.length() == 0)
		{
			response = "Say something, please.";
		}
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0)
		{
			response = "Tell me more about your family.";
		}else if(findKeyword(statement, "I like") >= 0){
			response = "What do you like about " + statement.substring(statement.indexOf("I like") + 7) + "?";
		}else if(findKeyword(statement, "tygan") >= 0){
			response = "Tygan is a monkey.";
		}else if(findKeyword(statement, "wish") >= 0){
			response = "Be careful what you wish for.";
		}else if(findKeyword(statement, "trash") >= 0){
			response = "There is a reason it is called trash can, and not trash cannot.";
		}else if(findKeyword(statement, "botmaster") >= 0){
			response = "My botmaster is Meilong.";
		}else if(findKeyword(statement, "weather") >= 0){
			response = "I haven't been outside yet this year. Is it nice?";
		}else if(findKeyword(statement, "friend") >= 0){
			response = "You must not have many friends, or you wouldn't be talking to me.";
		}else if(findKeyword(statement, "game") >= 0){
			response = "I love games. What is your favorite?";
		}else if(findKeyword(statement, "quiet") >= 0 || findKeyword(statement, "shut up") >= 0){
			response = "...";
		}else if(findKeyword(statement, "hello") >= 0 || findKeyword(statement, "hi") >= 0){
			response = "Greetings.";
		}else if(findKeyword(statement, "sai gantla") >= 0){
			response = "You must mean Baibumar Bantla.";
		}else if(findKeyword(statement, "who are you") >= 0){
			
			
			response = "I am a chatbot created by Meilong Zhang. Who are you?";
			
		}else if(findKeyword(statement, "the answer") >= 0){
			response = "Sorry, I won't help you with your homework.";
		}else if(findKeyword(statement, "bye") >= 0){
			response = "Goodbye!";
		}else if(findKeyword(statement, "name") >= 0){
			
			response = "I am Magpie2, what is your name?";
			
			
		}else if(findKeyword(statement, "live") >= 0){
			response = "I live in Eclipse. Where do you live?";
		}else if(findKeyword(statement, "school") >= 0){
			response = "School is a great place!";
		}else if(findKeyword(statement, "favorite") >= 0){
			response = "I have no preference.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no").
	 * 
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @param startPos
	 *            the character of the string to begin the
	 *            search at
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal,
			int startPos)
	{
		String phrase = statement.trim();
		// The only change to incorporate the startPos is in
		// the line below
		int psn = phrase.toLowerCase().indexOf(
				goal.toLowerCase(), startPos);

		// Refinement--make sure the goal isn't part of a
		// word
		while (psn >= 0)
		{
			// Find the string of length 1 before and after
			// the word
			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn)
						.toLowerCase();
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(
						psn + goal.length(),
						psn + goal.length() + 1)
						.toLowerCase();
			}

			// If before and after aren't letters, we've
			// found the word
			if (((before.compareTo("a") < 0) || (before
					.compareTo("z") > 0)) // before is not a
											// letter
					&& ((after.compareTo("a") < 0) || (after
							.compareTo("z") > 0)))
			{
				return psn;
			}

			// The last position didn't work, so let's find
			// the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(),
					psn + 1);

		}

		return -1;
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no"). The search
	 * begins at the beginning of the string.
	 * 
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
	}

}
