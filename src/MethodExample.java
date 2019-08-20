import processing.core.PApplet;

public class MethodExample extends PApplet {
	public static Turtle yertle;

	public void settings() {
		size(600, 600); // set the size of the window
	}

	public void setup() {
		background(255); // set the background color

		yertle = new Turtle(this); // create a new turtle

		yertle.goToPoint(50, 50);
		
		drawABox(yertle);
	}
	
	public static void drawABox( Turtle aTurtle ) {
		// this is where the turtle commands go
	}
	
	public static void drawStar(Turtle aTurtle, int size) {
		for (int i = 0; i < 400; i = i + 1) {
			aTurtle.forward(size);
			aTurtle.turnRight(110);
		}
	}

	public static void main(String[] args) {
		PApplet.main(new String[] { "MethodExample" });
	}
}