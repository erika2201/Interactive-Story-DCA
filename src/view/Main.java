package view;

import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
		
	}
	
	public ScreenHome screenHome;
	public ScreenInteraction screenInteraction;
	public ScreenFinal screenFinal;
	int screen;
	
	public void settings() {
		size(1200,700);
	}
	

	public void setup() {
		screenHome = new ScreenHome(0, 0, this);
		screenInteraction = new ScreenInteraction(0, 0, this);
		screenFinal = new ScreenFinal (0, 0, this);
		
	}
	
	
	public void draw() {
		switch (screen) {
		case 1:
			screenHome.drawHomeScreen();
			break;
			
		case 2:
			screenInteraction.drawInteractionScreen();
			break;

		case 3:
			screenFinal.drawFinalScreen();
			break;

		default:
			break;
		}
	}
}
