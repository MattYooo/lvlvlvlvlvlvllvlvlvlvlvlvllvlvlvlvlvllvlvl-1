
public class Smurfrunner {
public static void main(String[] args) {
	Smurf handy=new Smurf ("Handy");
	handy.eat();
	System.out.println(handy.getName());
	Smurf papa=new Smurf ("Papa");
	papa.eat();
	System.out.println(papa.getHatColor());
	System.out.println(papa.isGirlOrBoy());
	System.out.println(papa.getName());
	Smurf ette=new Smurf ("Smurfette");
	ette.eat();
	System.out.println(ette.getHatColor());
	System.out.println(ette.isGirlOrBoy());
	System.out.println(ette.getName());
}
}
