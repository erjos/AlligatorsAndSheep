
public class CountUtil{
	
	public static void count(Countable c, int maxCount){
		
		//loop that limits the number of counts according to a max count
		for(int i = 1; i <= maxCount ; i++){
			
			//increments the count of the Countable object
			c.incrementCount();
			
			//prints the Count string which is just a combination of the getCount method and the name of the class
			System.out.println(c.getCountString());
			}
	}
	
}
