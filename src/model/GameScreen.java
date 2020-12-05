package model;

import processing.core.PApplet;
import processing.core.PImage;

public class GameScreen implements Runnable{

	private PImage gameS;
	private PApplet app;
	private int posX;
	private int speed;
	
	
	GameScreen(int posX, int speed, PApplet app){
		posX=this.posX;
		speed=this.speed;
		app=this.app;
		gameS = app.loadImage("../images/Recurso 2-20.jpg");
	
	}
	
	
	public void paint() {
		app.image(gameS,this.posX,0);
		
	}
	
	@Override
	public void run() {
		this.posX+=this.speed;
	}
	
	public void moveToleft() {
		this.posX-=this.speed;
	}
	
	
	

}
