package model;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class Element {
	
	protected int posX, posY;
	protected PApplet app;
	PImage tadpole, pants, tie, hat, vest;
	
	public Element (int posX, int posY, PApplet app) {
		this.posX =posX;
		this.posY =posY;
		this.app = app;
		
		tadpole = app.loadImage("Tadpole.png");
		pants = app.loadImage("Pants.png");
		tie = app.loadImage("Tie.png");
		tie = app.loadImage("Tie.png");
		vest = app.loadImage("Vest.png");
	}
	
	public abstract void draw (PApplet app);
	
	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}
}
