//implements the countable and cloneable interfaces
//QUESTION: why did the countable interface make me add all the method overrides and the Cloneable did not?
public class Sheep implements Countable, Cloneable{

	//should include an instance variable that stores the count
	private int count = 0;
	
	//the name of the sheep
	private String name;
	
	//provide methods to set and get the name of the sheep
	//getters don't need parameters because you are just returning the data field that already exists in the program
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//methods implemented by the countable
	@Override
	public void incrementCount() {
		count++;
	}

	//use this right after you clone it and before you count it again?
	@Override
	public void resetCount() {
		count = 0;
	}

	//used to get the count
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return count;
	}

	//for
	@Override
	public String getCountString() {
		return getCount() + " " + getName();
	}

	@Override
	//QUESTION: changed the return type from "Object" to "Sheep" - would this be good to leave it as object?
	protected Sheep clone() throws CloneNotSupportedException {
		//reset the count of the original object when it is cloned
		resetCount();
		Sheep clone = new Sheep();
		return clone;
	}
	
	
}
