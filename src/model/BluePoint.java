package model;

import processing.core.PApplet;
import processing.core.PImage;

public class BluePoint {
	
	
	private PImage point;
	private int posX;
	private int posY;
	private int speed;
	private PApplet app;
	
	public BluePoint(int posX, int posY, int speed, PApplet app) {
		this.app=app;
		this.posX=posX;
		this.posY=posY;
		this.speed=3;
		this.point = app.loadImage("../images/point_1.png");
	}
	
	
	public void paint() {
		app.image(this.point, this.posX, this.posY);
	}

	
	public void moveR() {
		this.posX+=this.speed;
	}
	public void moveL() {
		this.posX-=this.speed;
	}
}
