//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Monster implements Comparable
{
	private int myWeight;
	private int myHeight;
	private int myAge;

	//write a default Constructor
	public Monster(){
		setHeight(0);
		setWeight(0);
		setAge(0);
	}


	//write an initialization constructor with an int parameter ht
	public Monster(int ht){
		setHeight(ht);
		setWeight(0);
		setAge(0);
	}


	//write an initialization constructor with int parameters ht and wt
	public Monster(int ht, int wt){
		setHeight(ht);
		setWeight(wt);
		setAge(0);
	}



	//write an initialization constructor with int parameters ht, wt, and age
	public Monster(int ht, int wt, int age){
		setHeight(ht);
		setWeight(wt);
		setAge(age);
	}


	//modifiers - write set methods for height, weight, and age
	public void setHeight(int height){
		myHeight = height;
	}
	public void setWeight(int weight){
		myWeight = weight;
	}
	public void setAge(int age){
		myAge = age;
	}
	
	
	//accessors - write get methods for height, weight, and age
	public int getHeight(){
		return myHeight;
	}
	public int getWeight(){
		return myWeight;
	}
	public int getAge(){
		return myAge;
	}
	
	
	//creates a new copy of this Object
	public Object clone()
	{
		
	   return new Monster(myHeight, myWeight, myAge);
	}

	public boolean equals( Object obj )
	{
		Monster temp = (Monster)obj;
		if(getHeight() == temp.getHeight() && getWeight() == temp.getWeight() && getAge() == temp.getAge()){
			return true;
		}

		return false;
	}

	public int compareTo( Object obj )
	{
		Monster rhs = (Monster)obj;
		if(rhs.getHeight() > getHeight()){
			return -1;
		}else if(getHeight() > rhs.getHeight()){
			return 1;
		}
		if(rhs.getWeight() > getWeight()){
			return -1;
		}else if(getWeight() < rhs.getWeight()){
			return 1;
		}
		if(rhs.getAge() > getAge()){
			return -1;
		}else if(getAge() > rhs.getAge()){
			return 1;
		}
		return 0;


		
	}

	public String toString(){
		String output = myHeight + " " + myWeight + " " + myAge;
		return output;
	}
	
	
}