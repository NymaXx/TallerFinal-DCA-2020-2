package view;

import processing.core.PApplet;
import processing.core.PImage;

public class Plataform {
	
	private int posX;
	private int posY;
	private int w;
	private int h;
	private PApplet app;
	private PImage p;
	
	public Plataform(int posX, int posY, int w, int h, PApplet app) {
		this.posX=posX;
		this.posY=posY;
		this.w=w;
		this.h=h;
		this.app=app;
		this.p=app.loadImage("../images/plataform.png");
		
	}
	
	public void paint(){
		app.image(this.p,this.posX, this.posY, this.w, this.h);
	}
}
