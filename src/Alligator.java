
public class Alligator implements Countable {
//instance variable that stores the count - may need to change the data type here?
	private int count = 0;
	
	//method that returns the formatted count - not sure what I should be using this for
	public int formatCount(){
		return count;
	}

	//increases the count by 1, doesn't have a return type
	@Override
	public void incrementCount() {
		count++;
	}

	//no return type, sets the count back to zero (used for sheep when you clone them)
	@Override
	public void resetCount() {
		count = 0;
	}

	//can print this to display the count variable
	@Override
	public int getCount() {
		return count;
	}

	@Override
	//make a string for the count
	public String getCountString() {
		return getCount() + " Alligator";
	}
	
}
