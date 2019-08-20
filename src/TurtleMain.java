import processing.core.PApplet;

public class TurtleMain extends PApplet {
	public static Turtle yertle;

	public void settings() {
		size(600, 600);
	}

	public void setup() {
        background( 255 );			// set the background color

        yertle = new Turtle(this);	// create a new turtle
		yertle.setThickness(3);			// increase the line thickness
        
        yertle.forward(100);
        yertle.turnRight(90);
		yertle.forward(100);
	}
	
	public static void main(String[] args) {
		PApplet.main(new String[]{"TurtleMain"});
	}
}