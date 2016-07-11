
public class CountTestApp {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		//instantiate 1 new Alligator object
		Alligator gator = new Alligator();
		
		System.out.println("Counting Alligators...");
		System.out.println("");
		
		//use the CountUtil static method to count the gator object a maximum of 3 times
		CountUtil.count(gator, 3);
		
		//create new Sheep object
		Sheep sheep1 = new Sheep();
		System.out.println("");
		System.out.println("Counting Sheep...");
		System.out.println("");
		
		//set sheep1 name to Blackie
		sheep1.setName("Blackie");
		
		
		//Count the first sheep 2 times
		CountUtil.count(sheep1, 2);
		
		//clone object sheep1
		System.out.println("");
		
		Sheep clone = sheep1.clone();
		
		clone.setName("Dolly");
		
		CountUtil.count(clone, 3);
		
		System.out.println("");
		
		CountUtil.count(sheep1, 1);
		
	}
}
