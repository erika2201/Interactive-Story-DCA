package model;

import processing.core.PApplet;

public class Tadpole extends Element {

	public Tadpole(int posX, int posY, PApplet app) {
		super(posX, posY, app);
	}

	@Override
	public void draw(PApplet app) {
		app.imageMode(app.CENTER);
		app.image(tadpole, posX, posY);
		app.imageMode(app.CORNER);
	}

}
