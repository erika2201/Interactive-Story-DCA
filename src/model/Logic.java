package model;

import processing.core.PApplet;

public class Logic {

	PApplet app;
	Element tadpole;
	Element pants;
	Element tie;
	Element hat;
	Element vest;
	
	public Logic(PApplet app) {
		this.app = app;
		
		tadpole = new Tadpole (0, 0, app);	
		pants = new Pants (0, 0, app);
		tie = new Tie (0, 0, app);
		hat = new Hat (0, 0, app);
		vest = new Vest (0, 0, app);
	}
	
	public void selectElement () {
		//if (dist)
	}
	
}
