package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Plataform {
	
	private int posX;
	private int posY;
	private int w;
	private int h;
	private int speed;
	private PApplet app;
	private PImage p;
	
	public Plataform(int posX, int posY, int w, int h, PApplet app) {
		this.posX=posX;
		this.posY=posY;
		this.w=w;
		this.h=h;
		this.app=app;
		this.speed=3;
		this.p=app.loadImage("../images/plataform.png");
		
	}
	
	public void paint(){
		app.image(this.p,this.posX, this.posY, this.w, this.h);
	}
	
	public void moveR() {
		this.posX+=this.speed;
	}
	public void moveL() {
		this.posX-=this.speed;
	}
}
