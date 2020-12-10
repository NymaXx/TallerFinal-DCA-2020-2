package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Charac implements Runnable, ToPaint{

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
	private Boolean isCollide;
	
	public Charac(int posX,int posY,int speedX,int speedY, int w, int h,PApplet app){
		this.posX=posX;
		this.posY=posY;
		this.speedX=speedX;
		this.speedY=speedY;
		this.dir=1;
		this.app=app;
		this.speedCaid=19;
		this.h=h;
		this.w=w;
		this.isCollide=true;
		
		this.anie= app.loadImage("../images/AnnIE.png");
		
	}
	
	public void paint() {
		app.stroke(255);
		app.image(this.anie, this.posX,this.posY, this.w, this.h);
		
		if(!app.keyPressed && this.isCollide==true) {
		this.dir=1;
		this.posY= this.posY+this.speedCaid*this.dir;
		}
	}
	
	@Override
	public void run() {
		
		switch(app.keyCode) {
		 
		 case PApplet.LEFT:
		 if(app.keyPressed && this.posX > 0 ) {
				this.posX-=this.speedX;
				if(this.posY <= app.height-this.h && this.isCollide==true) {
				this.dir=1;
				this.posY= this.posY+this.speedCaid*this.dir;
				}
				
				}
		 break;
		 
		 case PApplet.RIGHT:
				if(app.keyPressed && this.posX < app.width*3/4 ) {      
					this.posX+=this.speedX;
					if(this.posY <= app.height-this.h && this.isCollide==true) {
						this.dir=1;
						this.posY= this.posY+this.speedCaid*this.dir;
						}
					}
				break;	
		 }
		 
		 if(app.keyPressed && app.keyCode==PApplet.UP) {
			 this.dir=-1;
			 this.posY= this.posY + this.speedY * this.dir;
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

	public Boolean getIsCollide() {
		return isCollide;
	}

	public void setIsCollide(Boolean isCollide) {
		this.isCollide = isCollide;
	}
	
	
	
	

} 

