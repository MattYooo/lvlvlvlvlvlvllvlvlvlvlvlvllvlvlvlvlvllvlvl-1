import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class ho8iske {
public static void main(String[] args) {
	Tortoise.setX(10);
	Tortoise.setY(420);
	Tortoise.show();
	Tortoise.setSpeed(10);
	int eem=new Random().nextInt(2);
	if(eem==1){
		pot("small", "purple");
	}
	else{
		fet("small", "purple");
	}
	pot("small", "purple");
	fet("medium", "pink lamborghini");
	pot("small", "purple");
	fet("small", "purple");
	fet("small", "purple");
	fet("medium", "pink lamborghini");
	fet("large", "peepo");
	pot("small", "purple");
	fet("large", "peepo");
	
}

private static void fet(String height, String colour) {
	if(colour.equals("purple")){
		Tortoise.setPenColor(Color.magenta);
	}
	if(colour.equals("pink lamborghini")){
		Tortoise.setPenColor(Color.pink);
	}
	if(colour.equals("peepo")){
		Tortoise.setPenColor(Color.yellow);
	}
	
	int meme=12;
	if(height.equals("small")){
		meme=60;
	}
	if(height.equals("medium")){
		meme=120;
	}
	if(height.equals("large")){
		meme=250;
	}
	Tortoise.move(meme);
	Tortoise.turn(90);
	Tortoise.move(42.0);
	Tortoise.turn(90);
	Tortoise.move(meme);
	Tortoise.turn(-90);
	Tortoise.setPenColor(Color.GREEN);
	Tortoise.move(13.37);
	Tortoise.turn(-90);
	
}
private static void pot(String height, String colour) {
	if(colour.equals("purple")){
		Tortoise.setPenColor(Color.magenta);
	}
	if(colour.equals("pink lamborghini")){
		Tortoise.setPenColor(Color.pink);
	}
	if(colour.equals("peepo")){
		Tortoise.setPenColor(Color.yellow);
	}
	
	int meme=12;
	if(height.equals("small")){
		meme=60;
	}
	if(height.equals("medium")){
		meme=120;
	}
	if(height.equals("large")){
		meme=250;
	}
	Tortoise.move(meme);
	Tortoise.turn(45);
	Tortoise.move(42.0);
	Tortoise.turn(135);
	Tortoise.move(meme+30);
	Tortoise.turn(-90);
	Tortoise.setPenColor(Color.GREEN);
	Tortoise.move(13.37);
	Tortoise.turn(-90);
	
}
}