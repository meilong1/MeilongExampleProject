//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	public MadLib()
	{
		
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		

	}

	public MadLib(String fileName)
	{
		//load stuff
		this();
		loadNouns();
		loadVerbs();
		loadAdjectives();
		
		try{
			Scanner file = new Scanner(new File(fileName));
			while(file.hasNext()){
				String symbol = file.next();
				if(symbol.equals("#")){
					System.out.print(getRandomNoun() + " ");
					
				}else if(symbol.equals("@")){
					System.out.print(getRandomVerb() + " ");
				}else if(symbol.equals("&")){
					System.out.print(getRandomAdjective() + " ");
				}else{
					System.out.print(symbol + " ");
				}
			}
		
		
		
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
	}

	public void loadNouns()
	{
		try{
			Scanner file = new Scanner(new File("H:\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\nouns.dat"));
			while(file.hasNext()){
				nouns.add(file.next());
			}
		
		
		
		}
		catch(Exception e)
		{
		}	
		
	}
	
	public void loadVerbs()
	{
		try{
			Scanner file = new Scanner(new File("H:\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\verbs.dat"));
			while(file.hasNext()){
				verbs.add(file.next());
			}
	
	
	
	
		}
		catch(Exception e)
		{
		}
	}

	public void loadAdjectives()
	{
		try{
			Scanner file = new Scanner(new File("H:\\Unit10\\Unit10-2016\\Unit10-Assignments\\Lab16d\\adjectives.dat"));
			while(file.hasNext()){
				adjectives.add(file.next());
			}
	
	
	
	
		}
		catch(Exception e)
		{
		}
	}

	public String getRandomVerb()
	{
		Random rng = new Random();
		int decider = rng.nextInt(verbs.size());
		return verbs.get(decider);
	}
	
	public String getRandomNoun()
	{
		Random rng = new Random();
		int decider = rng.nextInt(nouns.size());
		return nouns.get(decider);
	}
	
	public String getRandomAdjective()
	{
		Random rng = new Random();
		int decider = rng.nextInt(adjectives.size());
		return adjectives.get(decider);
	}		

	public String toString()
	{
	   return "\n\n\n";
	}
}