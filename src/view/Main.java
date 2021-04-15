package view;

import controller.Controller;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
		
	}
	
	public ScreenHome screenHome;
	public ScreenInteraction screenInteraction;
	public ScreenFinal screenFinal;
	int screen;
	
	Controller controller;
	
	public void settings() {
		size(1200,700);
	}
	

	public void setup() {
		screenHome = new ScreenHome(0, 0, this);
		screenInteraction = new ScreenInteraction(0, 0, this);
		screenFinal = new ScreenFinal (0, 0, this);
		
		screen = 1;
		
		controller = new Controller(this);
	}
	
	public void draw() {
		drawScreens();
		drawElements();
	}

	public void mousePressed() {
		startStory();
		controller.selectElement();
		finishStory();
	}

	public void mouseDragged() {
		controller.dragElement();
	}
	
	public void drawScreens() {
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
		
		//println(mouseX, mouseY);
	}
	
	public void startStory() {
		if(screen == 1)  {
			if (mouseX>855 && mouseX<1030 &&
				  mouseY>600 && mouseY<650) {
				screen = 2;
			}
		}
	}
	
	public void drawElements() {
		if(screen == 2)  {
			controller.drawElements();
			controller.buttonToFinish();
		}
	}
	
	public void finishStory() {
		if(controller.interactionsCounter() == 5) {
			if(screen == 2)  {
				if(mouseX>1000 && mouseX<1100 &&
					mouseY>600 && mouseY<650) {
					screen =3;
					}
				}
			}
		}
}
