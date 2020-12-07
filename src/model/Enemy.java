package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Enemy {

	private PImage enemy;
	private int posX;
	private int posY;
	private int speed;
	private PApplet app;
	public Enemy(int posX, int posY, PApplet app) {
		this.posX=posX;
		this.posY=posY;
		this.speed=3;
		this.app=app;
		this.enemy= app.loadImage("../images/enemy.png");
	}
	
	
	public void paint(){
		app.image(this.enemy, this.posX, this.posY);
		
		
	}
	
	public void moveR() {
		this.posX+=this.speed;
	}
	public void moveL() {
		this.posX-=this.speed;
	}
	

}
