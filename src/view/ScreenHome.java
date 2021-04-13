package view;

import processing.core.PApplet;
import processing.core.PImage;

public class ScreenHome {

	protected int posX, posY;
	PApplet app;
	PImage screenHome;
	
	public ScreenHome (int posX, int posY, PApplet app) {
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		screenHome = app.loadImage("Home.png");
	}
	
	public void drawHomeScreen() {
		app.image(screenHome,posX,posY);
	}
	
}