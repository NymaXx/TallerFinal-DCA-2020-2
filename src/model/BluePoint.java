package model;

import processing.core.PApplet;
import processing.core.PImage;

public class BluePoint {
	
	
	private PImage point;
	private int posX;
	private int posY;
	private int speed;
	private int w;
	private int h;
	private PApplet app;
	
	public BluePoint(int posX, int posY, int w, int h, PApplet app) {
		this.app=app;
		this.posX=posX;
		this.posY=posY;
		this.speed=1;
		this.w=w;
		this.h=h;
		this.point = app.loadImage("../images/point_1.png");
	}
	
	
	public void paint() {
		app.image(this.point, this.posX, this.posY);
	}

	
	public void moveR() {
		this.posX+=this.speed;
	}
	
	public void moveL() {
		if(app.keyCode == PApplet.RIGHT) {
			if(app.keyPressed) {
			this.posX-=this.speed;
			}
		}
		
	}


	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getPosY() {
		return posY;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public int getW() {
		return w;
	}


	public void setW(int w) {
		this.w = w;
	}


	public int getH() {
		return h;
	}


	public void setH(int h) {
		this.h = h;
	}
	
	
	
}
