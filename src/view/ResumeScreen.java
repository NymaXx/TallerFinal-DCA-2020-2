package view;

import model.ToPaint;
import processing.core.PApplet;
import processing.core.PImage;

public class ResumeScreen implements ToPaint {
		
	
	private PImage res;
	private PApplet app;
	private StartScreen start;
	
	
	
	public ResumeScreen(PApplet app) {
		this.app = app;
		this.res = app.loadImage("../images/resume-20.jpg");
			
		
	}
	
	public void paint() {
		app.image(this.res,0,0);
		app.fill(255);
		
	}
	
	public int changeScreen() {
		int screen=3;
		
		if(app.mouseX>540 && app.mouseX<721 &&app.mouseY>587 && app.mouseY<637) {
			screen=0;
		}
		return screen;
		
	}
}
