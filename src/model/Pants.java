package model;

import processing.core.PApplet;

public class Pants extends Element {

	public Pants(int posX, int posY, PApplet app) {
		super(posX, posY, app);
	}

	@Override
	public void draw(PApplet app) {
		app.imageMode(app.CENTER);
		app.image(pants, posX, posY);
		app.imageMode(app.CORNER);
	}

}
