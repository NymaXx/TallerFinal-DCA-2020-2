package view;
import model.ToPaint;
import processing.core.PApplet;
import processing.core.PImage;

public class GameScreen implements Runnable, ToPaint {

	private PImage gameS, t;
	private PApplet app;
	private int posX;
	private int speed;
	
	
	public GameScreen(int posX, PApplet app){
	
		this.posX=posX;
		this.app=app;
		this.speed=1;
		this.gameS = app.loadImage("../images/Recurso 2-20.jpg"); 
		this.t= app.loadImage("../images/TEXTS.png");
		
		
	}
	
	@Override
	public void run() {
		app.image(this.t, 0,0);
		//se quito el fondo que era negro con degrade para evitar un retraso en todo el juego
		//app.image(this.gameS,0,0,1250,680);
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
