package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Charac implements Runnable{

	private int posX;
	private int posY;
	private int speedX;
	private int speedY;
	private int speedCaid;
	private int w;
	private int h;
	private int dir;
	private PImage anie;
	private PApplet app;
	
	public Charac(int posX,int posY,int speedX,int speedY, int w, int h,PApplet app){
		this.posX=posX;
		this.posY=posY;
		this.speedX=speedX;
		this.speedY=speedY;
		this.dir=1;
		this.app=app;
		this.speedCaid=15;
		
		this.anie= app.loadImage("../images/AnnIE.png");
		
	}
	
	public void paint() {
		app.stroke(255);
		app.image(this.anie, this.posX,this.posY);
		
		if(this.posY <= app.height-95 && !app.keyPressed) {
		this.dir=1;
		this.posY= this.posY+this.speedY*this.dir;
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		move();
		
	}
	
	public void move() {
		
		
		 switch(app.keyCode) {
		 
		 case PApplet.LEFT:
		 if(app.keyPressed && this.posX > 0) {
				this.posX-=this.speedX;
				}
		 break;
		 
		 case PApplet.RIGHT:
				if(app.keyPressed && this.posX < app.width*3/4) {
					this.posX+=this.speedX;
					}
				break;	
		 }
		 
		 if(app.keyPressed && app.keyCode==PApplet.UP) {
			 this.dir=-1;
			 this.posY= this.posY+this.speedY*this.dir;
		 }
		/*if(!app.keyPressed) {
				 this.dir=1;
			 }*/
	
		 
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

