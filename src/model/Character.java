package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Character {

	private int posX;
	private int posY;
	private int speed;
	private int dir;
	private PImage anie;
	private PApplet app;
	
	Character(int posX,int posY,int speed, int dir,PApplet app){
		app= this.app;
		posX=this.posX;
		posY=this.posY;
		speed=this.speed;
		dir=this.dir;
		anie= app.loadImage("../images/anie_1.png");
		
	}


} 

