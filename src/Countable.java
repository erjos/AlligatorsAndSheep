//interface for Countable
public interface Countable {

	//4 abstract methods
	void incrementCount();
	
	//use this after you clone the sheep and change the name
	void resetCount();
	
	//use this anytime you want to display the count
	int getCount();
	
	String getCountString();
}
