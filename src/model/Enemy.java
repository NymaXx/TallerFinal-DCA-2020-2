package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Enemy implements Runnable{

	private PImage enemy;
	private int posX;
	private int posY;
	private int w;
	private int h;
	private int speed;
	private PApplet app;
	public Enemy(int posX, int posY,int w, int h, PApplet app) {
		this.w=w;
		this.h=h;
		this.posX=posX;
		this.posY=posY;
		this.speed=1;
		this.app=app;
		this.enemy= app.loadImage("../images/enemy.png");
	}
	
	
	public void paint(){
		app.image(this.enemy, this.posX, this.posY,this.w, this.h);
		
		
	}
	
	public void moveR() {
		this.posX+=this.speed;
	}
	
	public void moveL() {
		if(app.keyPressed) {
			this.posX-=this.speed;
			}
	}


	@Override
	public void run() {
		try {
			 this.posX += (int)app.random(-5, 5);
			  this.posY += (int) app.random(-5, 5);
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
