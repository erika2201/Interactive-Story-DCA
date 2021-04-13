package model;

import processing.core.PApplet;

public class Vest extends Element {

	public Vest(int posX, int posY, PApplet app) {
		super(posX, posY, app);
	}

	public void draw(PApplet app) {
		app.imageMode(app.CENTER);
		app.image(vest, posX, posY);
		app.imageMode(app.CORNER);
	}

}
