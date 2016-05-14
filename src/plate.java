public class plate {
	private String name;

	void sayHi(){
		System.out.println("The plate " + name + " is smarter than your average plate.");
	}
	
	public static void main(String[] args) {
		//1. Make an instance of your new pet plate
		plate plate = new plate();
		//2. Call the sayHi method
		plate.sayHi();
		//3. Create a constructor in the plate class so that you can give your plate a name.
	
	}
}
