import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class squidwurld {
	public static void main(String[] args) {
		int random = new Random().nextInt(10);
		int Random = new Random().nextInt(10);
		Location coco = new Location(random, Random);
		World karrat = new World();
		karrat.show();
		Flower flower = new Flower(Color.pink);
		for (int i = 0; i < 100; i++) {
			int o = 1;
			o++;
			karrat.add(coco, flower);
		}
		Bug buggo = new Bug(Color.CYAN);
		Location loco = new Location(5, 5);
		karrat.add(loco, buggo);
		Bug bugie = new Bug(Color.blue);
		karrat.add(coco, bugie);
		bugie.turn();
		bugie.turn();

	}

}
