package view;

import model.ToPaint;
import processing.core.PApplet;
import processing.core.PImage;

public class InstScreen implements ToPaint {
	private PImage ins;
	private PApplet app;
	
	public InstScreen(PApplet app) {
		this.app=app;
		this.ins= app.loadImage("../images/instrucciones-20.jpg");
	}
	
	
	public void paint() {
		app.image(this.ins,0,0);
	}
	
	
	public int changeScreen() {
		int screen=2;
		
		if(app.mouseX>507 && app.mouseX<739 &&app.mouseY>559 && app.mouseY<610) {
			screen=1;
		}
		return screen;
		
	}
	
}
