package model;

import processing.core.PApplet;

public class Tie extends Element {

	public Tie(int posX, int posY, PApplet app) {
		super(posX, posY, app);
	}

	@Override
	public void draw(PApplet app) {
		app.imageMode(app.CENTER);
		app.image(tie, posX, posY);
		app.imageMode(app.CORNER);
	}

}
