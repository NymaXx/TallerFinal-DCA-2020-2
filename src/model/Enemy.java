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
		this.speed=3;
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
		this.posX-=this.speed;
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
		
		System.out.println("iswork");
		  
		
	}
	

}
