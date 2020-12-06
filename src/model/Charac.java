package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Charac implements Runnable{

	private int posX;
	private int posY;
	private int speedX;
	private int speedY;
	private int dir;
	private PImage anie;
	private PApplet app;
	
	public Charac(int posX,int posY,int speedX,int speedY, int dir,PApplet app){
		this.posX=posX;
		this.posY=posY;
		this.speedX=speedX;
		this.speedY=speedY;
		this.dir=dir;
		this.app=app;
		
		this.anie= app.loadImage("../images/anie_1.png");
		
	}
	
	public void paint() {
		app.stroke(255);
		app.image(this.anie, this.posX,this.posY);
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		move();
		
	}
	
	public void move() {
		 switch(app.keyCode) {
		 
		 case PApplet.LEFT:
		 if(this.posX > 30 && this.posX <= 770) {
				this.posX-=this.speedX;
				}
		 break;
		 
		 case PApplet.RIGHT:
				if(this.posX >= 30 && this.posX < 770) {
					this.posX+=this.speedX;
					}
				break;
				
		 case PApplet.UP:
			 
			 break;
				
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


	public int getDir() {
		return dir;
	}

	public void setDir(int dir) {
		this.dir = dir;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

	public int getSpeedX() {
		return speedX;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public int getSpeedY() {
		return speedY;
	}

	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}
	
	
	
	

} 

