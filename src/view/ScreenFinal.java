package view;

import processing.core.PApplet;
import processing.core.PImage;

public class ScreenFinal {

	protected int posX, posY;
	PApplet app;
	PImage screenFinal;
	
	public ScreenFinal (int posX, int posY,PApplet app) {
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		screenFinal = app.loadImage("Final.png");
	}
	
	public void drawFinalScreen() {
		app.image(screenFinal,posX,posY);
	}
	
}
