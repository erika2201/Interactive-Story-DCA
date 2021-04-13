package view;

import processing.core.PApplet;
import processing.core.PImage;

public class ScreenInteraction {

	protected int posX, posY;
	PApplet app;
	PImage screenInteraction;
	
	public ScreenInteraction (int posX, int posY, PApplet app) {
		this.app = app;
		this.posX = posX;
		this.posY = posY;
		screenInteraction = app.loadImage("Interaction.png");
	}
	
	public void drawInteractionScreen() {
		app.image(screenInteraction,posX,posY);
	}
	
}
