
import java.util.ArrayList;
import java.util.Collections;

public class nefelix {
	
	ArrayList<moovie> moovies = new ArrayList<moovie>();
	
	public moovie getBestmoovie(){
		this.sortmooviesByRating();
		return moovies.get(0);
	}

	public void addmoovie(moovie moovie) {
		moovies.add(moovie);
	}
	
	public moovie getmoovie(int moovieNumber){
		if(moovieNumber < moovies.size()) 
		return moovies.get(moovieNumber);
		else System.err.println("That index is larger than the moovie queue. Pass a smaller number to the getmoovie() method.");
		return null;
	}
	
	public void sortmooviesByRating() {
		Collections.sort(moovies);
	}

	public void printmoovies() {
		System.out.println("Your Netflix queue contains: ");
		for (moovie moovie : moovies) {
			System.out.println(moovie);
		}
	}

}