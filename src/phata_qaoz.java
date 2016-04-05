 // Copyright Wintriss Technical Schools 2013
import java.awt.Component;
import java.awt.Frame;
import java.net.MalformedURLException;
import java.net.URL;

import javax.print.attribute.IntegerSyntax;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class phata_qaoz {

	public static void main(String[] args) throws Exception {
		Frame quizWindow = new Frame();
		quizWindow.setVisible(true);

		// 1. find an image on the internet, and put its URL in a String variable (from your browser, right click on the image, and select “Copy Image URL”)
String weebus = "http://media.lajollalight.com/img/photos/2015/06/22/National_League_of_Young_Men_6-18-15_9th_Grade_BOYS_t837.jpg?5df2a6e0ac564ff4ddc2702f3c8561935b88c24b";
		// 2. create a variable of type "Component" that will hold your image
Component weeb = createImage(weebus);
		// 3. use the "createImage()" method below to initialize your Component

		// 4. add the image to the quiz window
quizWindow.add(weeb);
		// 5. call the pack() method on the quiz window
quizWindow.pack();
		// 6. ask a question that relates to the image
String weebo = JOptionPane.showInputDialog("what candy is the pink haired kid holding");
		// 7. print "CORRECT" if the user gave the right answer
int score=0;
if(weebo.equalsIgnoreCase("Pixie")||weebo.equalsIgnoreCase("Pixie Stick")||weebo.equalsIgnoreCase("Stick")||weebo.equalsIgnoreCase("A Pixie Stick")){
	JOptionPane.showMessageDialog(null, "7h47 15 r1gh7");
	score=score+1;
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "7h47 15 1nc0rr3c7");
}
		// 9. remove the component from the quiz window (you may not see the effect of this until step 12)
quizWindow.remove(weeb);
		// 10. find another image and create it (might take more than one line of code)
String memer = "http://i0.wp.com/www.theimpulsivebuy.com/wordpress/wp-content/uploads/2015/03/Trident-Layers-Swedish-Fish-Gum.jpg?resize=640%2C305";
Component memed = createImage(memer);

		// 11. add the second image to the quiz window
quizWindow.add(memed);
		// 12. pack the quiz window
quizWindow.pack();
		// 13. ask another question

String memeo=JOptionPane.showInputDialog("how many flavors are in the gum?");
if(memeo.equalsIgnoreCase("2")||memeo.equalsIgnoreCase("two")){
	JOptionPane.showMessageDialog(null, "7h47 15 r1gh7");
	score=score+1;
}
		// 8. print "INCORRECT" if the answer is wrong
else {
	JOptionPane.showMessageDialog(null, "7h47 15 1nc0rr3c7");
}
		// 14+ check answer, say if correct or incorrect, etc.

	}

	private static Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	/* OPTIONAL */
	// *14. add scoring to your quiz
	//String score1="score";
	//score1+score=score1;
	// *15. make something happen when mouse enters image (imageComponent.addMouseMotionListener()) 
}





