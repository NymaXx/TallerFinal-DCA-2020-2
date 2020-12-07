package view;

import java.util.ArrayList;

import model.BluePoint;
import model.Enemy;
import model.Plataform;
import processing.core.PApplet;
import processing.core.PImage;

public class GameScreen implements Runnable {

	private PImage gameS, t;
	private PApplet app;
	private int posX;
	private int speed;
	
	
	public GameScreen(int posX, PApplet app){
	
		this.posX=posX;
		this.app=app;
		this.speed=3;
		this.gameS = app.loadImage("../images/Recurso 2-20.jpg"); 
		this.t= app.loadImage("../images/TEXTS.png");
		
		
	}
	
	
	public void paint() {
		app.image(this.t, 0,0);
		app.image(this.gameS,0,0,3750,680);
		
	
		
	}
		
		
		
	
	
	@Override
	public void run() {
		this.posX+=this.speed;
	}
	
	public void moveToleft() {
		this.posX-=this.speed;
	}


	public PImage getGameS() {
		return gameS;
	}


	public void setGameS(PImage gameS) {
		this.gameS = gameS;
	}


	public PImage getT() {
		return t;
	}


	public void setT(PImage t) {
		this.t = t;
	}


	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	
	
	

}
