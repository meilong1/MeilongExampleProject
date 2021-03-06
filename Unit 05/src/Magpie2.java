import java.util.Scanner;
/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
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
		String name = "";
		if (statement.indexOf(" no ") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}else if(statement.toLowerCase().indexOf("tygan") >= 0){
			response = "Tygan is a monkey.";
		}else if(statement.toLowerCase().indexOf("wish") >= 0){
			response = "Be careful what you wish for.";
		}else if(statement.toLowerCase().indexOf("trash") >= 0){
			response = "There is a reason it is called trash can, and not trash cannot.";
		}else if(statement.toLowerCase().indexOf("botmaster") >= 0){
			response = "My botmaster is Meilong.";
		}else if(statement.toLowerCase().indexOf("weather") >= 0){
			response = "I haven't been outside yet this year. Is it nice?";
		}else if(statement.toLowerCase().indexOf("friend") >= 0){
			response = "You must not have many friends, or you wouldn't be talking to me.";
		}else if(statement.toLowerCase().indexOf("girl") >= 0){
			response = "BEGONE THOT";
		}else if(statement.toLowerCase().indexOf("game") >= 0){
			response = "I love games. What is your favorite?";
		}else if(statement.toLowerCase().indexOf("quiet") >= 0 || statement.toLowerCase().indexOf("shut up") >= 0){
			response = "...";
		}else if(statement.toLowerCase().indexOf("hello") >= 0 || statement.toLowerCase().indexOf("hi") >= 0){
			response = "Greetings.";
		}else if(statement.toLowerCase().indexOf("sai gantla") >= 0){
			response = "You must mean Baibumar Bantla.";
		}else if(statement.toLowerCase().indexOf("who are you") >= 0){
			if(!name.equals("")){
				response = "I am a chatbot created by Meilong Zhang.";
			}else{
				response = "I am a chatbot created by Meilong Zhang. Who are you?";
			}
		}else if(statement.toLowerCase().indexOf("the answer") >= 0){
			response = "Sorry, I won't help you with your homework.";
		}else if(statement.toLowerCase().indexOf("bye") >= 0){
			response = "Goodbye!";
		}else if(statement.toLowerCase().indexOf("name") >= 0){
			
			response = "I am Magpie2, what is your name?";
			
			
		}else if(statement.toLowerCase().indexOf("live") >= 0){
			response = "I live in Eclipse. Where do you live?";
		}else if(statement.toLowerCase().indexOf("school") >= 0){
			response = "School is a great place!";
		}else if(statement.toLowerCase().indexOf("favorite") >= 0){
			response = "I have no preference.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
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
