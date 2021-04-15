package model;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.core.PImage;

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
	PImage button;
	
	String[] loadText;
	ArrayList<String> storyWords;
	
	ArrayList<Element> selectWords;
	
	public Logic(PApplet app) {
		this.app = app;
		
		tadpole = new Tadpole (330, 355, app);	
		pants = new Pants (1135, 210, app);
		tie = new Tie (1135, 290, app);
		hat = new Hat (1135, 370, app);
		vest = new Vest (1135, 450, app);
		
		interactionsCounter = 0;
		button = app.loadImage("Button.png");
		
		
		loadText = app.loadStrings("../data/Story.txt");
		storyWords=new ArrayList<String>();
		
		for (int index = 0; index < loadText.length; index++) {
			String[] tempArray = loadText[index].split(" ");

			for (int j = 0; j < tempArray.length; j++) {
				storyWords.add(tempArray[j]);
			}
		}
	}
	
	public void drawElements() {
		app.imageMode(app.CENTER);
		for (String element : storyWords) {
			
		if(element.equals("Rinrin")) {
			tadpole.draw(app);
			System.out.println("Rinrin");
		}
		if(element.equals("pantalon")) {
			pants.draw(app);
				System.out.println("pantalón");
			}
		if(element.equals("Sombrero")) {
			hat.draw(app);
			System.out.println("sombrero");
		}
		if(element.equals("chupa")) {
			vest.draw(app);
			System.out.println("chupa");
		}
		if(element.equals("corbata")) {
			tie.draw(app);
			System.out.println("corbata");
		}
		}
		//app.println(interactionsCounter);
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
			interactionsCounter =0; 
			}
		}
		
		if (selPants == true){
			pants.posX = app.mouseX;
			pants.posY = app.mouseY;
			
			if(app.mouseX <= 750 && app.mouseY>=385){
				pants.setPosX(750);
				pants.setPosY(385);
				selPants = false;
				interactionsCounter =2; 
				}
		}
		
		if (selTie == true){
			tie.posX = app.mouseX;
			tie.posY = app.mouseY;
			
			if(app.mouseX <= 750 && app.mouseY<=310){
				tie.setPosX(750);
				tie.setPosY(318);
				selTie = false;
				interactionsCounter =3; 
				}
		}
		
		if (selHat == true){
			hat.posX = app.mouseX;
			hat.posY = app.mouseY;
			
			if(app.mouseX <= 750 && app.mouseY<=220){
				hat.setPosX(750);
				hat.setPosY(225);
				selHat = false;
				interactionsCounter =4; 
				}
		}
		
		if (selVest == true){
			vest.posX = app.mouseX;
			vest.posY = app.mouseY;
			
			if(app.mouseX <= 750 && app.mouseY<=310){
				vest.setPosX(750);
				vest.setPosY(320);
				selVest = false;
				interactionsCounter =5; 
				}
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
	
	public void buttonToFinish() {
		if (interactionsCounter==5) {
			app.image(button,1000,600);
		}
	}
	
	public int getInteractionsCounter() {
		return interactionsCounter;
	}
}
