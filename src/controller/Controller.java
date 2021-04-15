package controller;

import model.Logic;
import processing.core.PApplet;

public class Controller {
	Logic logic;
	PApplet app;
	
	public Controller(PApplet app) {
		this.app = app;
		logic = new Logic(app);
	}
	
	public void drawElements() {
		logic.drawElements();
	}
	
	public void selectElement() {
		logic.selectElement();
	}
	
	public void dragElement() {
		logic.dragElement();
	}
	
	public void releasedElement() {
		logic.releasedElement();
	}
	
	public void buttonToFinish() {
		logic.buttonToFinish();
	}
	
	public int interactionsCounter () {
		return logic.getInteractionsCounter();
	}
	
	public void newText () {
		logic.newTXT();
	}
}
