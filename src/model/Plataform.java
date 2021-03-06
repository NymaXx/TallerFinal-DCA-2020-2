package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Plataform implements ToPaint {
	
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
		this.speed=1;
		this.p=app.loadImage("../images/plataform.png");
		
	}
	
	public void paint(){
		app.image(this.p,this.posX, this.posY, this.w, this.h);
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

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
