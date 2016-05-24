
public class own {
public static void main(String[] args) {
	moovie landbeforetime1 = new moovie("landbeforetime1", 4);
	moovie landbeforetime2 = new moovie("landbeforetime2", 3);
	moovie landbeforetime3 = new moovie("landbeforetime3", 2);
	moovie landbeforetime4 = new moovie("landbeforetime4", 1);
	moovie landbeforetime5 = new moovie("landbeforetime5", 0);
	landbeforetime1.getTicketPrice();
	nefelix queue=new nefelix();
	queue.addmoovie(landbeforetime1);
	queue.addmoovie(landbeforetime2);
	queue.addmoovie(landbeforetime3);
	queue.addmoovie(landbeforetime4);
	queue.addmoovie(landbeforetime5);
	queue.printmoovies();
	queue.sortmooviesByRating();
	System.out.println("the best moovie is..."+queue.getBestmoovie().getTitle());
	System.out.println("the second best movie is..."+queue.getmoovie(1));
}
}
