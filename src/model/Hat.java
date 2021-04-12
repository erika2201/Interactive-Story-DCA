package model;

import processing.core.PApplet;

public class Hat extends Element {

	public Hat(int posX, int posY, PApplet app) {
		super(posX, posY, app);
	}

	@Override
	public void draw(PApplet app) {
		app.imageMode(app.CENTER);
		app.image(hat, posX, posY);
		app.imageMode(app.CORNER);
	}

}
