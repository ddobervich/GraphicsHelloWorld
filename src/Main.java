import processing.core.PApplet;

import javax.swing.*;

public class Main extends PApplet {

    public void settings() {
        size(600, 600);
    }

    public void setup() {
        JOptionPane.showMessageDialog(null, "hi");
    }

    public void draw() {

        // Draw circle in the middle of the window
        ellipse(width/2, height/2, 20, 20);

        // -= YOUR CODE HERE =-

    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
