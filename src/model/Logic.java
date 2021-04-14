package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {

	PApplet app;
	Element tadpole;
	Element pants;
	Element tie;
	Element hat;
	Element vest;
	
	boolean selTadpole;
	boolean selPants;
	boolean selTie;
	boolean selHat;
	boolean selVest;
	
	int interactionsCounter;
	
	String[] loadText;
	ArrayList<String> words;
	
	public Logic(PApplet app) {
		this.app = app;
		
		tadpole = new Tadpole (330, 355, app);	
		pants = new Pants (1135, 210, app);
		tie = new Tie (1135, 290, app);
		hat = new Hat (1135, 370, app);
		vest = new Vest (1135, 450, app);
		
		interactionsCounter = 0;
		
		words = new ArrayList<String>();
		loadText = app.loadStrings("../data/Story.txt");
	}
	
	public void drawElements() {
		app.imageMode(app.CENTER);
		tadpole.draw(app);
		pants.draw(app);
		hat.draw(app);
		vest.draw(app);
		tie.draw(app);
		app.imageMode(app.CORNER);
	}
	
	public void selectElement () {
		if (app.mouseX>293 && app.mouseX<366 &&
	  	  	app.mouseY>253 && app.mouseY<470) {
		  	selTadpole = true;
		}
		
		if (app.mouseX>1110 && app.mouseX<1160 &&
		  	app.mouseY>177 && app.mouseY<243) {
			selPants = true;
		}
		
		if (app.mouseX>1130 && app.mouseX<1140 &&
			app.mouseY>270 && app.mouseY<315) {
			selTie = true;
		}
		
		if (app.mouseX>1110 && app.mouseX<1160 &&
			app.mouseY>356 && app.mouseY<385) {
			selHat = true;
		}
		
		if (app.mouseX>1110 && app.mouseX<1160 &&
			app.mouseY>431 && app.mouseY<473) {
			selVest = true;
		}
		
	}
	
	public void dragElement () {
		if (selTadpole == true){
			tadpole.posX = app.mouseX;
			
			if(app.mouseX >= 750){
			tadpole.setPosX(750);
			selTadpole = false;
			interactionsCounter +=1; 
			}
		}
		
		if (selPants == true){
			pants.posX = app.mouseX;
			pants.posY = app.mouseY;
		}
		
		if (selTie == true){
			tie.posX = app.mouseX;
			tie.posY = app.mouseY;
		}
		
		if (selHat == true){
			hat.posX = app.mouseX;
			hat.posY = app.mouseY;
		}
		
		if (selVest == true){
			vest.posX = app.mouseX;
			vest.posY = app.mouseY;
		}
	}
	
	public void releasedElement() {
		if(interactionsCounter>=1) {
			selTadpole = false;
		}
		
		if(interactionsCounter>=2) {
			selPants = false;
		}
		if(interactionsCounter>=3) {
			selTie = false;
		}
		
		if(interactionsCounter>=4) {
			selHat = false;
		}
	
		if(interactionsCounter>=5) {
			selVest = false;
		}
	}
}
