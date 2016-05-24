//1. Instantiate some moovie objects (at least 5).

	//2. Use the moovie class to get the ticket price of one of your moovies.

	//3. Instantiate a NetflixQueue.
	//4. Add your moovies to the Netflix queue.
	//5. Print all the moovies in your queue.
	
	//6. Use your NetflixQueue object to finish the sentence "the best moovie is...."
	//7. Use your NetflixQueue to finish the sentence "the second best moovie is...." 


public class moovie implements Comparable<moovie> {

	private String title;
	private int stars;

	public moovie(String title, int stars) {
		this.title = title;
		this.stars = stars;
	}

	public String getTitle() {
		return this.title;
	}

	public int getRating() {
		return this.stars;
	}

	public String toString() {
		return "\"" + title + "\" - " + stars + " stars";
	}

public String getTicketPrice() {
		if (this.stars > 2) {
			return "That will be $12 please.";
		} else if (this.title.contains("landbeforetime")) {
			return "This moovie is so bad, we'll pay YOU to watch it!";
		} else {
			return "Don't waste your money on this horrible rubbish.";
		}
	}
 

	public int compareTo(moovie othermoovie) {
		int compareQuantity = othermoovie.getRating();

		// return this.stars - compareQuantity; //ascending order
		return compareQuantity - this.stars; // descending order
	}
}

